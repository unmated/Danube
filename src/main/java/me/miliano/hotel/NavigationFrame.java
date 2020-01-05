package me.miliano.hotel;

import javax.swing.JFrame;

public class NavigationFrame extends JFrame {

	private static final long serialVersionUID = 1587714278272763583L;
	private NavigationFrame nf;

	public NavigationFrame(Login l, ROLE adm) {
		l.setVisible(false);
		nf = this;
		initComponents();
		if(adm == ROLE.RECEPTIONER) {
			staffMgmtBtn.setVisible(false);
			roomMgmtBtn.setVisible(false);
		}else if (adm == ROLE.CLIENT) {
			bookingMgmtBtn.setVisible(false);
			visitorMgmtBtn.setVisible(false);
			staffMgmtBtn.setVisible(false);
			roomMgmtBtn.setVisible(false);
		}
		
		logoutBtn.setVisible(true);
	}

	public NavigationFrame(Login l) {
		nf = this;
		l.setVisible(false);
		initComponents();
		logoLabel.add(roomBookBtn);
	}

	public void setVisiblee(boolean vis) {
		this.setVisible(vis);
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		logoLabel = new javax.swing.JLabel();
		staffMgmtBtn = new javax.swing.JButton();
		bookingMgmtBtn = new javax.swing.JButton();
		visitorMgmtBtn = new javax.swing.JButton();
		logoutBtn = new javax.swing.JButton();
		roomBookBtn = new javax.swing.JButton();
		roomMgmtBtn = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Hotel");
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		setLocationByPlatform(true);
		setMaximumSize(new java.awt.Dimension(700, 400));
		setMinimumSize(new java.awt.Dimension(700, 400));
		setResizable(false);
		setSize(new java.awt.Dimension(700, 400));
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});

		jPanel1.setBackground(new java.awt.Color(3, 84, 124));
		jPanel1.setMaximumSize(new java.awt.Dimension(700, 400));
		jPanel1.setMinimumSize(new java.awt.Dimension(700, 400));
		jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));
		jPanel1.setLayout(null);

		logoLabel.setBackground(new java.awt.Color(3, 84, 124));
		logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
		logoLabel.setOpaque(true);
		jPanel1.add(logoLabel);
		logoLabel.setBounds(90, 10, 380, 284);

		staffMgmtBtn.setForeground(new java.awt.Color(255, 0, 0));
		staffMgmtBtn.setText("Staff Management");
		staffMgmtBtn.setBorder(null);
		staffMgmtBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				staffMgmtBtnActionPerformed(evt);
			}
		});
		jPanel1.add(staffMgmtBtn);
		staffMgmtBtn.setBounds(560, 90, 130, 50);

		bookingMgmtBtn.setForeground(new java.awt.Color(0, 102, 102));
		bookingMgmtBtn.setText("Booking Management");
		bookingMgmtBtn.setBorder(null);
		bookingMgmtBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bookingMgmtBtnActionPerformed(evt);
			}
		});
		jPanel1.add(bookingMgmtBtn);
		bookingMgmtBtn.setBounds(200, 300, 130, 50);

		visitorMgmtBtn.setForeground(new java.awt.Color(51, 102, 255));
		visitorMgmtBtn.setText("Visitor Management");
		visitorMgmtBtn.setBorder(null);
		visitorMgmtBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				visitorMgmtBtnActionPerformed(evt);
			}
		});
		jPanel1.add(visitorMgmtBtn);
		visitorMgmtBtn.setBounds(360, 300, 130, 50);

		logoutBtn.setForeground(new java.awt.Color(255, 0, 51));
		logoutBtn.setText("LogOut");
		logoutBtn.setBorder(null);
		logoutBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				logoutBtnActionPerformed(evt);
			}
		});
		jPanel1.add(logoutBtn);
		logoutBtn.setBounds(530, 350, 160, 40);

		roomBookBtn.setForeground(new java.awt.Color(255, 102, 51));
		roomBookBtn.setText("Room Booking");
		roomBookBtn.setBorder(null);
		roomBookBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				roomBookBtnActionPerformed(evt);
			}
		});
		jPanel1.add(roomBookBtn);
		roomBookBtn.setBounds(30, 300, 130, 50);

		roomMgmtBtn.setForeground(new java.awt.Color(255, 0, 153));
		roomMgmtBtn.setText("Room Management");
		roomMgmtBtn.setBorder(null);
		roomMgmtBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				roomMgmtBtnActionPerformed(evt);
			}
		});
		jPanel1.add(roomMgmtBtn);
		roomMgmtBtn.setBounds(560, 160, 130, 50);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)));

		setSize(new java.awt.Dimension(718, 447));
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened

		staffMgmtBtn.setToolTipText("Add/ Edit/Remove Hotel Staff");
		roomMgmtBtn.setToolTipText("Add/ Edit/Remove Hotel Room");
		roomBookBtn.setToolTipText("Check Room is Available or Not");
		logoutBtn.setToolTipText("Close the application");
	}// GEN-LAST:event_formWindowOpened

	private void roomMgmtBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_roomMgmtBtnActionPerformed

		roomMgmtBtn.setEnabled(false);
		RoomMang rm = new RoomMang();
		nf.setVisible(false);
		rm.setVisible(true);
	}// GEN-LAST:event_roomMgmtBtnActionPerformed

	private void bookingMgmtBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bookingMgmtBtnActionPerformed
		bookingMgmtBtn.setEnabled(false);
		BookingMang bm = new BookingMang();
		nf.setVisible(false);
		bm.setVisible(true);
	}// GEN-LAST:event_bookingMgmtBtnActionPerformed

	private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logoutBtnActionPerformed
		Login l = new Login();
		l.setVisible(true);
		this.dispose();
	}// GEN-LAST:event_logoutBtnActionPerformed

	private void staffMgmtBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_staffMgmtBtnActionPerformed
		staffMgmtBtn.setEnabled(false);
		StaffMang sm = new StaffMang();
		sm.setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_staffMgmtBtnActionPerformed

	private void roomBookBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_roomBookBtnActionPerformed
		roomBookBtn.setEnabled(false);
		Availability avail = new Availability();
		avail.setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_roomBookBtnActionPerformed

	private void visitorMgmtBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_visitorMgmtBtnActionPerformed
		visitorMgmtBtn.setEnabled(false);
		CustomerMang cm = new CustomerMang();
		cm.setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_visitorMgmtBtnActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton bookingMgmtBtn;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel logoLabel;
	private javax.swing.JButton logoutBtn;
	private javax.swing.JButton roomBookBtn;
	private javax.swing.JButton roomMgmtBtn;
	private javax.swing.JButton staffMgmtBtn;
	private javax.swing.JButton visitorMgmtBtn;
	// End of variables declaration//GEN-END:variables
}
