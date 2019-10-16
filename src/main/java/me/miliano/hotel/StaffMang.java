package me.miliano.hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StaffMang extends javax.swing.JFrame {

	Connection con;
	Statement smt, smt1;
	ResultSet rs, rs1, rs2;
	String sid, spass, sfname, slname, sdesig, sadd;

	public StaffMang() {
		initComponents();
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				menu();
				System.out.println("Closed");
			}
		});
		this.setLocationRelativeTo(null);

		smt = new DB().getStmt();
		con = new DB().getConn();

		ini();
	}

	private void ini() {
		try {
			String query = "SELECT * FROM login ORDER BY userid;";
			rs = new SQLQuery(query).callRs();
			rs.next();
			displayRecord();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	private void menu() {

		Login l = new Login();
		NavigationFrame n = new NavigationFrame(l, Session.admin);
		n.setVisible(true);
		this.dispose();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel2 = new javax.swing.JPanel();
		jPanel1 = new javax.swing.JPanel();
		newBtn = new javax.swing.JButton();
		delBtn = new javax.swing.JButton();
		searchBtn = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		prev = new javax.swing.JButton();
		next = new javax.swing.JButton();
		last = new javax.swing.JButton();
		idField = new javax.swing.JTextField();
		passField = new javax.swing.JTextField();
		rePassField = new javax.swing.JTextField();
		desingnationField = new javax.swing.JTextField();
		fNameFiled = new javax.swing.JTextField();
		lNameField = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		addr = new javax.swing.JTextArea();
		jLabel9 = new javax.swing.JLabel();
		contractNo = new javax.swing.JTextField();
		userSearch = new javax.swing.JTextField();
		fNameSearch = new javax.swing.JTextField();
		lnameSearch = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jButton9 = new javax.swing.JButton();
		first = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});

		jPanel2.setBackground(new java.awt.Color(3, 84, 124));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED),
				"Staff Management Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

		newBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		newBtn.setText("New");
		newBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				newBtnActionPerformed(evt);
			}
		});

		delBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		delBtn.setText("Delete");
		delBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				delBtnActionPerformed(evt);
			}
		});

		searchBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		searchBtn.setText("Search");
		searchBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				searchBtnActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel2.setText("Enter User ID");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel3.setText("Enter Password");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel4.setText("Re Enter Password");

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel5.setText("Enter First Name");

		jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel6.setText("Enter Last Name");

		jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel7.setText("Enter Contact No.");

		jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel8.setText("Enter Address");

		prev.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		prev.setText("Previous <");
		prev.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				prevActionPerformed(evt);
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

		idField.setEditable(false);
		idField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

		passField.setEditable(false);
		passField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

		rePassField.setEditable(false);
		rePassField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

		desingnationField.setEditable(false);
		desingnationField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

		fNameFiled.setEditable(false);
		fNameFiled.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

		lNameField.setEditable(false);
		lNameField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

		addr.setEditable(false);
		addr.setColumns(20);
		addr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		addr.setRows(5);
		jScrollPane1.setViewportView(addr);

		jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel9.setText("Enter Designation");

		contractNo.setEditable(false);

		jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel10.setText("Search Specific Staff by his/ her");

		jLabel11.setText("User ID");

		jLabel12.setText("First Name");

		jLabel13.setText("Last Name");

		jButton9.setText("Close");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		first.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		first.setText("First <<");
		first.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				firstActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel5)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(fNameFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 194,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel2).addComponent(jLabel3).addComponent(jLabel4))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(idField, javax.swing.GroupLayout.DEFAULT_SIZE, 194,
														Short.MAX_VALUE)
												.addComponent(passField).addComponent(rePassField)))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel8)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										jPanel1Layout.createSequentialGroup().addComponent(jLabel9)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24,
														Short.MAX_VALUE)
												.addComponent(desingnationField, javax.swing.GroupLayout.PREFERRED_SIZE,
														194, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel6).addComponent(jLabel7))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(lNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 194,
														Short.MAX_VALUE)
												.addComponent(contractNo))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
										.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel10)
												.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup().addGap(8, 8, 8)
																.addComponent(jLabel13))
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel11).addComponent(jLabel12)))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jButton9)
																.addGroup(jPanel1Layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING,
																		false)
																		.addComponent(fNameSearch,
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(userSearch,
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(lnameSearch,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				135,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))))
										.addGap(6, 6, 6))
								.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(prev)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel1Layout.createSequentialGroup().addGap(10, 10, 10)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(delBtn).addComponent(newBtn,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 69,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addGap(24, 24, 24).addComponent(searchBtn))
														.addGroup(jPanel1Layout.createSequentialGroup().addGap(9, 9, 9)
																.addComponent(last,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 94,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))))
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		jPanel1Layout
				.setVerticalGroup(
						jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
												jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(prev).addComponent(first)).addGap(1, 1, 1)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(jPanel1Layout
																		.createSequentialGroup().addGap(27, 27, 27)
																		.addComponent(newBtn).addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(delBtn))
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addGroup(jPanel1Layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(next).addComponent(last))
																		.addGap(43, 43, 43).addComponent(searchBtn))))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3).addComponent(passField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4).addComponent(rePassField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(desingnationField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel9))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(fNameFiled,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5))))
										.addGap(12, 12, 12)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(jPanel1Layout
														.createSequentialGroup().addComponent(jLabel10)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(userSearch,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(fNameSearch,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel12))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		lnameSearch,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel13))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jButton9))
												.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																lNameField, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel6))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(contractNo,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel7).addComponent(jLabel11))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(jPanel1Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel8).addComponent(jScrollPane1,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 98,
																		javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(13, Short.MAX_VALUE)));

		jLabel1.setBackground(new java.awt.Color(3, 84, 124));
		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(74, 74, 74)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(75, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup().addContainerGap()
								.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(48, 48, 48)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		setSize(new java.awt.Dimension(740, 639));
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	// FETCH THE VALUES FROM DATABASE TO TEXT FIELDS AND TEXT AREA
	public final void displayRecord() {
		try {
			idField.setText(rs.getString(1));
			passField.setText(rs.getString(2));
			desingnationField.setText(rs.getString(3));
			fNameFiled.setText(rs.getString(4));
			lNameField.setText(rs.getString(5));
			addr.setText(rs.getString(6));
		} catch (Exception ec) {
		}
	}

	// ENABLE TEXT FIELDS AND AREA
	public void enableTextF() {
		idField.setEditable(true);
		passField.setEditable(true);
		rePassField.setEditable(true);
		desingnationField.setEditable(true);
		fNameFiled.setEditable(true);
		lNameField.setEditable(true);
		addr.setEditable(true);
	}

	// DISABLE TEXT FIELDS AND AREA
	public void disableTextF() {
		idField.setEditable(false);
		passField.setEditable(false);
		rePassField.setEditable(false);
		desingnationField.setEditable(false);
		fNameFiled.setEditable(false);
		lNameField.setEditable(false);
		addr.setEditable(false);
	}

	// CLEAR TEXT FIELDS AND AREA
	public void clearTextF() {
		try {
			System.out.println("Clear");
			idField.setText(null);
			passField.setText(null);
			desingnationField.setText(null);
			fNameFiled.setText(null);
			lNameField.setText(null);
			addr.setText(null);
		} catch (Exception ec) {
		}
	}

	// GET THE VALUES FROM TEXT FIELDS AND AREA
	public void fetchFromTextF() {
		sid = idField.getText();
		spass = passField.getText();
		sdesig = desingnationField.getText();
		sfname = fNameFiled.getText();
		slname = lNameField.getText();
		sadd = addr.getText();
		System.out.println("Set: " + sid + " " + spass);
	}

	// SEARCH STAFF RECORD
	private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchBtnActionPerformed
		disableTextF();
		String seaID = userSearch.getText();
		String seaFN = fNameSearch.getText();
		String seaLN = lnameSearch.getText();
		if (seaID.equals("") && seaFN.equals("") && seaLN.equals("")) {
			JOptionPane.showMessageDialog(this, "Select at least 1 option for search");
		} else {
			if ((!seaID.equals("")) && (!seaFN.equals("")) && (!seaLN.equals(""))) {
				try {
					String query = "SELECT * FROM login where userid LIKE '" + seaID + "' AND StaffFName LIKE '" + seaFN
							+ "' AND StaffLName LIKE '" + seaLN + "';";
					smt = con.createStatement();
					rs = smt.executeQuery(query);
					rs.next();
					displayRecord();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			} else if ((!seaID.equals("")) && (!seaFN.equals("")) && seaLN.equals("")) {
				try {
					String query = "SELECT * FROM login where userid LIKE '" + seaID + "' AND StaffFName LIKE '" + seaFN
							+ "';";
					smt = con.createStatement();
					rs = smt.executeQuery(query);
					rs.next();
					displayRecord();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			} else if ((!seaID.equals("")) && seaFN.equals("") && (!seaLN.equals(""))) {
				try {
					String query = "SELECT * FROM login where userid LIKE '" + seaID + "' AND StaffLName LIKE '" + seaLN
							+ "';";
					smt = con.createStatement();
					rs = smt.executeQuery(query);
					rs.next();
					displayRecord();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			} else if (seaID.equals("") && (!seaFN.equals("")) && (!seaLN.equals(""))) {
				try {
					String query = "SELECT * FROM login where StaffFName LIKE '" + seaFN + "' AND StaffLName LIKE '"
							+ seaLN + "';";
					smt = con.createStatement();
					rs = smt.executeQuery(query);
					rs.next();
					displayRecord();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			} else if ((!seaID.equals("")) && seaFN.equals("") && seaLN.equals("")) {
				try {
					String query = "SELECT * FROM login where userid LIKE '" + seaID + "';";
					smt = con.createStatement();
					rs = smt.executeQuery(query);
					rs.next();
					displayRecord();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			} else if (seaID.equals("") && (!seaFN.equals("")) && seaLN.equals("")) {
				try {
					String query = "SELECT * FROM login where StaffFName LIKE '" + seaFN + "';";
					smt = con.createStatement();
					rs = smt.executeQuery(query);
					rs.next();
					displayRecord();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			} else if (seaID.equals("") && seaFN.equals("") && (!seaLN.equals(""))) {
				try {
					String query = "SELECT * FROM login where StaffLName LIKE '" + seaLN + "';";
					smt = con.createStatement();
					rs = smt.executeQuery(query);
					rs.next();
					displayRecord();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}// GEN-LAST:event_searchBtnActionPerformed
		// MOVE ON LAST RECORD

	private void lastActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_lastActionPerformed
		try {
			rs.last();
			if (rs.isLast()) {
				rs.last();
			}
			displayRecord();
		} catch (Exception ex) {
		}
	}// GEN-LAST:event_lastActionPerformed
		// MOVE ON PREVIOUS RECORD

	private void prevActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_prevActionPerformed
		try {
			rs.previous();
			if (rs.isFirst()) {
				rs.first();
			}
			displayRecord();
		} catch (Exception ex) {
		}
	}// GEN-LAST:event_prevActionPerformed
		// MOVE ON FIRST RECORD

	private void firstActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_firstActionPerformed
		try {
			rs.first();
			if (rs.isFirst()) {
				rs.first();
			}
			displayRecord();
		} catch (Exception ex) {
		}
	}// GEN-LAST:event_firstActionPerformed
		// MOVE ON NEXT RECORD

	private void nextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nextActionPerformed
		try {
			rs.next();
			if (rs.isLast()) {
				rs.last();
			}
			displayRecord();
		} catch (Exception ex) {
		}
	}// GEN-LAST:event_nextActionPerformed
		// TOOL TIPS SETTING

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
		idField.setToolTipText("This is an Unique ID");
		rePassField.setToolTipText("Re Enter the same Password");
		searchBtn.setToolTipText("First select the option for searching");
		userSearch.setToolTipText("User ID is case sensitive");
		fNameSearch.setToolTipText("First Name is case sensitive");
		lnameSearch.setToolTipText("Last Name is case sensitive");
		delBtn.setToolTipText("Current Selected Staff Record will be DELETED");
		jButton9.setToolTipText("Close Window");
	}// GEN-LAST:event_formWindowOpened

	private boolean newUserValid() {
		if (!passField.getText().equals(rePassField.getText())) {
			return false;
		}
		if (passField.getText().equals("") || rePassField.getText().equals("")) {
			return false;
		}

		return true;
	}

//ADD RECORD OF STAFF
	private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_newBtnActionPerformed

		if (evt.getActionCommand().equals("Save")) {
			sid = idField.getText();
			spass = passField.getText();
			fetchFromTextF();
			if (newUserValid()) { // validation

				try {

					String query = "SELECT * FROM login where userid like '" + sid + "';";
					smt = con.createStatement();
					rs1 = smt.executeQuery(query);
					if (idField.getText() != null && !rs1.next()) {
						try {

							int code = JOptionPane.showConfirmDialog(this,
									"Information of " + sid + " will be added in database.", "Confirmation",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
							if (code == JOptionPane.YES_OPTION) {

								String insertquery = "insert into login (userid,password,designation,firstName,lastName,address) values('"
										+ sid + "','" + spass + "','" + desingnationField.getText() + "','"
										+ fNameFiled.getText() + "','" + lNameField.getText() + "','" + addr.getText()
										+ "');";

								smt = con.createStatement();
								int success = smt.executeUpdate(insertquery);
								if (success > 0) {
									JOptionPane.showMessageDialog(this, "Record Saved");
									newBtn.setText("New");
									clearTextF();
									displayRecord();
									enaBtns(next, prev, first, last, delBtn, searchBtn);
									disableTextF();
									menu();

								} else {
									JOptionPane.showMessageDialog(this, "Problem in Saving. Retry");
								}
							}

						} catch (Exception ex) {
							ex.printStackTrace();
						}
					} else {
						JOptionPane.showMessageDialog(this, "User ID already taken, Give another User ID, not null");
					}
				} catch (Exception ex) {
					System.out.println("try after valid");
					ex.printStackTrace();
				}
			} else {// validation
				new ErrDialog(this, "Wrong inputs, check all fields");
			}
		} else if (evt.getActionCommand().equals("New")) {
			idField.setText("");
			passField.setText("");
			desingnationField.setText("");
			fNameFiled.setText("");
			clearTextF();
			enableTextF();
			disableBtns(next, prev, first, last, delBtn, searchBtn);
			newBtn.setText("Save");

		}

	}// GEN-LAST:event_newBtnActionPerformed

	private void disableBtns(JButton... bt) {
		for (JButton b : bt) {
			b.setEnabled(false);
		}
	}

	private void enaBtns(JButton... bt) {
		for (JButton b : bt) {
			b.setEnabled(true);
		}
	}
//DELETE RECORD OF STAFF

	private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_delBtnActionPerformed
		try {
			fetchFromTextF();
			if (evt.getActionCommand().equals("Delete")) {

				if (true) {
					int code = JOptionPane.showConfirmDialog(this,
							"Information of " + sid + " will be deleted from database.", "Confirmation",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

					if (code == JOptionPane.YES_OPTION) {
						System.out.println("Delete");
						String updatequery = "DELETE from login where userid like '" + sid + "';";
						smt = con.createStatement();
						System.out.println("Staff id: " + sid);
						int success = smt.executeUpdate(updatequery);
						if (success > 0) {
							JOptionPane.showMessageDialog(this, "Record Deleted");
							menu();
							newBtn.setText("Delete");
						} else {

							JOptionPane.showMessageDialog(this, "Problem in deletion. Retry");
						}
					} else {
						System.out.println("Else int=success");
					}
				} else {
					new ErrDialog(this, "Password don't match.");
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}// GEN-LAST:event_delBtnActionPerformed
		// CLOSE BUTTON

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton9ActionPerformed
		menu();
		System.out.println("Closed");
		this.dispose();
	}// GEN-LAST:event_jButton9ActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextArea addr;
	private javax.swing.JTextField contractNo;
	private javax.swing.JButton delBtn;
	private javax.swing.JTextField desingnationField;
	private javax.swing.JTextField fNameFiled;
	private javax.swing.JTextField fNameSearch;
	private javax.swing.JButton first;
	private javax.swing.JTextField idField;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField lNameField;
	private javax.swing.JButton last;
	private javax.swing.JTextField lnameSearch;
	private javax.swing.JButton newBtn;
	private javax.swing.JButton next;
	private javax.swing.JTextField passField;
	private javax.swing.JButton prev;
	private javax.swing.JTextField rePassField;
	private javax.swing.JButton searchBtn;
	private javax.swing.JTextField userSearch;
	// End of variables declaration//GEN-END:variables
}
