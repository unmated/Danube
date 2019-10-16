package me.miliano.hotel;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Availability extends javax.swing.JFrame {

	/**
	 * Creates new form Availability
	 */
	int ageDays;

	Connection con;
	Statement stmt, smt1;
	ResultSet rs;
	java.util.Date dt1, dt2, now;
	public Object obj1, obj2, obj3, obj4, obj5, obj6;
	String diffday;
	private boolean rowSelected;

	public Availability() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				// System.exit(0);
				NavigationFrame n = new NavigationFrame(new Login(), Session.admin);
				n.setVisible(true);
				System.out.println("Closed");
			}
		});

		arrivalChoser.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				untilChoser.setDate(arrivalChoser.getDate());
				System.out.println("day changed");
			}
		});

		try {
			con = new DB().getConn();

			arrivalChoser.setDate(Calendar.getInstance().getTime());
			untilChoser.setDate(Calendar.getInstance().getTime());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jCalendar1 = new com.toedter.calendar.JCalendar();
		jPanel2 = new javax.swing.JPanel();
		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel9 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		bookRoomBtn = new javax.swing.JButton();
		jLabel10 = new javax.swing.JLabel();
		daysField = new javax.swing.JTextField();
		closeBtn = new javax.swing.JButton();
		checkRoomBtn = new javax.swing.JButton();
		arrivalChoser = new com.toedter.calendar.JDateChooser();
		untilChoser = new com.toedter.calendar.JDateChooser();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Availibilty Checking Form");
		setLocationByPlatform(true);
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}

			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});

		jPanel2.setBackground(new java.awt.Color(3, 84, 124));

		jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Room No.", "Room Type", "Bed Type", "Tariff Per Room" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jTable1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		jTable1.getTableHeader().setReorderingAllowed(false);
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);
		if (jTable1.getColumnModel().getColumnCount() > 0) {
			jTable1.getColumnModel().getColumn(0).setResizable(false);
			jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
			jTable1.getColumnModel().getColumn(1).setResizable(false);
			jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
			jTable1.getColumnModel().getColumn(2).setResizable(false);
			jTable1.getColumnModel().getColumn(2).setPreferredWidth(70);
			jTable1.getColumnModel().getColumn(3).setResizable(false);
			jTable1.getColumnModel().getColumn(3).setPreferredWidth(90);
		}

		jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 560, 241));

		jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jLabel9.setText("List of Availabale Room");
		jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel3.setText("Arrival Date");
		jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

		bookRoomBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		bookRoomBtn.setText("Book Room");
		bookRoomBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bookRoomBtnActionPerformed(evt);
			}
		});
		jPanel1.add(bookRoomBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 110, -1));

		jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel10.setText("Booking for");
		jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

		daysField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		daysField.setEnabled(false);
		daysField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				daysFieldActionPerformed(evt);
			}
		});
		jPanel1.add(daysField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 75, 20));

		closeBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		closeBtn.setText("Close");
		closeBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				closeBtnActionPerformed(evt);
			}
		});
		jPanel1.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 110, -1));

		checkRoomBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		checkRoomBtn.setText("Check Room");
		checkRoomBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkRoomBtnActionPerformed(evt);
			}
		});
		jPanel1.add(checkRoomBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 110, -1));
		jPanel1.add(arrivalChoser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 200, 30));
		jPanel1.add(untilChoser, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 210, -1));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(123, 123, 123).addComponent(jLabel1)))
						.addContainerGap(22, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup().addContainerGap(50, Short.MAX_VALUE)
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(17, 17, 17)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	static final long ONE_HOUR = 60 * 60 * 1000L;

	private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_closeBtnActionPerformed
		Login l = new Login();
		NavigationFrame n = new NavigationFrame(l, Session.admin);
		n.setVisible(true);
		System.out.println("Closed");
		this.dispose();

	}// GEN-LAST:event_closeBtnActionPerformed

	private boolean valid() {

		if ((dt1.getTime() + 60 * 60 * 12 < now.getTime()) && (now.getTime() - dt1.getTime()) > 86400000) {
			// System.out.println("Check "+((now.getTime()-dt1.getTime())/(60*60*1000)>12));
			return false;
		}
		if (dt2.getTime() < dt1.getTime()) {
			untilChoser.setDate(dt1);
		}

		return true;
	}

