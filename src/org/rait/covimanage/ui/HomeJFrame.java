package org.rait.covimanage.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import org.rait.covimanage.MainApp;

/**
 * @author Team: Aditi, Siddhesh, and Jayesh
 */
public class HomeJFrame extends JFrame {

	private static final long serialVersionUID = 6701714083397006913L;
	private MainApp mainApp;
	private JPanel contentPanel;
	private JLabel titleMessageLabel;
	private JRadioButton bookOxygenCylinderRadioButton;
	private JRadioButton bookVaccineSlotRadioButton;
	private JButton netxButton;
	private JButton closeButton;

	/**
	 * Creates new form to display Oxygen Tank and VAccination Slot Booking
	 * 
	 * @param mainApp
	 */
	public HomeJFrame(MainApp mainApp) {
		this.mainApp = mainApp;
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		setTitle("Covid-19 Vaccine and Oxygen Management System");
		contentPanel = new JPanel();
		titleMessageLabel = new JLabel();
		bookOxygenCylinderRadioButton = new JRadioButton();
		bookVaccineSlotRadioButton = new JRadioButton();
		closeButton = new JButton();
		netxButton = new JButton();

		titleMessageLabel.setFont(new java.awt.Font("Tahoma", 1, 24));
		titleMessageLabel.setText("Welcome \"" + mainApp.getLoggedUser().getFirstName() + "\" !");

		bookOxygenCylinderRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14));
		bookOxygenCylinderRadioButton.setText("Book Oxygen Cylinder");
		bookOxygenCylinderRadioButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bookOxygenCylinderRadioButtonActionPerformed(evt);
			}
		});

		bookVaccineSlotRadioButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		bookVaccineSlotRadioButton.setText("Vaccine Slot Booking");
		bookVaccineSlotRadioButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				vaccinationSlotRadioButtonActionPerformed(evt);
			}
		});


		netxButton.setText("Next");
		netxButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				nextButtonActionPerformed(evt);
			}
		});

		closeButton.setText("Close");
		closeButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				closeButtonActionPerformed(evt);
			}
		});

		contentPanel.setBackground(new java.awt.Color(0, 255, 255));
		contentPanel.setMinimumSize(new Dimension(800, 500));
		contentPanel.setMaximumSize(new Dimension(800, 500));
		contentPanel.setPreferredSize(new Dimension(800, 500));
		contentPanel.setLayout(new BorderLayout());

		//Top Panel
		JPanel topPanel = new JPanel();
		topPanel.setBackground(new java.awt.Color(0, 255, 255));
		topPanel.add(titleMessageLabel);
		contentPanel.add(topPanel, BorderLayout.NORTH);
		
		//Center Panel
		JPanel centerPanel = new JPanel();
		//centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.PAGE_AXIS));
		centerPanel.setLayout(new java.awt.GridLayout(4,1));
		centerPanel.setBackground(new java.awt.Color(0, 255, 255));
		try {
			BufferedImage vaccineImage = ImageIO.read(this.getClass().getResource("/images/vaccine.jpg"));
			JLabel vaccineImageLabel = new JLabel(new ImageIcon(vaccineImage));
			vaccineImageLabel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
			centerPanel.add(vaccineImageLabel);
			
			bookVaccineSlotRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
			centerPanel.add(bookVaccineSlotRadioButton);

			BufferedImage oxygenCylinderImage = ImageIO.read(this.getClass().getResource("/images/oxygen.jpg"));
			JLabel oxygenCylinderImageLabel = new JLabel(new ImageIcon(oxygenCylinderImage));
			oxygenCylinderImageLabel.setBorder(new EmptyBorder(20,20,0,20));//top,left,bottom,right
			oxygenCylinderImageLabel.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
			centerPanel.add(oxygenCylinderImageLabel);
			
			bookOxygenCylinderRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
			centerPanel.add(bookOxygenCylinderRadioButton);

		} catch (IOException e) {
			e.printStackTrace();
		}
		contentPanel.add(centerPanel, BorderLayout.CENTER);
		
		//Bottom Panel
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(new java.awt.Color(0, 255, 255));
		bottomPanel.add(netxButton);
		bottomPanel.add(closeButton);
		contentPanel.add(bottomPanel, BorderLayout.SOUTH);

		this.add(contentPanel);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);

	}

	private void bookOxygenCylinderRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (bookOxygenCylinderRadioButton.isSelected()) {
			bookVaccineSlotRadioButton.setSelected(false);
		}
	}

	private void vaccinationSlotRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (bookVaccineSlotRadioButton.isSelected()) {
			bookOxygenCylinderRadioButton.setSelected(false);

		}
	}

	private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if(bookVaccineSlotRadioButton.isSelected()) {
			setVisible(false);
			mainApp.getVaccineSlotBookingFrame().setVisible(true);
		}else if (bookOxygenCylinderRadioButton.isSelected()) {
			setVisible(false);
			mainApp.getOxygenCylinderBookingFrame().setVisible(true);
		}else {
			JOptionPane.showMessageDialog(this, "Please select the type of booking!");
			return;
		}
	}

	private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

}
