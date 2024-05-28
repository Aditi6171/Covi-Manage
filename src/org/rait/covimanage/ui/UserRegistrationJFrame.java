package org.rait.covimanage.ui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.rait.covimanage.MainApp;
import org.rait.covimanage.dao.UserRegistrationDAO;
import org.rait.covimanage.dto.User;

/**
 * @author Team: Aditi, Siddhesh, and Jayesh
 */
public class UserRegistrationJFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = -8762646750390444539L;
	private MainApp mainApp;
	private javax.swing.JPanel contentPanel;
	private javax.swing.JLabel titleLabel;
	private javax.swing.JLabel topMessageLabel;
	private javax.swing.JLabel userNameLabel;
	private javax.swing.JTextField userNameTextField;
	private javax.swing.JLabel firstNameLabel;
	private javax.swing.JTextField firstNameTextField;
	private javax.swing.JLabel lastNameLabel;
	private javax.swing.JTextField lastNameTextField;
	private javax.swing.JLabel genderLabel;
	private javax.swing.JRadioButton femaleGenderRadioButton;
	private javax.swing.JRadioButton maleGenderRadioButton;
	private javax.swing.JRadioButton othersGenderRadioButton;
	private javax.swing.JLabel phoneNumberLabel;
	private javax.swing.JTextField phoneNumberTextField;
	private javax.swing.JLabel emailIdLabel;
	private javax.swing.JTextField emailTextField;
	private javax.swing.JLabel addressLabel;
	private javax.swing.JTextField addressTextArea;
	private javax.swing.JLabel newPasswordLabel;
	private javax.swing.JPasswordField newPasswordTextField;
	private javax.swing.JLabel confirmNewPasswordLabel;
	private javax.swing.JPasswordField confirmNewPasswordTextField;
	private javax.swing.JButton registerButton;
	private javax.swing.JButton resetButton;
	private javax.swing.JLabel accountExistMessageLabel;
	private javax.swing.JButton loginButton;

	/**
	 * Creates new form Patient Registration
	 * 
	 * @param mainApp
	 */
	public UserRegistrationJFrame(MainApp mainApp) {
		this.mainApp = mainApp;
		initComponents();
	}

	public void reset() {
		userNameTextField.setText("");
		firstNameTextField.setText("");
		lastNameTextField.setText("");
		emailTextField.setText("");
		newPasswordTextField.setText("");
		confirmNewPasswordTextField.setText("");
		phoneNumberTextField.setText("");
		addressTextArea.setText("");
		maleGenderRadioButton.setSelected(false);
		femaleGenderRadioButton.setSelected(false);
		othersGenderRadioButton.setSelected(false);
		userNameTextField.grabFocus();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		setTitle("User Registration::Covid-19 Vaccine and Oxygen Management System");
		contentPanel = new javax.swing.JPanel(new GridBagLayout());
		genderLabel = new javax.swing.JLabel();
		maleGenderRadioButton = new javax.swing.JRadioButton();
		femaleGenderRadioButton = new javax.swing.JRadioButton();
		othersGenderRadioButton = new javax.swing.JRadioButton();
		resetButton = new javax.swing.JButton();
		loginButton = new javax.swing.JButton();
		accountExistMessageLabel = new javax.swing.JLabel();
		registerButton = new javax.swing.JButton();
		newPasswordLabel = new javax.swing.JLabel();
		confirmNewPasswordTextField = new javax.swing.JPasswordField();
		phoneNumberLabel = new javax.swing.JLabel();
		confirmNewPasswordLabel = new javax.swing.JLabel();
		firstNameLabel = new javax.swing.JLabel();
		lastNameLabel = new javax.swing.JLabel();
		addressLabel = new javax.swing.JLabel();
		titleLabel = new javax.swing.JLabel();
		emailTextField = new javax.swing.JTextField();
		newPasswordTextField = new javax.swing.JPasswordField();
		emailIdLabel = new javax.swing.JLabel();
		phoneNumberTextField = new javax.swing.JTextField();
		userNameLabel = new javax.swing.JLabel();
		firstNameTextField = new javax.swing.JTextField();
		lastNameTextField = new javax.swing.JTextField();
		addressTextArea = new javax.swing.JTextField();
		topMessageLabel = new javax.swing.JLabel();
		userNameTextField = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setForeground(new java.awt.Color(240, 240, 240));

		contentPanel.setBackground(new java.awt.Color(0, 255, 255));

		titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24));
		titleLabel.setText("User Registration");

		firstNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
		firstNameLabel.setText("First Name:");

		lastNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
		lastNameLabel.setText("Last Name:");

		genderLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
		genderLabel.setText("Gender:");

		maleGenderRadioButton.setText("Male");
		maleGenderRadioButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				maleGenderRadioButtonActionPerformed(evt);
			}
		});

		femaleGenderRadioButton.setText("Female");
		femaleGenderRadioButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				femaleGenderRadioButtonActionPerformed(evt);
			}
		});

		othersGenderRadioButton.setText("Others");
		othersGenderRadioButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				otherGenderRadioButtonActionPerformed(evt);
			}
		});

		resetButton.setText("Reset");
		resetButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				resetButtonActionPerformed(evt);
			}
		});

		loginButton.setText("Login");
		loginButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				loginButtonActionPerformed(evt);
			}
		});

		accountExistMessageLabel.setText("Already have an account? Please login!");

		registerButton.setText("Register");
		registerButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				registerButtonActionPerformed(evt);
			}
		});

		newPasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
		newPasswordLabel.setText("Password:");

		confirmNewPasswordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				registration_textconfirmpasswordFocusLost(evt);
			}
		});

		phoneNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		phoneNumberLabel.setText("Phone Number:");

		confirmNewPasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
		confirmNewPasswordLabel.setText("Retype Password:");

		addressLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
		addressLabel.setText("Address:");

		emailIdLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
		emailIdLabel.setText("Email Id:");

		phoneNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				registration_textphonenumberKeyTyped(evt);
			}
		});

		userNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
		userNameLabel.setText("User Name:");

		firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				firstNameTextFieldActionPerformed(evt);
			}
		});

		addressTextArea.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				registration_textaddressActionPerformed(evt);
			}
		});

		topMessageLabel.setForeground(new java.awt.Color(248, 0, 0));
		topMessageLabel.setText("** All fields are mandatory to be filled!");

		contentPanel.setMinimumSize(new Dimension(700, 600));
		contentPanel.setMaximumSize(new Dimension(700, 600));
		contentPanel.setPreferredSize(new Dimension(700, 600));

		GridBagConstraints c = new GridBagConstraints();

		// ----Row # 0--------
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(0, 40, 0, 40);
		c.ipady = 20;
		c.ipadx = 20;
		c.weightx = 0.5;
		c.gridwidth = 4;
		c.gridx = 0;
		c.gridy = 0;

		contentPanel.add(titleLabel, c);

		// ----Row # 1--------
		c.ipady = 0;
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 3;
		contentPanel.add(topMessageLabel, c);

		// Row #2
		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 2;
		contentPanel.add(userNameLabel, c);

		c.weightx = 0.5;
		c.gridwidth = 3;
		c.gridx = 1;
		c.gridy = 2;
		contentPanel.add(userNameTextField, c);

		// Row #3
		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 3;
		contentPanel.add(firstNameLabel, c);

		c.weightx = 0.5;
		c.gridwidth = 3;
		c.gridx = 1;
		c.gridy = 3;
		contentPanel.add(firstNameTextField, c);

		// Row #4
		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 4;
		contentPanel.add(lastNameLabel, c);

		c.weightx = 0.5;
		c.gridwidth = 3;
		c.gridx = 1;
		c.gridy = 4;
		contentPanel.add(lastNameTextField, c);

		// Row #5
		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 5;
		contentPanel.add(genderLabel, c);

		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 5;
		contentPanel.add(femaleGenderRadioButton, c);

		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 2;
		c.gridy = 5;
		contentPanel.add(maleGenderRadioButton, c);

		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 3;
		c.gridy = 5;
		contentPanel.add(othersGenderRadioButton, c);

		// Row #6
		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 6;
		contentPanel.add(phoneNumberLabel, c);

		c.weightx = 0.5;
		c.gridwidth = 3;
		c.gridx = 1;
		c.gridy = 6;
		contentPanel.add(phoneNumberTextField, c);

		// Row #7
		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 7;
		contentPanel.add(emailIdLabel, c);

		c.weightx = 0.5;
		c.gridwidth = 3;
		c.gridx = 1;
		c.gridy = 7;
		contentPanel.add(emailTextField, c);

		// Row #8
		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 8;
		contentPanel.add(addressLabel, c);

		c.weightx = 0.5;
		c.gridwidth = 3;
		c.gridx = 1;
		c.gridy = 8;
		contentPanel.add(addressTextArea, c);

		// Row #9
		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 9;
		contentPanel.add(newPasswordLabel, c);

		c.weightx = 0.5;
		c.gridwidth = 3;
		c.gridx = 1;
		c.gridy = 9;
		contentPanel.add(newPasswordTextField, c);
		System.out.println(c.toString());
		getContentPane().add(contentPanel);

		// Row #10
		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 10;
		contentPanel.add(confirmNewPasswordLabel, c);

		c.weightx = 0.5;
		c.gridwidth = 3;
		c.gridx = 1;
		c.gridy = 10;
		contentPanel.add(confirmNewPasswordTextField, c);

		// Row #11
		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 11;
		contentPanel.add(registerButton, c);

		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 3;
		c.gridy = 11;
		contentPanel.add(resetButton, c);
		System.out.println(c.toString());
		System.out.println(c.toString());

		// Row #12
		c.gridwidth = 2;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 12;
		c.ipady = 30;
		contentPanel.add(new JLabel(" "), c);

		// Row #13
		c.gridwidth = 2;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 13;
		c.ipady = 0;
		contentPanel.add(accountExistMessageLabel, c);

		// Row #14
		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 14;
		contentPanel.add(loginButton, c);

		userNameLabel.getAccessibleContext().setAccessibleName("USERNAME");
		pack();
		setLocationRelativeTo(null);
	}

	private void maleGenderRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (maleGenderRadioButton.isSelected()) {
			femaleGenderRadioButton.setSelected(false);
			othersGenderRadioButton.setSelected(false);
		}
	}

	private void femaleGenderRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (femaleGenderRadioButton.isSelected()) {
			maleGenderRadioButton.setSelected(false);
			othersGenderRadioButton.setSelected(false);
		}
	}

	private void otherGenderRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (othersGenderRadioButton.isSelected()) {
			femaleGenderRadioButton.setSelected(false);
			maleGenderRadioButton.setSelected(false);
		}
	}

	private void registration_textaddressActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {
		reset();
	}

	private void registration_textconfirmpasswordFocusLost(java.awt.event.FocusEvent evt) {
		String newPassword = newPasswordTextField.getText();
		String confirmNewPassword = confirmNewPasswordTextField.getText();
		if (!newPassword.equals(confirmNewPassword)) {
			JOptionPane.showMessageDialog(this, "Password does not match");
		}
	}

	private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {
		User userReg = new User();
		userReg.setUserName(userNameTextField.getText());
		userReg.setFirstName(firstNameTextField.getText());
		userReg.setLastName(lastNameTextField.getText());
		userReg.setMobileNumber(phoneNumberTextField.getText());
		userReg.setEmailId(emailTextField.getText());
		userReg.setPassword(newPasswordTextField.getText());
		userReg.setAddress(addressTextArea.getText());
		
		if(femaleGenderRadioButton.isSelected()) {
			userReg.setGender("female");
		}else if(maleGenderRadioButton.isSelected()) {
			userReg.setGender("male");
		}else if(othersGenderRadioButton.isSelected()) {
			userReg.setGender("others");
		}else {
			JOptionPane.showMessageDialog(this, "Please select the gender.");
			return;
		}
		
		UserRegistrationDAO regDao = UserRegistrationDAO.getInstance();
		int result = regDao.saveUserRegistration(userReg);
		if(result > 0) {
			JOptionPane.showMessageDialog(this, "User registration successful.");
			setVisible(false);
			mainApp.getLoginFrame().setVisible(true);			
		}else {
			JOptionPane.showMessageDialog(this, "User registration failed.");
			return;
		}
	}

	private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
		setVisible(false);
		mainApp.getLoginFrame().setVisible(true);
	}

	private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

	}

	private void registration_textphonenumberKeyTyped(java.awt.event.KeyEvent evt) {
		char c = evt.getKeyChar();
		if (!Character.isDigit(c)) {
			evt.consume();
		}
	}
}
