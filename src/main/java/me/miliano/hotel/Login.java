package me.miliano.hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

	private static final long serialVersionUID = 9109204718739992347L;

	Connection con;
	Statement stmt, smt1;
	ResultSet rs;
	Date dt1;

	public Login() {
		initComponents();

		NavigationFrame nf = new NavigationFrame(this, Session.admin);
		nf.setVisible(true);
	}

	private void initComponents() {

		loginArea = new javax.swing.JPanel();
		loginForm = new javax.swing.JPanel();
		username_label = new javax.swing.JLabel();
		pass_label = new javax.swing.JLabel();
		usernameField = new javax.swing.JTextField();
		passField = new javax.swing.JPasswordField();
		loginBtn = new javax.swing.JButton();
		cancelLoginBtn = new javax.swing.JButton();
		logoLabel = new javax.swing.JLabel();
		gifLabel = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Hotel Room Booking System");
		setBackground(new java.awt.Color(3, 84, 124));
		setForeground(new java.awt.Color(3, 84, 124));
		setIconImage(new ImageIcon("F:\\IP\\Hotel\\src\\cbsecsnip.jpg").getImage());
		setPreferredSize(new java.awt.Dimension(650, 400));
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		loginArea.setBackground(new java.awt.Color(3, 84, 124));

		loginForm.setBackground(new java.awt.Color(102, 102, 102));
		loginForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		username_label.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
		username_label.setText("<html><font face=\"Californian FB\" size=\"5\">User Name</font></html>");
		loginForm.add(username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

		pass_label.setFont(new java.awt.Font("Californian FB", 0, 14)); // NOI18N
		pass_label.setText("<html><font face=\"Californian FB\" size=\"5\">Password</font></html>");
		loginForm.add(pass_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

		usernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		usernameField.setText("root");
		loginForm.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 190, -1));

		passField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		passField.setText("root");

		loginForm.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 190, -1));

		loginBtn.setText("Login");
		loginBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				loginBtnActionPerformed(evt);
			}
		});
		loginForm.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 90, -1));

		cancelLoginBtn.setText("Cancel");
		cancelLoginBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cancelLoginBtnActionPerformed(evt);
			}
		});
		loginForm.add(cancelLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 90, -1));

		javax.swing.GroupLayout loginAreaLayout = new javax.swing.GroupLayout(loginArea);
		loginArea.setLayout(loginAreaLayout);
		loginAreaLayout
				.setHorizontalGroup(
						loginAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(loginAreaLayout.createSequentialGroup().addGap(194, 194, 194)
										.addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(146, Short.MAX_VALUE)));
		loginAreaLayout.setVerticalGroup(loginAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(loginAreaLayout
						.createSequentialGroup().addContainerGap().addComponent(loginForm,
								javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(18, Short.MAX_VALUE)));

		getContentPane().add(loginArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 640, 130));

		logoLabel.setBackground(new java.awt.Color(3, 84, 124));
		logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
		getContentPane().add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 590, 220));

		gifLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/91.gif"))); // NOI18N
		getContentPane().add(gifLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 190, 131));

		jPanel1.setBackground(new java.awt.Color(3, 84, 124));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 740, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 390, Short.MAX_VALUE));

		getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 390));

		setSize(new java.awt.Dimension(733, 418));
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
		loginForm.setOpaque(true);
		username_label.setVisible(true);
		pass_label.setVisible(true);
		usernameField.setVisible(true);
		passField.setVisible(true);
		loginBtn.setVisible(true);
		cancelLoginBtn.setVisible(true);
	}// GEN-LAST:event_formWindowOpened

	private void cancelLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelLoginBtnActionPerformed
		this.dispose();
		System.exit(1);
	}// GEN-LAST:event_cancelLoginBtnActionPerformed

	private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginBtnActionPerformed
		Thread thread = new Thread() {
			public void run() {
				System.out.println("Login Thread Running");
				loginBtn.setEnabled(false);
				try {
					Thread.sleep(2);
				} catch (InterruptedException ex) {
					Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
				}
				// login();

			}
		};

		logoLabel.setVisible(false);
		// logoLabel1.setVisible(true);
		thread.start();

	}// GEN-LAST:event_loginBtnActionPerformed

	private void login() {
		try {
			int flag = 0;

			String sql = "Select * from login;";

			rs = new SQLQuery(sql).callRs();
			String log = usernameField.getText();
			String pass = new String(passField.getPassword());
			while (rs.next()) {
				System.out.println(rs.getString(3));
				if (log.equals(rs.getString(1)) && pass.equals(rs.getString(2))) {
					flag = 1;
					if (rs.getString(3).equals("admin")) {
						new Session(true);
					} else {
						new Session(false);
					}
					break;
				}
			}
			if (flag == 1) {
				System.out.println("Login succesful");

				username_label.setEnabled(false);
				pass_label.setEnabled(false);
				usernameField.setEnabled(false);
				passField.setEnabled(false);
				loginBtn.setEnabled(false);
				cancelLoginBtn.setEnabled(false);
				NavigationFrame nf = new NavigationFrame(this, Session.admin);
				nf.setVisible(true);

			} else {
				JOptionPane.showMessageDialog(this, "Please check user name / password", "Error",
						JOptionPane.ERROR_MESSAGE);
				loginBtn.setEnabled(true);

			}
		} catch (Exception ex) {
			logoLabel.setVisible(true);
			new ErrDialog(this, "Database connection failed");
			System.exit(1);
		} finally {

			logoLabel.setVisible(true);
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new Login().setVisible(false);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton cancelLoginBtn;
	private javax.swing.JLabel gifLabel;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel loginArea;
	private javax.swing.JButton loginBtn;
	private javax.swing.JPanel loginForm;
	private javax.swing.JLabel logoLabel;
	private javax.swing.JPasswordField passField;
	private javax.swing.JLabel pass_label;
	private javax.swing.JTextField usernameField;
	private javax.swing.JLabel username_label;
	// End of variables declaration//GEN-END:variables
}
