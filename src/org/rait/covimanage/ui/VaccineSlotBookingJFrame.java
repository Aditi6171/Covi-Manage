package org.rait.covimanage.ui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import org.rait.covimanage.MainApp;
import org.rait.covimanage.dao.BookineSlotDAO;
import org.rait.covimanage.dto.BookingSlot;

/**
 *
 * @author Team: Aditi, Siddhesh, and Jayesh
 * 
 */
public class VaccineSlotBookingJFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = -3367037170071334013L;
	private JPanel contentPanel;
	private JButton confirmVaccineSlotButton;
	private JRadioButton covaccineRadioButton;
	private JRadioButton coviShieldRadioButton;
	private JButton cancelButton;
	private JComboBox<String> locationComboBox;
	private JLabel titleLabel;
	private JLabel vaccineTypeLabel;
	private JLabel locationLabel;
	private JLabel timeSlotLabel;
	private JLabel topMessageLabel;
	private JRadioButton time1;
	private JRadioButton time2;
	private JRadioButton time3;
	private JRadioButton time4;
	private JRadioButton time5;
	private JRadioButton time6;
	private JRadioButton time7;
	private JRadioButton time8;
	private JTextField userTextField;
	private JLabel userLabel;
	private MainApp mainApp;

	/**
	 * Creates new form for Vacc_Slot_Booking
	 * 
	 * @param mainApp
	 */
	public VaccineSlotBookingJFrame(MainApp mainApp) {
		this.mainApp = mainApp;
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		setTitle("Vaccine Slot Booking::Covid-19 Vaccine and Oxygen Management System");
		contentPanel = new JPanel(new GridBagLayout());
		titleLabel = new JLabel();
		topMessageLabel = new JLabel();
		vaccineTypeLabel = new JLabel();
		coviShieldRadioButton = new JRadioButton();
		covaccineRadioButton = new JRadioButton();
		locationLabel = new JLabel();
		locationComboBox = new JComboBox<>();
		timeSlotLabel = new JLabel();
		time1 = new JRadioButton();
		time2 = new JRadioButton();
		time3 = new JRadioButton();
		time4 = new JRadioButton();
		time5 = new JRadioButton();
		time6 = new JRadioButton();
		time7 = new JRadioButton();
		time8 = new JRadioButton();
		userLabel = new JLabel();
		userTextField = new JTextField();
		userTextField.setText(mainApp.getLoggedUser().getLastName() + ", " + mainApp.getLoggedUser().getFirstName());
		userTextField.setEnabled(false);

		confirmVaccineSlotButton = new JButton();
		cancelButton = new JButton();

		titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24));
		titleLabel.setText("Vaccine Slot Booking");

		topMessageLabel.setForeground(new java.awt.Color(246, 0, 0));
		topMessageLabel.setText("** ALL FIELDS ARE MANDATORY TO BE FILLED!");

		vaccineTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
		vaccineTypeLabel.setText("Choose the Vaccine Type:");

		coviShieldRadioButton.setText("Covi-Shield");
		coviShieldRadioButton.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusGained(java.awt.event.FocusEvent evt) {
				CoviShieldFocusGained(evt);
			}
		});
		coviShieldRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				CoviShieldMouseClicked(evt);
			}
		});
		coviShieldRadioButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CoviShieldActionPerformed(evt);
			}
		});

		covaccineRadioButton.setText("Co-vaccine");
		covaccineRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				CovaccineMouseClicked(evt);
			}
		});
		covaccineRadioButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CovaccineActionPerformed(evt);
			}
		});

		locationLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		locationLabel.setText("Choose the Vaccine Center:");

		locationComboBox.setModel(
				new DefaultComboBoxModel<>(new String[] { "--Please Select--", "Fortis Vashi", "Reliance Hospital Ghansoli", "Kokilaben Hospital Mumbai" }));
		locationComboBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		timeSlotLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
		timeSlotLabel.setText("Choose Timeslot:");

		time1.setText("09:45 AM");
		time1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				time1ActionPerformed(evt);
			}
		});

		time2.setText("10:30 AM");
		time2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				time2ActionPerformed(evt);
			}
		});

		time3.setText("11:15 AM");
		time3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				time3ActionPerformed(evt);
			}
		});

		time4.setText("12:00 PM");
		time4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				time4ActionPerformed(evt);
			}
		});

		time5.setText("12:45 PM");
		time5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				time5ActionPerformed(evt);
			}
		});

		time6.setText("01:30 PM");
		time6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				time6ActionPerformed(evt);
			}
		});

		time7.setText("02:15 PM");
		time7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				time7ActionPerformed(evt);
			}
		});

		time8.setText("03:00 PM");
		time8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				time8ActionPerformed(evt);
			}
		});

		userLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
		userLabel.setText("Selected User:");

		confirmVaccineSlotButton.setText("Confirm Slot");
		confirmVaccineSlotButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				confirmVaccineSlotButtonActionPerformed(evt);
			}
		});

		cancelButton.setText("Cancel");
		cancelButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cancelButtonActionPerformed(evt);
			}
		});

		contentPanel.setBackground(new java.awt.Color(0, 255, 255));
		/// GridBagLayout Configuration
		contentPanel.setMinimumSize(new Dimension(800, 600));
		contentPanel.setMaximumSize(new Dimension(800, 600));
		contentPanel.setPreferredSize(new Dimension(800, 600));

		GridBagConstraints c = new GridBagConstraints();

		// ----Row # 0--------
		c.fill = GridBagConstraints.HORIZONTAL;
		//c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(0, 15, 0, 15);
		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 0;		
		try {
			BufferedImage vaccineImage = ImageIO.read(this.getClass().getResource("/images/vaccine.jpg"));
			JLabel vaccineImageLabel = new JLabel(new ImageIcon(vaccineImage));
			//vaccineImageLabel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
			contentPanel.add(vaccineImageLabel, c);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ----Row # 1--------
		c.fill = GridBagConstraints.HORIZONTAL;
		//c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(10, 15, 10, 15);
		c.weightx = 0.5;
		c.gridwidth = 5;
		c.gridx = 0;
		c.gridy = 1;

		contentPanel.add(titleLabel, c);

		// ----Row # 2--------
		// c.ipady = 0;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 5;
		contentPanel.add(topMessageLabel, c);

		// Row #3
		c.gridwidth = 2;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 3;
		contentPanel.add(vaccineTypeLabel, c);

		// Row #4
		c.weightx = 0.5;
		c.gridwidth = 5;
		c.gridx = 2;
		c.gridy = 3;
		contentPanel.add(coviShieldRadioButton, c);

		// Row #5
		c.weightx = 0.5;
		c.gridwidth = 5;
		c.gridx = 2;
		c.gridy = 5;
		contentPanel.add(covaccineRadioButton, c);

		// Row #6
		c.gridwidth = 2;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 6;
		contentPanel.add(locationLabel, c);

		c.weightx = 0.5;
		c.gridwidth = 2;
		c.gridx = 2;
		c.gridy = 6;
		contentPanel.add(locationComboBox, c);

		// Row #7
		c.gridwidth = 2;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 7;
		contentPanel.add(timeSlotLabel, c);

		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 2;
		c.gridy = 7;
		contentPanel.add(time1, c);

		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 3;
		c.gridy = 7;
		contentPanel.add(time2, c);

		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 4;
		c.gridy = 7;
		contentPanel.add(time3, c);

		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 5;
		c.gridy = 7;
		contentPanel.add(time4, c);

		// Row #8
		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 2;
		c.gridy = 8;
		contentPanel.add(time5, c);

		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 3;
		c.gridy = 8;
		contentPanel.add(time6, c);

		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 4;
		c.gridy = 8;
		contentPanel.add(time7, c);

		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 5;
		c.gridy = 8;
		contentPanel.add(time8, c);

		// Row #10
		c.gridwidth = 2;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 9;
		contentPanel.add(userLabel, c);

		c.weightx = 0.5;
		c.gridwidth = 2;
		c.gridx = 2;
		c.gridy = 9;
		contentPanel.add(userTextField, c);

		// Row #9
		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 2;
		c.gridy = 10;
		contentPanel.add(confirmVaccineSlotButton, c);

		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 3;
		c.gridy = 10;
		contentPanel.add(cancelButton, c);

		getContentPane().add(contentPanel);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
	}

	private void CoviShieldFocusGained(java.awt.event.FocusEvent evt) {
		// TODO add your handling code here:
	}

	private void CoviShieldMouseClicked(java.awt.event.MouseEvent evt) {
		if (coviShieldRadioButton.isSelected()) {
			JOptionPane.showMessageDialog(this,
					"Both vaccine has 2 doses each! The dose of the vaccine you are taking now, the same has to be taken at the time of second dose also!");
		}
	}

	private void CovaccineMouseClicked(java.awt.event.MouseEvent evt) {
		if (covaccineRadioButton.isSelected()) {
			JOptionPane.showMessageDialog(this,
					"Both vaccine has 2 doses each! The dose of the vaccine you are taking now, the same has to be taken at the time of second dose also!");
		}
	}

	private void CovaccineActionPerformed(java.awt.event.ActionEvent evt) {
		if (covaccineRadioButton.isSelected()) {
			coviShieldRadioButton.setSelected(false);
		}
	}

	private void CoviShieldActionPerformed(java.awt.event.ActionEvent evt) {
		if (coviShieldRadioButton.isSelected()) {
			covaccineRadioButton.setSelected(false);
		}
	}

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void time1ActionPerformed(java.awt.event.ActionEvent evt) {
		if (time1.isSelected()) {
			time2.setSelected(false);
			time3.setSelected(false);
			time4.setSelected(false);
			time5.setSelected(false);
			time6.setSelected(false);
			time7.setSelected(false);
			time8.setSelected(false);
		}
	}

	private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
		setVisible(false);
		mainApp.getHomeFrame().setVisible(true);
	}

	private void time2ActionPerformed(java.awt.event.ActionEvent evt) {
		if (time2.isSelected()) {
			time1.setSelected(false);
			time3.setSelected(false);
			time4.setSelected(false);
			time5.setSelected(false);
			time6.setSelected(false);
			time7.setSelected(false);
			time8.setSelected(false);
		}
	}

	private void time3ActionPerformed(java.awt.event.ActionEvent evt) {
		if (time3.isSelected()) {
			time2.setSelected(false);
			time1.setSelected(false);
			time4.setSelected(false);
			time5.setSelected(false);
			time6.setSelected(false);
			time7.setSelected(false);
			time8.setSelected(false);
		}
	}

	private void time4ActionPerformed(java.awt.event.ActionEvent evt) {
		if (time4.isSelected()) {
			time2.setSelected(false);
			time3.setSelected(false);
			time1.setSelected(false);
			time5.setSelected(false);
			time6.setSelected(false);
			time7.setSelected(false);
			time8.setSelected(false);
		}
	}

	private void time5ActionPerformed(java.awt.event.ActionEvent evt) {
		if (time5.isSelected()) {
			time2.setSelected(false);
			time3.setSelected(false);
			time4.setSelected(false);
			time1.setSelected(false);
			time6.setSelected(false);
			time7.setSelected(false);
			time8.setSelected(false);
		}
	}

	private void time6ActionPerformed(java.awt.event.ActionEvent evt) {
		if (time6.isSelected()) {
			time2.setSelected(false);
			time3.setSelected(false);
			time4.setSelected(false);
			time5.setSelected(false);
			time1.setSelected(false);
			time7.setSelected(false);
			time8.setSelected(false);
		}
	}

	private void time7ActionPerformed(java.awt.event.ActionEvent evt) {
		if (time7.isSelected()) {
			time2.setSelected(false);
			time3.setSelected(false);
			time4.setSelected(false);
			time5.setSelected(false);
			time6.setSelected(false);
			time1.setSelected(false);
			time8.setSelected(false);
		}
	}

	private void time8ActionPerformed(java.awt.event.ActionEvent evt) {
		if (time8.isSelected()) {
			time2.setSelected(false);
			time3.setSelected(false);
			time4.setSelected(false);
			time5.setSelected(false);
			time6.setSelected(false);
			time7.setSelected(false);
			time1.setSelected(false);
		}
	}

	private void confirmVaccineSlotButtonActionPerformed(java.awt.event.ActionEvent evt) {
		BookingSlot slot = new BookingSlot();
		if (coviShieldRadioButton.isSelected()) {
			slot.setVaccineType("Covishield");
		} else if (covaccineRadioButton.isSelected()) {
			slot.setVaccineType("Covaccine");
		} else {
			JOptionPane.showMessageDialog(this, "Please select the vaccine type!");
			return;
		}
		String location = (String) locationComboBox.getSelectedItem();
		if (location.startsWith("--")) {
			JOptionPane.showMessageDialog(this, "Please select the vaccine center!");
			return;
		} else {
			slot.setVaccineLocation(location);
		}

		if (time1.isSelected()) {
			slot.setTimeSlot("09:45 AM");
		} else if (time2.isSelected()) {
			slot.setTimeSlot("10:30 AM");
		} else if (time3.isSelected()) {
			slot.setTimeSlot("11:15 AM");
		} else if (time4.isSelected()) {
			slot.setTimeSlot("12:00 PM");
		} else if (time5.isSelected()) {
			slot.setTimeSlot("12:45 PM");
		} else if (time6.isSelected()) {
			slot.setTimeSlot("01:30 PM");
		} else if (time7.isSelected()) {
			slot.setTimeSlot("02:15 PM");
		} else if (time8.isSelected()) {
			slot.setTimeSlot("03:00 PM");
		} else {
			JOptionPane.showMessageDialog(this, "Please select a suitable timeslot!");
			return;
		}
		slot.setVaccineDate(new Date());
		slot.setUserName(mainApp.getLoggedUser().getUserName());
		BookineSlotDAO dao = BookineSlotDAO.getInstance();
		int result = dao.saveBookineSlot(slot);

		if (result > 0) {
			JOptionPane.showMessageDialog(this, "Vaccination timeslot registered successfuly!");
			this.setVisible(false);
			mainApp.getHomeFrame().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "Vaccination timeslot failed!");
			return;
		}
	}

}
