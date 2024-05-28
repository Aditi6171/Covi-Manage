package org.rait.covimanage.ui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import org.rait.covimanage.MainApp;
import org.rait.covimanage.dao.OxyCylBookineDAO;
import org.rait.covimanage.dto.OxygenCylinerBookingDTO;

/**
 * Class implementing the Oxygen Cylinder Booking form.
 * 
 * @author Team: Aditi, Siddhesh, and Jayesh
 */
public class OxygenCylinderBookingJFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = 9153844076449740816L;
	private MainApp mainApp;
	private javax.swing.JRadioButton abcOxyCylRadioButton;
	private javax.swing.JButton abcOxyCylInfoButton;
	private javax.swing.JButton xyzOxyCylInfoButton;
	private javax.swing.JRadioButton xyzOxyCylRadioButton;
	private javax.swing.JButton abcOxyCylBookButton;
	private javax.swing.JButton xyzOxyCylBookButton;
	private javax.swing.JButton cancelButton;
	private javax.swing.JComboBox<String> abcOxyCylQtyComboBox;
	private javax.swing.JComboBox<String> xyzOxyCylQtyComboBox;
	private javax.swing.JLabel titleMessageLabel;
	private javax.swing.JLabel topMessageLabel2;
	private javax.swing.JLabel abcOxyCylQtyLabel;
	private javax.swing.JLabel xyzOxyCylQtyLabel;
	private javax.swing.JPanel contentPanel;
	private java.awt.Label topMessageLabel1;

	/**
	 * Creates new form OxygenCyclinderBooking
	 * 
	 * @param mainApp
	 */
	public OxygenCylinderBookingJFrame(MainApp mainApp) {
		this.mainApp = mainApp;
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		setTitle("Oxygen Cylinder Booking::Covid-19 Vaccine and Oxygen Management System");
		contentPanel = new javax.swing.JPanel(new java.awt.GridBagLayout());
		titleMessageLabel = new javax.swing.JLabel();
		topMessageLabel1 = new java.awt.Label();
		topMessageLabel2 = new javax.swing.JLabel();
		abcOxyCylRadioButton = new javax.swing.JRadioButton();
		abcOxyCylInfoButton = new javax.swing.JButton();
		abcOxyCylQtyComboBox = new javax.swing.JComboBox<>();
		abcOxyCylQtyLabel = new javax.swing.JLabel();
		abcOxyCylBookButton = new javax.swing.JButton();
		xyzOxyCylRadioButton = new javax.swing.JRadioButton();
		xyzOxyCylInfoButton = new javax.swing.JButton();
		xyzOxyCylQtyComboBox = new javax.swing.JComboBox<>();
		xyzOxyCylQtyLabel = new javax.swing.JLabel();
		xyzOxyCylBookButton = new javax.swing.JButton();
		cancelButton = new javax.swing.JButton();

		titleMessageLabel.setFont(new java.awt.Font("Tahoma", 1, 24));
		titleMessageLabel.setText("Oxygen Cylinder Booking");

		topMessageLabel1.setForeground(new java.awt.Color(249, 0, 0));
		topMessageLabel1.setText("** ALL FIELDS ARE MANDATORY TO BE FILLED");

		topMessageLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
		topMessageLabel2.setText("Following oxygen cylinders are availe:");

		abcOxyCylRadioButton.setText("ABC Oxygen Cylinder");
		abcOxyCylRadioButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				abcOxyCylRadioButtonActionPerformed(evt);
			}
		});

		abcOxyCylInfoButton.setText("More About ABC Oxygen");
		abcOxyCylInfoButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				abcOxyCylInfoButtonActionPerformed(evt);
			}
		});

		abcOxyCylQtyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		abcOxyCylQtyLabel.setText("Select the quantity:");
		abcOxyCylBookButton.setText("BOOK");
		abcOxyCylBookButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				abcOxyCylBookButtonActionPerformed(evt);
			}
		});

		xyzOxyCylRadioButton.setText("XYZ Oxygen Cylinder");
		xyzOxyCylRadioButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				xyzOxyCylRadioButtonActionPerformed(evt);
			}
		});

		xyzOxyCylInfoButton.setText("More About Xyz Oxygen");
		xyzOxyCylInfoButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				xyzOxyCylInfoButtonActionPerformed(evt);
			}
		});

		xyzOxyCylQtyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
		xyzOxyCylQtyLabel.setText("Select the quantity:");

		xyzOxyCylBookButton.setText("BOOK");
		xyzOxyCylBookButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				xyzOxyCylBookButtonActionPerformed(evt);
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
		c.insets = new Insets(0, 15, 0, 15);
		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 0;
		try {
			BufferedImage oxyegnImage = ImageIO.read(this.getClass().getResource("/images/oxygen.jpg"));
			JLabel oxyegnImageLabel = new JLabel(new ImageIcon(oxyegnImage));
			contentPanel.add(oxyegnImageLabel, c);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ----Row # 1--------
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(10, 15, 10, 15);
		c.weightx = 0.5;
		c.gridwidth = 5;
		c.gridx = 0;
		c.gridy = 1;
		contentPanel.add(titleMessageLabel, c);

		// ----Row # 2--------
		// c.ipady = 0;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 5;
		contentPanel.add(topMessageLabel1, c);

		// Row #3
		c.gridwidth = 5;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 3;
		contentPanel.add(topMessageLabel2, c);

		// Row #4
		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 4;
		contentPanel.add(abcOxyCylRadioButton, c);

		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 3;
		c.gridy = 4;
		contentPanel.add(xyzOxyCylRadioButton, c);

		// Row #5
		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 5;
		contentPanel.add(abcOxyCylInfoButton, c);

		c.weightx = 0.5;
		c.gridwidth = 2;
		c.gridx = 3;
		c.gridy = 5;
		contentPanel.add(xyzOxyCylInfoButton, c);

		// Row #6
		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 6;
		contentPanel.add(abcOxyCylQtyLabel, c);

		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 6;
		contentPanel.add(abcOxyCylQtyComboBox, c);

		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 3;
		c.gridy = 6;
		contentPanel.add(xyzOxyCylQtyLabel, c);

		c.gridwidth = 1;
		c.weightx = 0.5;
		c.gridx = 4;
		c.gridy = 6;
		contentPanel.add(xyzOxyCylQtyComboBox, c);

		// Row #7
		c.gridwidth = 2;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 7;
		contentPanel.add(abcOxyCylBookButton, c);

		c.weightx = 0.5;
		c.gridwidth = 2;
		c.gridx = 3;
		c.gridy = 7;
		contentPanel.add(xyzOxyCylBookButton, c);

		// Row #8
		c.weightx = 0.5;
		c.gridwidth = 1;
		c.gridx = 2;
		c.gridy = 8;
		contentPanel.add(cancelButton, c);

		getContentPane().add(contentPanel);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
	}

	private void xyzOxyCylRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (xyzOxyCylRadioButton.isSelected()) {
			abcOxyCylRadioButton.setSelected(false);
		}
	}

	private void abcOxyCylBookButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (abcOxyCylRadioButton.isSelected()) {
			OxygenCylinerBookingDTO dto = new OxygenCylinerBookingDTO();
			dto.setOxyCylType("ABC Oxygen Cylinder");
			String quantityString = (String) abcOxyCylQtyComboBox.getSelectedItem();
			if (quantityString.equalsIgnoreCase("Quantity")) {
				JOptionPane.showMessageDialog(rootPane, "Please select cylinder quantity.");
				return;
			} else {
				Integer quantity = new Integer(quantityString);
				dto.setOxyCylQuantity(quantity);
			}
			dto.setBookingDate(new Date());
			dto.setUserName(mainApp.getLoggedUser().getUserName());
			OxyCylBookineDAO dao = OxyCylBookineDAO.getInstance();
			int result = dao.saveOxygenBookine(dto);
			if (result > 0) {
				JOptionPane.showMessageDialog(rootPane, "Oxygen Cylinder Booked Successfully!");
				setVisible(false);
				mainApp.getHomeFrame().setVisible(true);
			} else {
				JOptionPane.showMessageDialog(rootPane, "Oxygen Cylinder Booking Failed!");
				return;
			}
		} else {
			JOptionPane.showMessageDialog(rootPane, "Please select oxygen cylinder type.");
			return;
		}
	}

	private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
		setVisible(false);
		mainApp.getHomeFrame().setVisible(true);
	}

	private void abcOxyCylRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (abcOxyCylRadioButton.isSelected()) {
			xyzOxyCylRadioButton.setSelected(false);
		}
	}

	private void abcOxyCylInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {
		setVisible(false);
		mainApp.getAboutAbcCylinderFrame().setVisible(true);
	}

	private void xyzOxyCylInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_MoreInfoXyzActionPerformed
		setVisible(false);
		mainApp.getAboutXyzCylinderFrame().setVisible(true);
	}

	private void xyzOxyCylBookButtonActionPerformed(java.awt.event.ActionEvent evt) {

		if (!xyzOxyCylRadioButton.isSelected()) {
			JOptionPane.showMessageDialog(rootPane, "Please select oxygen cylinder type.");
			return;
		}
		
		OxygenCylinerBookingDTO dto = new OxygenCylinerBookingDTO();
		dto.setOxyCylType("XYZ Oxygen Cylinder");
		String quantityString = (String) xyzOxyCylQtyComboBox.getSelectedItem();
		if (quantityString.equalsIgnoreCase("Quantity")) {
			JOptionPane.showMessageDialog(rootPane, "Please select cylinder quantity.");
			return;
		} else {
			Integer quantity = new Integer(quantityString);
			dto.setOxyCylQuantity(quantity);
		}
		dto.setBookingDate(new Date());
		dto.setUserName(mainApp.getLoggedUser().getUserName());
		OxyCylBookineDAO dao = OxyCylBookineDAO.getInstance();
		int result = dao.saveOxygenBookine(dto);
		if (result > 0) {
			JOptionPane.showMessageDialog(rootPane, "Oxygen Cylinder Booked Successfully!");
			setVisible(false);
			mainApp.getHomeFrame().setVisible(true);
		} else {
			JOptionPane.showMessageDialog(rootPane, "Oxygen Cylinder Booking Failed!");
			return;
		}
	}
}
