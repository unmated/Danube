package me.miliano.hotel;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BookRoom extends javax.swing.JFrame {
	Connection con;
	Statement smt1, smt2, smt3;
	ResultSet rs;
	DateFormat formatter;
	String roomno, bed, roomt, rate, strdtver1, strdtver2;
	String cname, cadd, ccity, cstat, ccoun, cph, cproof;
	String cadult, cchild, cmars, cidno, cnation, cpur, cbill;
	String diffd;
	int amt, bookid;
	String dt1, dt2;

	/** Creates new form BookRoom */
	public BookRoom(Object o1, Object o2, Object o3, Object o4, Date o5, Date o6, String diff) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				Availability n = new Availability();
				n.setVisible(true);
				System.out.println("Closed");
			}
		});
		try {

			SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			roomno = o1.toString();
			bed = o2.toString();
			roomt = o3.toString();
			rate = o4.toString();
			strdtver1 = (String) sdf.format(o5.getTime());
			strdtver2 = (String) sdf.format(o6.getTime());
			Calendar c1 = Calendar.getInstance();
			c1.setTime(o5);
			dt1 = (String) sdf1.format(c1.getTime());
			Calendar c2 = Calendar.getInstance();
			c2.setTime(o6);
			dt2 = (String) sdf1.format(c2.getTime());
			con = new DB().getConn();
			smt1 = con.createStatement();
			if (Integer.parseInt(diff) == 0) {
				diffd = "1";
			} else {
				diffd = diff;
			}
		} catch (Exception ex) {

		}
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		custName = new javax.swing.JTextField();
		jLabel18 = new javax.swing.JLabel();
		address = new javax.swing.JTextField();
		jLabel19 = new javax.swing.JLabel();
		city = new javax.swing.JTextField();
		jLabel20 = new javax.swing.JLabel();
		contry = new javax.swing.JTextField();
		jLabel21 = new javax.swing.JLabel();
		phone = new javax.swing.JTextField();
		jLabel22 = new javax.swing.JLabel();
		nationality = new javax.swing.JTextField();
		jLabel23 = new javax.swing.JLabel();
		purp = new javax.swing.JTextField();
		jLabel24 = new javax.swing.JLabel();
		idProof = new javax.swing.JTextField();
		jLabel25 = new javax.swing.JLabel();
		idNUmber = new javax.swing.JTextField();
		jLabel26 = new javax.swing.JLabel();
		nrOfAdults = new javax.swing.JTextField();
		jLabel27 = new javax.swing.JLabel();
		nrOfMinors = new javax.swing.JTextField();
		jLabel29 = new javax.swing.JLabel();
		maritStatus = new javax.swing.JTextField();
		jLabel30 = new javax.swing.JLabel();
		priceArea = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel28 = new javax.swing.JLabel();
		nrDays = new javax.swing.JTextField();
		state = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Booking Form");
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});

		jPanel1.setBackground(new java.awt.Color(3, 84, 124));
		jPanel1.setForeground(new java.awt.Color(3, 84, 124));
		jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Customer Info",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Buxton Sketch", 1, 16), new java.awt.Color(223, 223, 255))); // NOI18N
		jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel16.setForeground(new java.awt.Color(255, 255, 255));
		jLabel16.setText("Address");
		jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

		jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel17.setForeground(new java.awt.Color(255, 255, 255));
		jLabel17.setText("Customer Name");
		jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
		jPanel2.add(custName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 180, -1));

		jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel18.setForeground(new java.awt.Color(255, 255, 255));
		jLabel18.setText("City");
		jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
		jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 180, -1));

		jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel19.setForeground(new java.awt.Color(255, 255, 255));
		jLabel19.setText("State");
		jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
		jPanel2.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 180, -1));

		jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel20.setForeground(new java.awt.Color(255, 255, 255));
		jLabel20.setText("Country");
		jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
		jPanel2.add(contry, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 180, -1));

		jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel21.setForeground(new java.awt.Color(255, 255, 255));
		jLabel21.setText("Phone");
		jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
		jPanel2.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 138, -1));

		jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel22.setForeground(new java.awt.Color(255, 255, 255));
		jLabel22.setText("Nationality");
		jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
		jPanel2.add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 138, -1));

		jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel23.setForeground(new java.awt.Color(255, 255, 255));
		jLabel23.setText("Purpose");
		jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));
		jPanel2.add(purp, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 130, -1));

		jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel24.setForeground(new java.awt.Color(255, 255, 255));
		jLabel24.setText("ID Proof");
		jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));
		jPanel2.add(idProof, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 133, -1));

		jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel25.setForeground(new java.awt.Color(255, 255, 255));
		jLabel25.setText("ID Number");
		jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));
		jPanel2.add(idNUmber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 133, -1));

		jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel26.setForeground(new java.awt.Color(255, 255, 255));
		jLabel26.setText("No of Adult");
		jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));
		jPanel2.add(nrOfAdults, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 80, -1));

		jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel27.setForeground(new java.awt.Color(255, 255, 255));
		jLabel27.setText("No of Minor");
		jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));
		jPanel2.add(nrOfMinors, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 80, -1));

		jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel29.setForeground(new java.awt.Color(255, 255, 255));
		jLabel29.setText("Marital Status");
		jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
		jPanel2.add(maritStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 138, -1));

		jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel30.setForeground(new java.awt.Color(204, 204, 0));
		jLabel30.setText("Bill (Inclusive tax 12%)");
		jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 140, -1));

		priceArea.setEnabled(false);
		jPanel2.add(priceArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 90, -1));

		jButton1.setText("Book Room");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, 30));

		jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel28.setForeground(new java.awt.Color(255, 255, 255));
		jLabel28.setText("No of days");
		jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

		nrDays.setEnabled(false);
		jPanel2.add(nrDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 80, -1));
		jPanel2.add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 180, -1));

		jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 510, 270));

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(0, 102, 0));
		jLabel3.setText("Room No.");
		jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel4.setText("Room No.");
		jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel5.setText("Room Type");
		jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(0, 102, 0));
		jLabel6.setText("Room Type");
		jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 90, -1));

		jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel7.setText("Bed Type");
		jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

		jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(0, 102, 0));
		jLabel8.setText("Bed Type");
		jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 100, -1));

		jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel9.setText("Tariff");
		jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

		jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel10.setForeground(new java.awt.Color(0, 102, 0));
		jLabel10.setText("Tariff");
		jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 90, -1));

		jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel11.setText("Check In");
		jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 60, -1));

		jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel12.setForeground(new java.awt.Color(0, 102, 0));
		jLabel12.setText("Check In");
		jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 110, -1));

		jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel13.setText("Check Out");
		jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 70, -1));

		jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel14.setForeground(new java.awt.Color(0, 102, 0));
		jLabel14.setText("Check Out");
		jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 110, -1));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
		jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 570, 220));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout
						.createSequentialGroup().addContainerGap().addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
		try {
			Color c = new Color(240, 153, 153);
			Color c1 = new Color(204, 0, 0);
			jPanel1.setBackground(c);

			jPanel2.setBackground(c1);
			String bidsql = "select book_id from bookingtable;";
			smt3 = con.createStatement();
			rs = smt3.executeQuery(bidsql);
			int row = 0;
			int bid = 0;
			while (rs.next()) {

				bid = rs.getInt(1);

				row++;
			}

			if (row == 0) {
				bid++;
			} else {
				rs.last();
				bid = rs.getInt(1);

				bid = bid + 1;

			}
			bookid = bid;
			jLabel3.setText(roomno);
			jLabel6.setText(bed);
			jLabel8.setText(roomt);
			jLabel10.setText(rate);
			jLabel12.setText(strdtver1);
			jLabel14.setText(strdtver2);

			nrDays.setText(diffd + " day(s)");
			int r = Integer.parseInt(rate);
			int day = Integer.parseInt(diffd);
			int tax = (r * day) * 12 / 100;
			amt = (r * day) + tax;
			priceArea.setText(Integer.toString(amt) + ".00");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}// GEN-LAST:event_formWindowOpened

	boolean userValidate(JTextField... fields) {
		boolean valid = true;
		for (JTextField fi : fields) {
			if (fi.getText().equals("")) {
				valid = false;
			}
		}

		return valid;
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		if (userValidate(custName, address, city, contry, phone, idProof, idNUmber, nrOfAdults, nrOfMinors, maritStatus,
				nationality, purp)) {
			try {
				cname = custName.getText();
				cadd = address.getText();
				ccity = city.getText();
				cstat = city.getText();
				ccoun = contry.getText();
				cph = phone.getText();
				cproof = idProof.getText();
				cadult = nrOfAdults.getText();
				cchild = nrOfMinors.getText();
				cmars = maritStatus.getText();
				cidno = idNUmber.getText();
				cnation = nationality.getText();
				cpur = purp.getText();
				int code = JOptionPane.showConfirmDialog(this,
						"Room No. " + roomno + " is booked for Mr./Ms. " + cname + " for " + "diffd..!", "Confirmation",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (code == JOptionPane.YES_NO_OPTION) {
					String insqlcust = "insert into custdetail (Cust_name,Cust_add,Cust_city,Cust_state,Cust_country,Cust_ph,Cust_proof,"
							+ "Cust_adult,Cust_child,Cust_mar_stat,Cust_id_no,Cust_nation,Cust_purpos,Cust_bill,book_id) "
							+ "values ('" + cname + "','" + cadd + "','" + ccity + "','" + cstat + "','" + ccoun + "','"
							+ cph + "','" + cproof + "','" + cadult + "','" + cchild + "','" + cmars + "','" + cidno
							+ "','" + cnation + "','" + cpur + "'," + amt + ",'" + bookid + "');";
					smt1 = con.createStatement();
					int ins = smt1.executeUpdate(insqlcust);
					String insqlbook = "insert into bookingtable (book_id,room_no,date_fro,date_to,no_of_day) values( '"
							+ bookid + "','" + roomno + "','" + dt1 + "','" + dt2 + "','" + diffd + "');";
					smt2 = con.createStatement();
					int ins1 = smt1.executeUpdate(insqlbook);

					int res = JOptionPane.showOptionDialog(this, "Room Booked", "Tesnnt", JOptionPane.DEFAULT_OPTION,
							JOptionPane.INFORMATION_MESSAGE, null, null, null);
					if (res == 0 || res == -1) {

						this.dispose();
						Availability avail = new Availability();
						avail.setVisible(true);

					}
				} else {

				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		} else {
			new ErrDialog(this, "Wrong input, make sure u filles all fields");
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextField address;
	private javax.swing.JTextField city;
	private javax.swing.JTextField contry;
	private javax.swing.JTextField custName;
	private javax.swing.JTextField idNUmber;
	private javax.swing.JTextField idProof;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JTextField maritStatus;
	private javax.swing.JTextField nationality;
	private javax.swing.JTextField nrDays;
	private javax.swing.JTextField nrOfAdults;
	private javax.swing.JTextField nrOfMinors;
	private javax.swing.JTextField phone;
	private javax.swing.JTextField priceArea;
	private javax.swing.JTextField purp;
	private javax.swing.JTextField state;
	// End of variables declaration//GEN-END:variables
}
