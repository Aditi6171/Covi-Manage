package org.rait.covimanage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.rait.covimanage.dto.User;

/**
 * @author BS00727428
 *
 */
public class UserRegistrationDAO extends AbstractJDBCDAO {

	private static UserRegistrationDAO _instance;

	private UserRegistrationDAO() {
		// singleton
	}

	public static UserRegistrationDAO getInstance() {
		if (_instance == null) {
			_instance = new UserRegistrationDAO();
		}
		return _instance;
	}

	public int saveUserRegistration(User userReg) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = getConnection();
			ps = con.prepareStatement("INSERT INTO User(userName, password, firstName, lastName, gender, mobileNumber, emailId, address, userEnabled) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, userReg.getUserName());
			ps.setString(2, userReg.getPassword());
			ps.setString(3, userReg.getFirstName());
			ps.setString(4, userReg.getGender());
			ps.setString(5, userReg.getLastName());
			ps.setString(6, userReg.getMobileNumber());
			ps.setString(7, userReg.getEmailId());
			ps.setString(8, userReg.getAddress());
			ps.setBoolean(9, true);
			result = ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
