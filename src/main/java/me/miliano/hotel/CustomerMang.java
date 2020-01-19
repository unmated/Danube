package me.miliano.hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
public class CustomerMang extends javax.swing.JFrame {

	Connection con;
	Statement smt, smt1;
	SimpleDateFormat sdf;
	ResultSet rs, rs1, rs2, rss, rsDate;
	String ccno, cname, cadd, ccity, cstate, ccount, cph, cproof, cadult, ckid, cmar, cprno, cnation, cpurp, cbamt,
			cbid, from, to;

	public CustomerMang() {
		initComponents();
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				Login l = new Login();
				NavigationFrame n = new NavigationFrame(l, Session.role);
				n.setVisible(true);
				System.out.println("Closed");
			}
		});
		this.setLocationRelativeTo(null);
		disableTextF();
		sdf = new SimpleDateFormat("dd-MMM-yyyy");

		try {
			String query = "SELECT * FROM custdetail ORDER BY Cust_id_no;";
			String queryy = "SELECT room_no FROM custdetail,bookingtable where custdetail.book_id=bookingtable.book_id;";
			String date = "SELECT date_fro, date_to FROM custdetail,bookingtable where custdetail.book_id=bookingtable.book_id;";
			rs = new SQLQuery(query).callRs();
			rss = new SQLQuery(queryy).callRs();
			rsDate = new SQLQuery(date).callRs();
			rs.next();
			rss.next();
			rsDate.next();
			displayRecord();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new JPanel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();
		jLabel5 = new JLabel();
		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		jLabel8 = new JLabel();
		jLabel9 = new JLabel();
		jLabel10 = new JLabel();
		jLabel11 = new JLabel();
		jLabel12 = new JLabel();
		jLabel13 = new JLabel();
		jLabel14 = new JLabel();
		jLabel15 = new JLabel();
		jLabel16 = new JLabel();
		nameField = new JTextField();
		addrField = new JTextField();
		cityField = new JTextField();
		statField = new JTextField();
		countryField = new JTextField();
		phoneField = new JTextField();
		idPtoofField = new JTextField();
		idNumField = new JTextField();
		jTextField9 = new JTextField();
		jTextField10 = new JTextField();
		jTextField11 = new JTextField();
		jTextField12 = new JTextField();
		jTextField13 = new JTextField();
		jTextField14 = new JTextField();
		jTextField15 = new JTextField();
		jLabel17 = new JLabel();
		jLabel18 = new JLabel();
		arrField = new JTextField();
		departureField = new JTextField();
		first = new JButton();
		next = new JButton();
		last = new JButton();
		previous = new JButton();
		jLabel25 = new JLabel();
		jLabel26 = new JLabel();
		visitorNoField = new JLabel();
		jLabel28 = new JLabel();
		roomNoField = new JLabel();
		logoLabel = new JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setResizable(false);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED),
				"Visitor Management Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

		jLabel2.setText("Visitor Name");

		jLabel3.setText("Visitor Address");

		jLabel4.setText("Visitor City");

		jLabel5.setText("Visitor State");

		jLabel6.setText("Visitor Country");

		jLabel7.setText("Visitor Phone");

		jLabel8.setText("Visitor ID Proof");

		jLabel9.setText("Visitor ID Proof Number");

		jLabel10.setText("Visitor Marital Status");

		jLabel11.setText("No. of Adult(s) with visitor");

		jLabel12.setText("No. of Child(ren) with visitor");

		jLabel13.setText("Visitor Nationality");

		jLabel14.setText("Purpose of visit");

		jLabel15.setText("Bill Amount");

		jLabel16.setText("Booking ID");

		jLabel17.setText("Arrival");

		jLabel18.setText("Departure");

		first.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		first.setText("First <<");
		first.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				firstActionPerformed(evt);
			}
		});

		next.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		next.setText("Next >");
		next.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nextActionPerformed(evt);
			}
		});

		last.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		last.setText("Last >>");
		last.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				lastActionPerformed(evt);
			}
		});

		previous.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		previous.setText("Previous <");
		previous.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				previousActionPerformed(evt);
			}
		});

		jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

		jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jLabel26.setText("Visitor No.");

		visitorNoField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

		jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jLabel28.setText("Room No.");

		roomNoField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel2).addComponent(jLabel3).addComponent(jLabel4)
										.addComponent(jLabel5).addComponent(jLabel6).addComponent(jLabel7)
										.addComponent(jLabel8).addComponent(jLabel9).addComponent(jLabel10)
										.addComponent(jLabel13).addComponent(jLabel11).addComponent(jLabel12)
										.addComponent(jLabel14).addComponent(jLabel16).addComponent(jLabel15))
								.addGap(18, 18, 18)
								.addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(nameField).addComponent(addrField).addComponent(cityField)
										.addComponent(statField).addComponent(countryField).addComponent(phoneField)
										.addComponent(idPtoofField)
										.addComponent(idNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(
												jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 99,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(
										jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout
																.createSequentialGroup().addGap(122, 122, 122)
																.addComponent(jLabel25))
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addGap(48, 48, 48).addGroup(jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addGroup(jPanel1Layout.createSequentialGroup()
																				.addGap(38, 38, 38).addComponent(
																						jLabel17)
																				.addGap(89, 89, 89)
																				.addComponent(jLabel18))
																		.addGroup(jPanel1Layout
																				.createSequentialGroup()
																				.addGroup(jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(next,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								91,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(arrField,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								120,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(previous))
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addGroup(jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(departureField,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								120,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(first,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								91,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								last,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								91,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))))
														.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
														.createSequentialGroup()
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70,
																Short.MAX_VALUE)
														.addComponent(jLabel26)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(visitorNoField,
																javax.swing.GroupLayout.PREFERRED_SIZE, 51,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18).addComponent(jLabel28)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(roomNoField,
																javax.swing.GroupLayout.PREFERRED_SIZE, 51,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(51, 51, 51)))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(addrField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(statField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel6)
												.addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7)
												.addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel25)))
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(visitorNoField, javax.swing.GroupLayout.PREFERRED_SIZE,
														15, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(roomNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel8).addComponent(idPtoofField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel9).addComponent(idNumField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel17).addComponent(jLabel18))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(arrField, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(departureField, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel10).addComponent(jTextField9,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel13)
								.addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(next).addComponent(first))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel11)
								.addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(previous).addComponent(last))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel12).addComponent(jTextField12,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel14).addComponent(jTextField13,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel16).addComponent(jTextField14,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel15).addComponent(jTextField15,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		logoLabel.setBackground(new java.awt.Color(3, 84, 124));
		logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
		logoLabel.setOpaque(true);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 779,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap()
						.addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void previousActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_previousActionPerformed
		try {
			rsDate.previous();
			if (rsDate.isFirst()) {
				rsDate.first();
			}
			displayRecord();
		} catch (Exception ex) {
		}
		try {
			rs.previous();
			if (rs.isFirst()) {
				rs.first();
			}
			displayRecord();
		} catch (Exception ex) {
		}
		try {
			rss.previous();
			if (rss.isFirst()) {
				rss.first();
			}
			displayRecord();
		} catch (Exception ex) {
		}
	}// GEN-LAST:event_previousActionPerformed

	private void lastActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_lastActionPerformed
		try {
			rsDate.last();
			if (rsDate.isLast()) {
				rsDate.last();
			}
			displayRecord();
		} catch (Exception ex) {
		}
		try {
			rs.last();
			if (rs.isLast()) {
				rs.last();
			}
			displayRecord();
		} catch (Exception ex) {
		}
		try {
			rss.last();
			if (rss.isLast()) {
				rss.last();
			}
			displayRecord();
		} catch (Exception ex) {
		}
	}// GEN-LAST:event_lastActionPerformed

	private void nextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nextActionPerformed
		try {
			rsDate.next();
			if (rsDate.isLast()) {
				rsDate.last();
			}
			displayRecord();
		} catch (Exception ex) {
		}
		try {
			rs.next();
			if (rs.isLast()) {
				rs.last();
			}
			displayRecord();
		} catch (Exception ex) {
		}
		try {
			rss.next();
			if (rss.isLast()) {
				rss.last();
			}
			displayRecord();
		} catch (Exception ex) {
		}

	}// GEN-LAST:event_nextActionPerformed

	private void firstActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_firstActionPerformed
		try {
			rsDate.first();
			if (rsDate.isFirst()) {
				rsDate.first();
			}
			displayRecord();
		} catch (Exception ex) {
		}
		try {
			rs.first();
			if (rs.isFirst()) {
				rs.first();
			}
			displayRecord();
		} catch (Exception ex) {
		}
		try {
			rss.first();
			if (rss.isFirst()) {
				rss.first();
			}
			displayRecord();
		} catch (Exception ex) {
		}
	}// GEN-LAST:event_firstActionPerformed
		// FETCH THE VALUES FROM DATABASE TO TEXT FIELDS AND TEXT AREA

	public final void displayRecord() {
		try {
			java.sql.Date dtfrom = rsDate.getDate("date_fro");
			java.sql.Date dtto = rsDate.getDate("date_to");
			from = sdf.format(dtfrom.getTime());
			to = sdf.format(dtto.getTime());
			arrField.setText(from);
			departureField.setText(to);
			roomNoField.setText(String.valueOf(rss.getInt(1)));
			visitorNoField.setText(Integer.toString(rs.getInt(1)));
			nameField.setText(rs.getString(2));
			addrField.setText(rs.getString(3));
			cityField.setText(rs.getString(4));
			statField.setText(rs.getString(5));
			countryField.setText(rs.getString(6));
			phoneField.setText(rs.getString(7));
			idPtoofField.setText(rs.getString(8));
			idNumField.setText(rs.getString(12));
			jTextField9.setText(rs.getString(11));
			jTextField10.setText(rs.getString(13));
			jTextField11.setText(rs.getString(9));
			jTextField12.setText(rs.getString(10));
			jTextField13.setText(rs.getString(14));
			jTextField14.setText(Integer.toString(rs.getInt(16)));
			jTextField15.setText(Integer.toString(rs.getInt(15)));
		} catch (Exception ec) {
		}
	}

	// GET THE VALUES FROM TEXT FIELDS AND AREA
	public void fetchFromTextF() {
		cname = nameField.getText();
		cadd = addrField.getText();
		ccity = cityField.getText();
		cstate = statField.getText();
		ccount = countryField.getText();
		cph = phoneField.getText();
		cproof = idPtoofField.getText();
		cadult = jTextField11.getText();
		ckid = jTextField12.getText();
		cmar = jTextField9.getText();
		cprno = idNumField.getText();
		cnation = jTextField10.getText();
		cpurp = jTextField13.getText();
		cbid = jTextField14.getText();
		cbamt = jTextField15.getText();
	}

	// DISABLE TEXT FIELDS AND AREA
	private void disableTextF() {
		nameField.setEditable(false);
		addrField.setEditable(false);
		cityField.setEditable(false);
		statField.setEditable(false);
		countryField.setEditable(false);
		phoneField.setEditable(false);
		idPtoofField.setEditable(false);
		idNumField.setEditable(false);
		jTextField9.setEditable(false);
		jTextField10.setEditable(false);
		jTextField11.setEditable(false);
		jTextField12.setEditable(false);
		jTextField13.setEditable(false);
		jTextField14.setEditable(false);
		jTextField15.setEditable(false);
		arrField.setEditable(false);
		departureField.setEditable(false);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JPanel jPanel1;
	private JLabel logoLabel,roomNoField,visitorNoField;
	private JButton first,last,next,previous;
	private JLabel jLabel9,jLabel8,jLabel7,jLabel6,jLabel5,jLabel4,jLabel3,jLabel28,jLabel26,jLabel25,jLabel2,jLabel18,
				   jLabel17,jLabel16,jLabel15,jLabel14,jLabel13,jLabel12,jLabel11,jLabel10;
	private JTextField addrField,arrField,cityField,countryField,departureField,idNumField,idPtoofField,
					   nameField,phoneField,statField;
	private JTextField jTextField10,jTextField9,jTextField15,jTextField14,jTextField13,jTextField12,jTextField11;
	// End of variables declaration//GEN-END:variables
}
