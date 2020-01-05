package me.miliano.hotel;

import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RoomMang extends javax.swing.JFrame {

	Connection con;
	Statement smt, smt1;
	ResultSet rs, rs1, rs2;
	String roomNo, roomType, roomBedType;
	private int roomRate;

	public RoomMang() {
		initComponents();
		disableTextF();
		this.setLocationRelativeTo(null);
		ini();
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				// System.exit(0);
				Login l = new Login();
				NavigationFrame n = new NavigationFrame(l, Session.role);
				n.setVisible(true);
				System.out.println("Closed");
			}
		});

	}

	public void ini() {

		try {
			con = new DB().getConn();
			smt = con.createStatement();

			String query = "SELECT * FROM roomdetail ORDER BY room_no;";
			rs = smt.executeQuery(query);
			rs.next();
			displayRecord();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	// FETCH THE VALUES FROM DATABASE TO TEXT FIELDS AND TEXT AREA
	public final void displayRecord() {
		try {
			roomNoField.setText(rs.getString(1));
			roomNo = rs.getString(1);
			roomTypeField.setText(rs.getString(2));
			roomType = rs.getString(2);
			roomRateField.setText(Integer.toString(rs.getInt(3)));
			roomRate = Integer.parseInt(rs.getString(3));
			roombedTypeField.setText(rs.getString(4));
			roomBedType = rs.getString(4);

		} catch (Exception ec) {
		}
	}

	// GET THE VALUES FROM TEXT FIELDS AND AREA
	public void fetchFromTextF() {
		System.out.println("Room rate fetched : " + String.valueOf(roomRateField.getText()));
		try {
			roomNo = roomNoField.getText();
			roomType = roomTypeField.getText();

			roomRate = Integer.parseInt(roomRateField.getText());
			roomBedType = roombedTypeField.getText();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Wrong inputs, fill all fields.");

		}
	}

	// DISABLE TEXT FIELDS AND AREA
	public void disableTextF() {
		roomNoField.setEditable(false);
		roomTypeField.setEditable(false);
		roomRateField.setEditable(false);
		roombedTypeField.setEditable(false);
	}

	// CLEAR TEXT FIELDS AND AREA
	public void clearTextF() {
		try {
			roomNoField.setText("");
			roomTypeField.setText("");
			roomRateField.setText("");
			roombedTypeField.setText("");
			System.out.println("CLEAR CLEAR CLEAR CLEAR CLEAR CLEAR CLEAR CLEAR CLEAR ");
		} catch (Exception ec) {
			System.out.println("CLEAR EXCEPTION");
			ec.printStackTrace();
		}
	}

	public static int getABORT() {
		return ABORT;
	}

	// ENABLE TEXT FIELDS AND AREA
	public void enableTextF() {
		roomNoField.setEditable(true);
		roomTypeField.setEditable(true);
		roomRateField.setEditable(true);
		roombedTypeField.setEditable(true);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		roomNoField = new javax.swing.JTextField();
		roomTypeField = new javax.swing.JTextField();
		firstBtn = new javax.swing.JButton();
		nextBtn = new javax.swing.JButton();
		lastBtn = new javax.swing.JButton();
		prevBtn = new javax.swing.JButton();
		roomRateField = new javax.swing.JTextField();
		roombedTypeField = new javax.swing.JTextField();
		searchBtn = new javax.swing.JButton();
		roomSearchField = new javax.swing.JTextField();
		new_saveBtn = new javax.swing.JButton();
		editBtn = new javax.swing.JButton();
		delBtn = new javax.swing.JButton();
		resetBtn = new javax.swing.JButton();
		logoLabel = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setResizable(false);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED),
				"Room Management Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel2.setText("Room No.");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel3.setText("<html>Room Type<br /> (Fumator/Ne)</html>");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel4.setText("Room Rate");

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel5.setText("<html>Bed Type <br/>(Single/Double)</html>");

		roomNoField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

		roomTypeField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

		firstBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		firstBtn.setText("First <<");
		firstBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				firstBtnActionPerformed(evt);
			}
		});

		nextBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		nextBtn.setText("Next >");
		nextBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nextBtnActionPerformed(evt);
			}
		});

		lastBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		lastBtn.setText("Last >>");
		lastBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				lastBtnActionPerformed(evt);
			}
		});

		prevBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		prevBtn.setText("Previous <");
		prevBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				prevBtnActionPerformed(evt);
			}
		});

		roomRateField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

		roombedTypeField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

		searchBtn.setText("Search");
		searchBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				searchBtnActionPerformed(evt);
			}
		});

		new_saveBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		new_saveBtn.setText("New");
		new_saveBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				new_saveBtnActionPerformed(evt);
			}
		});

		editBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		editBtn.setText("Edit");
		editBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				editBtnActionPerformed(evt);
			}
		});

		delBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		delBtn.setText("Delete");
		delBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				delBtnActionPerformed(evt);
			}
		});

		resetBtn.setText("Reset");
		resetBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				resetBtnActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4)).addGap(21, 21, 21)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(roomTypeField, javax.swing.GroupLayout.DEFAULT_SIZE, 70,
														Short.MAX_VALUE)
												.addComponent(roomNoField))
										.addComponent(roomRateField, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(new_saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(delBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 103,
												Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(3, 3, 3)
												.addComponent(prevBtn)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(lastBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(resetBtn))
										.addGroup(
												jPanel1Layout.createSequentialGroup()
														.addComponent(firstBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
																91, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(15, 15, 15)
														.addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
																91, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(searchBtn)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(roomSearchField,
																javax.swing.GroupLayout.PREFERRED_SIZE, 56,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(roombedTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(firstBtn)
								.addComponent(searchBtn)
								.addComponent(roomSearchField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(new_saveBtn).addComponent(nextBtn))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lastBtn).addComponent(editBtn).addComponent(prevBtn)
										.addComponent(resetBtn))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(delBtn))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel2).addComponent(roomNoField,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(roomTypeField, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel4).addComponent(roomRateField,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(roombedTypeField, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		logoLabel.setBackground(new java.awt.Color(3, 84, 124));
		logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
		logoLabel.setOpaque(true);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents
		// MOVE ON FIRST ROOM

	private void firstBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_firstBtnActionPerformed

		try {
			rs.first();
			if (rs.isFirst()) {
				rs.first();
			}
			displayRecord();
		} catch (SQLException ex) {
		}
	}// GEN-LAST:event_firstBtnActionPerformed
		// MOVE ON NEXT ROOM

	private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nextBtnActionPerformed

		try {
			rs.next();
			if (rs.isLast()) {
				rs.last();
			}
			displayRecord();
		} catch (Exception ex) {
		}
	}// GEN-LAST:event_nextBtnActionPerformed
		// MOVE ON LAST ROOM

	private void lastBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_lastBtnActionPerformed

		try {
			rs.last();
			if (rs.isLast()) {
				rs.last();
			}
			displayRecord();
		} catch (Exception ex) {
		}
	}// GEN-LAST:event_lastBtnActionPerformed
		// MOVE ON PREVIOUS ROOM

	private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_prevBtnActionPerformed

		try {
			rs.previous();
			if (rs.isFirst()) {
				rs.first();
			}
			displayRecord();
		} catch (Exception ex) {
		}
	}// GEN-LAST:event_prevBtnActionPerformed

	void windowClosing(WindowEvent e) {
		System.out.println("Closing");
	}

	private void clearData() {
		roomNo = "";
		roomType = "";
		roomBedType = "";
		roomRate = 0;
	}

//ADD NEW ROOM
	private void new_saveBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_new_saveBtnActionPerformed
		clearData();

		enableTextF();

		disBtn();

		if (evt.getActionCommand().equals("Save")) {
			fetchFromTextF();

			if (!validateFields()) {

				try {
					String query = "SELECT * FROM roomdetail where room_no like '" + roomNo + "';";
					smt = con.createStatement();
					rs1 = smt.executeQuery(query);
					// clearTextF();
					if (!rs1.next()) {
						try {

							int code = JOptionPane.showConfirmDialog(this,
									"Information of Room No." + roomNo + " will be added in database.", "Confirmation",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
							if (code == JOptionPane.YES_OPTION) {
								String insertquery = "insert into roomdetail(room_no,room_type,room_rate,room_bed)values('"
										+ roomNo + "','" + roomType + "'," + roomRate + ",'" + roomBedType + "');";
								smt = con.createStatement();
								int success = smt.executeUpdate(insertquery);
								if (success > 0) {
									JOptionPane.showMessageDialog(this, "Record Saved");
									new_saveBtn.setText("New");
									enBtn();
								} else {
									JOptionPane.showMessageDialog(this, "Problem in Saving. Retry");
								}
							}

						} catch (Exception ex) {
							new ErrDialog(this, "Room No. already used, Give another Room No.");

						}

					} else {
						JOptionPane.showMessageDialog(this, "Room No. already used, Give another Room No.");
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

		} else if (evt.getActionCommand().equals("New")) {
			clearTextF();
			editBtn.setEnabled(false);
			searchBtn.setEnabled(false);
			delBtn.setEnabled(false);
			new_saveBtn.setText("Save");

		}

	}// GEN-LAST:event_new_saveBtnActionPerformed

	private boolean validateFields() {
		System.out.println((roomNoField.getText().equals("") || roomTypeField.getText().equals("")
				|| roomRateField.getText().equals("") || roombedTypeField.getText().equals("")));

		return (roomNoField.getText().equals("") || roomTypeField.getText().equals("")
				|| roomRateField.getText().equals("") || roomRateField.getText().equals(""));
	}

//EDIT AND UPDATE EXISTING ROOM
	private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editBtnActionPerformed
		disBtn();
		try {
			if (evt.getActionCommand().equals("Update")) {
				fetchFromTextF();
				int code = JOptionPane.showConfirmDialog(this,
						"Information of Room No." + roomNo + " will change in database.", "Confirmation",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (code == JOptionPane.YES_OPTION) {
					String updatequery = "update roomdetail set room_type='" + roomType + "',room_rate=" + roomRate
							+ ",room_bed='" + roomBedType + "' where room_no = '" + roomNo + "';";
					smt = con.createStatement();
					int success = smt.executeUpdate(updatequery);
					if (success > 0) {
						JOptionPane.showMessageDialog(this, "Record Modified");
						new_saveBtn.setText("Edit");
						enBtn();
					} else {
						JOptionPane.showMessageDialog(this, "Problem in modifying. Retry");
					}
				} else {
				}
			} else if (evt.getActionCommand().equals("Edit")) {
				int code = JOptionPane.showConfirmDialog(this,
						"You are about to change the existing information of current selected room", "Confirmation",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (code == JOptionPane.YES_OPTION) {
					editBtn.setText("Update");
					enableTextF();
					fetchFromTextF();
					roomNoField.setEditable(false);

				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}// GEN-LAST:event_editBtnActionPerformed
		// DELETE EXISTING ROOM

	private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_delBtnActionPerformed

		try {
			if (evt.getActionCommand().equals("Confirm")) {
				fetchFromTextF();
				int code = JOptionPane.showConfirmDialog(this,
						"Room No" + roomNoField.getText() + " will be deleted from database.", "Confirmation",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (code == JOptionPane.YES_OPTION) {

					String updatequery = "DELETE from roomdetail where room_no = '" + roomNoField.getText() + "';";
					smt = con.createStatement();
					int success = smt.executeUpdate(updatequery);
					if (success > 0) {
						JOptionPane.showMessageDialog(this, "Record Deleted");
						delBtn.setText("Delete");
						enBtn();
					} else {
						JOptionPane.showMessageDialog(this, "Problem in deletion. Retry");
					}
				} else {
					enBtn();
				}
			} else if (evt.getActionCommand().equals("Delete")) {
				int code = JOptionPane.showConfirmDialog(this,
						"Your confirmation will delete the record of current selected room", "Confirmation",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (code == JOptionPane.YES_OPTION) {
					disBtn();
					new_saveBtn.setEnabled(false);
					editBtn.setEnabled(false);
					delBtn.setText("Confirm");
				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}// GEN-LAST:event_delBtnActionPerformed
		// SEARCH ROOM NO

	private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchBtnActionPerformed
		disableTextF();
		String srno = roomSearchField.getText();
		if (srno.toString().equals("")) {
			JOptionPane.showMessageDialog(this, "Enter Room No. you want to search");
		} else if (!srno.equals("")) {
			try {
				String query = "SELECT * FROM roomdetail where room_no LIKE '" + srno + "';";
				smt = con.createStatement();
				rs = smt.executeQuery(query);
				if (!rs.next()) {
					new ErrDialog(this, "Room not found.");
				}

				displayRecord();
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(this, "Please enter data");
			}
		}
	}// GEN-LAST:event_searchBtnActionPerformed

	private void enBtn() {
		ini();
		new_saveBtn.setEnabled(true);
		firstBtn.setEnabled(true);
		firstBtn.setEnabled(true);
		lastBtn.setEnabled(true);
		nextBtn.setEnabled(true);
		prevBtn.setEnabled(true);
		editBtn.setEnabled(true);
		editBtn.setText("Edit");
		searchBtn.setEnabled(true);
		delBtn.setEnabled(true);
		new_saveBtn.setText("New");
		delBtn.setText("Delete");
		roomSearchField.setText("");

		disableTextF();
		displayRecord();
	}

	private void disBtn() {
		firstBtn.setEnabled(false);
		lastBtn.setEnabled(false);
		nextBtn.setEnabled(false);
		prevBtn.setEnabled(false);
	}

	private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_resetBtnActionPerformed
		disableTextF();
		enBtn();

	}// GEN-LAST:event_resetBtnActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton delBtn;
	private javax.swing.JButton editBtn;
	private javax.swing.JButton firstBtn;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JButton lastBtn;
	private javax.swing.JLabel logoLabel;
	private javax.swing.JButton new_saveBtn;
	private javax.swing.JButton nextBtn;
	private javax.swing.JButton prevBtn;
	private javax.swing.JButton resetBtn;
	private javax.swing.JTextField roomNoField;
	private javax.swing.JTextField roomRateField;
	private javax.swing.JTextField roomSearchField;
	private javax.swing.JTextField roomTypeField;
	private javax.swing.JTextField roombedTypeField;
	private javax.swing.JButton searchBtn;
	// End of variables declaration//GEN-END:variables
}
