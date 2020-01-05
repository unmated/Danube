package me.miliano.hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BookingMang extends javax.swing.JFrame {

	Connection con;
	Statement smt, smt1;
	ResultSet rsBook, rsName, rs2;
	SimpleDateFormat sdf;

	public BookingMang() {
		initComponents();
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
		this.setLocationRelativeTo(null);

		String guery = "select * from bookingtable;";
		String gueryy = "SELECT Cust_id_no, Cust_name FROM custdetail,bookingtable where custdetail.book_id=bookingtable.book_id;";
		rsBook = new SQLQuery(guery).callRs();
		rsName = new SQLQuery(gueryy).callRs();
		sdf = new SimpleDateFormat("dd-MMM-yyyy");

		bookid.setEditable(false);
		roomNo.setEditable(false);
		visitorNo.setEditable(false);
		visitorName.setEditable(false);
		fromField.setEditable(false);
		toField.setEditable(false);

		smt = new DB().getStmt();

		try {
			rsBook.next();
			rsName.next();
			displayRecord();
		} catch (SQLException ex) {
			Logger.getLogger(BookingMang.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	public  void displayRecord() {
		try {
			java.sql.Date dtfrom = rsBook.getDate(3);
			java.sql.Date dtto = rsBook.getDate(4);
			String from = sdf.format(dtfrom.getTime());
			String to = sdf.format(dtto.getTime());
			System.out.println("FROM : " + from + "   To : " + to);
			boolean booked = rsBook.getInt(6)==1;
			fromField.setText(from);
			toField.setText(to);
			bookid.setText(rsBook.getString(1));
			roomNo.setText(rsBook.getString(2));
			visitorNo.setText(Integer.toString(rsName.getInt(1)));
			visitorName.setText(rsName.getString(2));
			System.out.println("!!!! -> " + booked);
			book.setEnabled(!booked);
			bconfLabel.setText(booked?"Confirmed":"Not Confirmed");
		} catch (Exception ec) {
		}
	}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        logoLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bookid = new javax.swing.JTextField();
        roomNo = new javax.swing.JTextField();
        visitorNo = new javax.swing.JTextField();
        visitorName = new javax.swing.JTextField();
        fromField = new javax.swing.JTextField();
        toField = new javax.swing.JTextField();
        firstBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        lastBtn = new javax.swing.JButton();
        prevBtn = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        book = new javax.swing.JButton();
        bconfNameLabel = new javax.swing.JLabel();
        bconfLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        logoLabel.setBackground(new java.awt.Color(3, 84, 124));
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        logoLabel.setOpaque(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Booked Room Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Book ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Room No.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Visitor No.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Visitor Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Booked From");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Booked To");

        bookid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        roomNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        visitorNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        visitorName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        fromField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        toField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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

        cancel.setText("Cancel Booking");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        book.setText("Book");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	bookActionPerformed(evt);
            }
        });

        bconfNameLabel.setText("Booking Confirmation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(visitorNo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(visitorName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(firstBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(prevBtn))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lastBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fromField, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(toField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bconfNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bconfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(roomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(visitorNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstBtn)
                                    .addComponent(prevBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nextBtn)
                                    .addComponent(lastBtn))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(visitorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(fromField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(toField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bconfNameLabel)
                    .addComponent(bconfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>                        

    
	private void firstBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_firstBtnActionPerformed
		try {
			rsName.first();
			if (rsName.isFirst()) {
				rsName.first();
			}
			displayRecord();
		} catch (Exception ex) {
		}
		try {
			rsBook.first();
			if (rsBook.isFirst()) {
				rsBook.first();
			}
			displayRecord();
		} catch (Exception ex) {
		}
	}// GEN-LAST:event_firstBtnActionPerformed

	private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nextBtnActionPerformed
		try {
			rsName.next();
			if (rsName.isLast()) {
				rsName.last();
			}
			displayRecord();
		} catch (Exception ex) {
		}
		try {
			rsBook.next();
			if (rsBook.isLast()) {
				rsBook.last();
			}
			displayRecord();
		} catch (Exception ex) {
		}
	}// GEN-LAST:event_nextBtnActionPerformed

	private void lastBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_lastBtnActionPerformed
		try {
			rsName.last();
			if (rsName.isLast()) {
				rsName.last();
			}
			displayRecord();
		} catch (Exception ex) {
		}
		try {
			rsBook.last();
			if (rsBook.isLast()) {
				rsBook.last();
			}
			displayRecord();
		} catch (Exception ex) {
		}
	}// GEN-LAST:event_lastBtnActionPerformed

	private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_prevBtnActionPerformed
		try {
			rsName.previous();
			if (rsName.isFirst()) {
				rsName.first();
			}
			displayRecord();
		} catch (Exception ex) {
		}
		try {
			rsBook.previous();
			if (rsBook.isFirst()) {
				rsBook.first();
			}
			displayRecord();
		} catch (Exception ex) {
		}
	}// GEN-LAST:event_prevBtnActionPerformed

	private void cancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelActionPerformed
		// TODO add your handling code here:

		try {
			if (evt.getActionCommand().equals("Confirm")) {
				int code = JOptionPane.showConfirmDialog(this,
						"Book ID :" + bookid.getText() + " will be deleted from database.", "Confirmation",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (code == JOptionPane.YES_OPTION) {

					String updatequery = "DELETE from bookingtable where book_id = '" + bookid.getText() + "';";
					String updatequery1 = "DELETE from custdetail where custdetail.book_id= '" + bookid.getText()
							+ "';";
					int success = smt.executeUpdate(updatequery);
					int successs = smt.executeUpdate(updatequery1);
					if (success > 0 && successs > 0) {
						JOptionPane.showMessageDialog(this, "Record Deleted");
						Login l = new Login();
						NavigationFrame n = new NavigationFrame(l, Session.role);
						n.setVisible(true);
						this.dispose();

					} else {
						JOptionPane.showMessageDialog(this, "Problem in deletion. Retry");
					}

				} else {
					enBtn();
				}
			} else if (evt.getActionCommand().equals("Cancel Booking")) {

				if (!bookid.getText().equals("")) {
					int code = JOptionPane.showConfirmDialog(this,
							"Your confirmation will delete the record of current selected room", "Confirmation",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
					if (code == JOptionPane.YES_OPTION) {
						disBtn();
						cancel.setText("Confirm");
					}
				} else {
					new ErrDialog(this, "Fields cannot be empty");
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} // GEN-LAST:event_cancelActionPerformed

	}
	private void bookActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelActionPerformed
		// TODO add your handling code here:

		try {
			if (evt.getActionCommand().equals("Confirm")) {
				int code = JOptionPane.showConfirmDialog(this,
						"Book ID :" + bookid.getText() + "  Confirm Booking ", "Confirmation",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (code == JOptionPane.YES_OPTION) {

					String updatequery = "UPDATE  bookingtable SET  confirm_status = '1';";
					int success = smt.executeUpdate(updatequery);
					if (success > 0 ) {
						JOptionPane.showMessageDialog(this, "Room Booked");
						Login l = new Login();
						NavigationFrame n = new NavigationFrame(l, Session.role);
						n.setVisible(true);
						this.dispose();

					} else {
						JOptionPane.showMessageDialog(this, "Problem booking this room. Retry");
					}

				} else {
					enBtn();
				}
			} else if (evt.getActionCommand().equals("Book")) {

				if (!bookid.getText().equals("")) {
					int code = JOptionPane.showConfirmDialog(this,
							"Accept current booking ?", "Confirmation",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
					if (code == JOptionPane.YES_OPTION) {
						disBtn();
						book.setText("Confirm");
					}
				} else {
					new ErrDialog(this, "Fields cannot be empty");
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} 

	}

	private void enBtn() {
		nextBtn.setEnabled(true);
		prevBtn.setEnabled(true);
		firstBtn.setEnabled(true);
		lastBtn.setEnabled(true);
	}

	private void disBtn() {
		nextBtn.setEnabled(false);
		prevBtn.setEnabled(false);
		firstBtn.setEnabled(false);
		lastBtn.setEnabled(false);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextField bookid;
	private javax.swing.JButton cancel;
	private javax.swing.JButton book;
	private javax.swing.JButton firstBtn;
	private javax.swing.JTextField fromField;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JButton lastBtn;
	private javax.swing.JLabel logoLabel;
	private javax.swing.JButton nextBtn;
	private javax.swing.JButton prevBtn;
	private javax.swing.JTextField roomNo;
	private javax.swing.JTextField toField;
	private javax.swing.JTextField visitorName;
	private javax.swing.JTextField visitorNo;
	private JLabel bconfNameLabel;
	private JLabel bconfLabel;
	// End of variables declaration//GEN-END:variables
}
