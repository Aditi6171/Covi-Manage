package org.rait.covimanage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.rait.covimanage.dto.User;

/**
 * @author BS00727428
 *
 */
public class UserDAO extends AbstractJDBCDAO {

	private static UserDAO _instance;

	private UserDAO() {
		// singleton
	}

	public static UserDAO getInstance() {
		if (_instance == null) {
			_instance = new UserDAO();
		}
		return _instance;
	}

	public User getUserById(String userId) {
		Connection con = null;
		User user = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement("select * from user where userName=?");
			ps.setString(1, userId);
			rs = ps.executeQuery();
			user = buildUser(rs);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
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
		return user;
	}

	private User buildUser(ResultSet rs) throws SQLException {
		User user = null;
		if (rs != null && rs.next()) {
			user = new User();
			user.setUserName(rs.getString("userName"));
			user.setPassword(rs.getString("password"));
			user.setFirstName(rs.getString("firstName"));
			user.setLastName(rs.getString("lastName"));
			user.setMobileNumber(rs.getString("mobileNumber"));
			user.setEmailId(rs.getString("emailId"));
			user.setUserEnabled(rs.getBoolean("userEnabled"));
		}
		return user;
	}

	public boolean validate(String userName, String password) {
		boolean status = false;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = getConnection();
			ps = con.prepareStatement("select * from user where userName=? and password=?");
			ps.setString(1, userName);
			ps.setString(2, password);
			rs = ps.executeQuery();
			status = rs.next();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
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
		return status;
	}
}
