package org.rait.covimanage.ui;

import org.rait.covimanage.MainApp;

/**
 *
 * @author Team: Aditi, Siddhesh, and Jayesh
 */
public class AboutAbcCylinderJFrame extends javax.swing.JFrame {
	private static final long serialVersionUID = 9082345982128176342L;
	private MainApp mainApp;
	private javax.swing.JButton Back1;
	private javax.swing.JLabel CompanyName;
	private javax.swing.JLabel CountryofOrigin;
	private javax.swing.JLabel CylindricalHeight;
	private javax.swing.JLabel GasName;
	private javax.swing.JLabel Material;
	private javax.swing.JLabel OxygenPurity;
	private javax.swing.JLabel Price;
	private javax.swing.JLabel WaterCapacity;
	private javax.swing.JLabel WorkingPressure;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel2;

	/**
	 * Creates new form MoreInfoAbcCyl
	 * 
	 * @param mainApp
	 */
	public AboutAbcCylinderJFrame(MainApp mainApp) {
		this.mainApp = mainApp;
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		setTitle("About ABC Oxygen Cylinder");
		jPanel2 = new javax.swing.JPanel();
		Back1 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		CompanyName = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		Price = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		WaterCapacity = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		WorkingPressure = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		OxygenPurity = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		GasName = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		Material = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		CountryofOrigin = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		CylindricalHeight = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel2.setBackground(new java.awt.Color(0, 255, 255));

		Back1.setText("BACK");
		Back1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Back1ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel1.setText("ABC OXYGEN CYLINDER");

		CompanyName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		CompanyName.setText("Company Name:");

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel2.setText("ABC OXYGEN CYLINDER");

		Price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		Price.setText("Price:");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel3.setText("5000");

		WaterCapacity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		WaterCapacity.setText("Water Capacity:");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel4.setText("10 Litres");

		WorkingPressure.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		WorkingPressure.setText("Working Pressure:");

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel5.setText("150 Bar");

		OxygenPurity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		OxygenPurity.setText("Oxygen Purity:");

		jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel6.setText("94%");

		GasName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		GasName.setText("Gas Name:");

		jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel7.setText("Oxygen");

		Material.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		Material.setText("Material:");

		jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel8.setText("Mild Steel");

		CountryofOrigin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		CountryofOrigin.setText("Country of Origin:");

		jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel9.setText("India");

		CylindricalHeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		CylindricalHeight.setText("Cylindrical Height:");

		jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabel10.setText("330 mm");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(27, 27, 27).addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 73,
								javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(76, 76, 76)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(Price)
												.addComponent(CompanyName).addComponent(WaterCapacity).addComponent(WorkingPressure).addComponent(OxygenPurity)
												.addComponent(GasName).addComponent(Material).addComponent(CountryofOrigin))
										.addGap(18, 18, 18)
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2).addComponent(jLabel3)
												.addComponent(jLabel5).addComponent(jLabel6).addComponent(jLabel7).addComponent(jLabel8).addComponent(jLabel9)
												.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(CylindricalHeight).addGap(18, 18, 18).addComponent(jLabel10,
												javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel1))))
						.addContainerGap(140, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(31, 31, 31).addComponent(Back1).addGap(69, 69, 69).addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(CompanyName).addComponent(jLabel2))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Price).addComponent(jLabel3))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(WaterCapacity).addComponent(jLabel4))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(WorkingPressure).addComponent(jLabel5))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(OxygenPurity).addComponent(jLabel6))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(GasName).addComponent(jLabel7))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(Material).addComponent(jLabel8))
						.addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(CountryofOrigin).addComponent(jLabel9))
						.addGap(18, 18, 18)
						.addGroup(
								jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(CylindricalHeight).addComponent(jLabel10))
						.addGap(59, 59, 59)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel2,
				javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		setLocationRelativeTo(null);

	}

	private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		mainApp.getOxygenCylinderBookingFrame().setVisible(true);
	}
}