//CHECKS THE RROM AVAILIBILITY AFTER ENTERING DATES 
	private void checkRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_checkRoomBtnActionPerformed
		rowSelected = false;
		dt1 = arrivalChoser.getDate();
		dt2 = untilChoser.getDate();
		now = Calendar.getInstance().getTime();

		System.out.println("Validation method: " + valid());
		if (valid()) {

			final Object[] columnNames = new String[] { "Room No.", "Room Type", "Bed Type", "Tariff Per Room" };
			DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);

			long diff = ((dt2.getTime() - dt1.getTime() + ONE_HOUR) / (ONE_HOUR * 24));
			System.out.println("dt1 : " + (dt1.getTime() + " \ndt2 : " + dt2.getTime() + "\nnow : " + now.getTime()));
			diffday = Long.toString(diff);
			daysField.setText(diffday + "  day(s)");
			System.out.println(diff);
			if (diff >= 0) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String strdtver1 = (String) sdf.format(arrivalChoser.getDate());
				String strdtver2 = (String) sdf.format(untilChoser.getDate());
				String sql = "SELECT room_no, room_type, room_bed, room_rate FROM roomdetail "
						+ "where room_no NOT IN (SELECT room_no FROM bookingtable WHERE DATE(date_to) >= '" + strdtver1
						+ "' AND DATE(date_fro) <= '" + strdtver2 + "');";

				try {
					smt1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
					rs = smt1.executeQuery(sql);
					int i = 0;
					while (rs.next()) {
						String var1 = rs.getString(1);
						String var2 = rs.getString(2);
						String var3 = rs.getString(3);
						String var4 = Integer.toString(rs.getInt(4));

						dtm.addRow(new Vector());
						dtm.setValueAt(var1, i, 0);
						dtm.setValueAt(var2, i, 1);
						dtm.setValueAt(var3, i, 2);
						dtm.setValueAt(var4, i, 3);
						i++;
					}
					jTable1.setModel(dtm);

				} catch (Exception ex) {
					System.out.println(ex.getMessage());
					ex.printStackTrace();
				}

			} else {
				new ErrDialog(this, "Date error");
			}

		} else {
			new ErrDialog(this, "Select Date");
		}

	}// GEN-LAST:event_checkRoomBtnActionPerformed

	public Object GetData(JTable jTable1, int row_index, int col_index) {
		return jTable1.getModel().getValueAt(row_index, col_index);
	}

	// OPENS THE BOOKING FRAME FOR BOOKING CONFIRMATION
	private void bookRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bookRoomBtnActionPerformed

		if (rowSelected) {
			BookRoom br = new BookRoom(obj1, obj2, obj3, obj4, dt1, dt2, diffday);
			br.setVisible(true);
			this.setVisible(false);
		} else {
			new ErrDialog(this, "Please select a room");

		}

	}// GEN-LAST:event_bookRoomBtnActionPerformed

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable1MouseClicked
		int rno = jTable1.getSelectedRow();

		obj1 = GetData(jTable1, rno, 0);
		obj2 = GetData(jTable1, rno, 1);
		obj3 = GetData(jTable1, rno, 2);
		obj4 = GetData(jTable1, rno, 3);

		obj5 = dt1;
		obj6 = dt2;
		rowSelected = true;
	}// GEN-LAST:event_jTable1MouseClicked

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
		jPanel1.setOpaque(true);
		jLabel9.setOpaque(true);
		jTable1.setToolTipText("Select the Room want to reserve");
		bookRoomBtn.setToolTipText("Select the Room from the list and click this button for Room Booking");
	}// GEN-LAST:event_formWindowOpened

	private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing

	}// GEN-LAST:event_formWindowClosing

	private void daysFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_daysFieldActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_daysFieldActionPerformed

	/**
	 * @param args the command line arguments
	 *
	 *             public static void main(String args[]) {
	 *             java.awt.EventQueue.invokeLater(new Runnable() {
	 *
	 *             public void run() { new Availability().setVisible(true); } }); }
	 */
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private com.toedter.calendar.JDateChooser arrivalChoser;
	private javax.swing.JButton bookRoomBtn;
	private javax.swing.JButton checkRoomBtn;
	private javax.swing.JButton closeBtn;
	private javax.swing.JTextField daysField;
	private com.toedter.calendar.JCalendar jCalendar1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	public javax.swing.JTable jTable1;
	private com.toedter.calendar.JDateChooser untilChoser;
	// End of variables declaration//GEN-END:variables
}
