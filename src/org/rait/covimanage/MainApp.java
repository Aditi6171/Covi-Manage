package org.rait.covimanage;

import org.rait.covimanage.dto.User;
import org.rait.covimanage.ui.AboutAbcCylinderJFrame;
import org.rait.covimanage.ui.AboutXyzCylinderJFrame;
import org.rait.covimanage.ui.HomeJFrame;
import org.rait.covimanage.ui.LoginJFrame;
import org.rait.covimanage.ui.OxygenCylinderBookingJFrame;
import org.rait.covimanage.ui.UserRegistrationJFrame;
import org.rait.covimanage.ui.VaccineSlotBookingJFrame;

/**
 * This is the main class to launch the application.
 * 
 * @author BS00727428
 *
 */
public class MainApp {
	private LoginJFrame loginFrame;
	private HomeJFrame homeFrame;
	private AboutAbcCylinderJFrame aboutAbcCylinderFrame;
	private AboutXyzCylinderJFrame aboutXyzCylinderFrame;
	private OxygenCylinderBookingJFrame oxygenCylinderBookingFrame;
	private UserRegistrationJFrame patientRegistrationFrame;
	private VaccineSlotBookingJFrame vaccineSlotBookingFrame;
	private User loggedUser;

	/**
	 * @return the loginFrame
	 */
	public LoginJFrame getLoginFrame() {
		if (loginFrame == null) {
			loginFrame = new LoginJFrame(this);
		}
		return loginFrame;
	}

	/**
	 * @return the homeFrame
	 */
	public HomeJFrame getHomeFrame() {
		if (homeFrame == null) {
			homeFrame = new HomeJFrame(this);
		}
		return homeFrame;
	}

	/**
	 * @return the aboutAbcCylinderFrame
	 */
	public AboutAbcCylinderJFrame getAboutAbcCylinderFrame() {
		if (aboutAbcCylinderFrame == null) {
			aboutAbcCylinderFrame = new AboutAbcCylinderJFrame(this);
		}
		return aboutAbcCylinderFrame;
	}

	/**
	 * @return the aboutXyzCylinderFrame
	 */
	public AboutXyzCylinderJFrame getAboutXyzCylinderFrame() {
		if (aboutXyzCylinderFrame == null) {
			aboutXyzCylinderFrame = new AboutXyzCylinderJFrame(this);
		}
		return aboutXyzCylinderFrame;
	}

	/**
	 * @return the oxygenCylinderBookingFrame
	 */
	public OxygenCylinderBookingJFrame getOxygenCylinderBookingFrame() {
		if (oxygenCylinderBookingFrame == null) {
			oxygenCylinderBookingFrame = new OxygenCylinderBookingJFrame(this);
		}
		return oxygenCylinderBookingFrame;
	}

	/**
	 * @return the patientRegistrationFrame
	 */
	public UserRegistrationJFrame getPatientRegistrationFrame() {
		if (patientRegistrationFrame == null) {
			patientRegistrationFrame = new UserRegistrationJFrame(this);
		}

		return patientRegistrationFrame;
	}

	public void setLoggedUser(User loggedUser) {
		this.loggedUser = loggedUser;
	}

	public User getLoggedUser() {
		return loggedUser;
	}

	/**
	 * @return the vaccineSlotBookingFrame
	 */
	public VaccineSlotBookingJFrame getVaccineSlotBookingFrame() {
		if (vaccineSlotBookingFrame == null) {
			vaccineSlotBookingFrame = new VaccineSlotBookingJFrame(this);
		}
		return vaccineSlotBookingFrame;
	}

	public static void main(String[] args) {
		MainApp mainApp = new MainApp();
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				mainApp.getLoginFrame().setVisible(true);
			}
		});
	}

}