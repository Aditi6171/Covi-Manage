package org.rait.covimanage.ui;

import javax.swing.JOptionPane;

import org.rait.covimanage.MainApp;
import org.rait.covimanage.dao.UserDAO;
import org.rait.covimanage.dto.User;

/**
 *
 * @author Team: Aditi, Siddhesh, and Jayesh
 */
public class LoginJFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = 446970304744326293L;
	private MainApp mainApp;
	private javax.swing.JPanel contentPanel;
	private javax.swing.JLabel titleLabel;
	private javax.swing.JLabel warningLabel;
	private javax.swing.JLabel userNameLabel;
	private javax.swing.JTextField userNameTextField;
	private javax.swing.JLabel passwordLabel;
	private javax.swing.JPasswordField passwordTextField;
	private javax.swing.JButton loginButton;
	private javax.swing.JLabel registrationLabel;
	private javax.swing.JButton registerButton;
	
	/**
	 * Instantiate MainApp (Login JFrame)
	 * 
	 * @param mainApp
	 */
	public LoginJFrame(MainApp mainApp) {
		this.mainApp = mainApp;
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		setTitle("Login::Covid-19 Vaccine and Oxygen Management System");
		contentPanel = new javax.swing.JPanel();
		titleLabel = new javax.swing.JLabel();
		warningLabel = new javax.swing.JLabel();
		userNameLabel = new javax.swing.JLabel();
		userNameTextField = new javax.swing.JTextField();
		userNameTextField.setText("brijesh");
		passwordTextField = new javax.swing.JPasswordField();
		passwordTextField.setText("brijesh");
		passwordLabel = new javax.swing.JLabel();
		loginButton = new javax.swing.JButton();
		registrationLabel = new javax.swing.JLabel();
		registerButton = new javax.swing.JButton();

		contentPanel.setBackground(new java.awt.Color(0, 255, 255));
		contentPanel.setPreferredSize(new java.awt.Dimension(493, 403));

		titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		titleLabel.setText("User Login");

		warningLabel.setForeground(new java.awt.Color(248, 0, 0));
		warningLabel.setText("* UserName and Password fields are mandatory!");

		userNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		userNameLabel.setText("User Name:");

		userNameTextField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				userNameTextFieldActionPerformed(evt);
			}
		});

		passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		passwordLabel.setText("Password:");

		passwordTextField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				passwordTextFieldActionPerformed(evt);
			}
		});


		loginButton.setText("Login");
		loginButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				loginButtonActionPerformed(evt);
			}
		});

		registrationLabel.setText("New User? Click here to register!");

		registerButton.setText("Register");
		registerButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				registerButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(contentPanel);
		contentPanel.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(149, 149, 149).addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(userNameTextField,
												javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
												jPanel1Layout.createSequentialGroup().addGap(92, 92, 92)
														.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(jPanel1Layout.createSequentialGroup()
																		.addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(0, 0, Short.MAX_VALUE))
																.addGroup(jPanel1Layout.createSequentialGroup().addComponent(passwordLabel)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
																				javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
												jPanel1Layout.createSequentialGroup().addGap(79, 79, 79)
														.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																.addGroup(jPanel1Layout.createSequentialGroup().addComponent(registrationLabel)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(registerButton).addGap(27, 27, 27))
																.addComponent(warningLabel))))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(190, 190, 190).addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(100, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel1Layout
										.createSequentialGroup().addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(warningLabel).addGap(30, 30, 30).addComponent(userNameLabel))
								.addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(44, 44, 44)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING).addComponent(passwordTextField,
										javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(34, 34, 34).addComponent(loginButton).addGap(31, 31, 31)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(registerButton).addComponent(registrationLabel))
						.addContainerGap(92, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(contentPanel,
				javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(contentPanel,
				javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);

	}

	private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:
	}

	private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {
		setVisible(false);
		mainApp.getPatientRegistrationFrame().setVisible(true);
	}

	private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
		String UserName = userNameTextField.getText();
		char[] passwordChars = passwordTextField.getPassword();
		UserDAO userDAO = UserDAO.getInstance();
		boolean loginSuccess = userDAO.validate(UserName, new String(passwordChars));
		if (loginSuccess) {
			User loggedUser = userDAO.getUserById(UserName);
			mainApp.setLoggedUser(loggedUser);
			setVisible(false);
			mainApp.getHomeFrame().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "Login Failed. Please try again!");
			String message = "<html>";
			message += "* UserName and Password fields are mandatory!";
			message += "<br/>";
			message += "** Login Failed. Please try again!";
			warningLabel.setText(message);
		}
	}

	private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
}
