package org.rait.covimanage.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.rait.covimanage.dto.BookingSlot;
import org.rait.covimanage.dto.OxygenCylinerBookingDTO;

/**
 * @author BS00727428
 *
 */
public class OxyCylBookineDAO extends AbstractJDBCDAO {

	private static OxyCylBookineDAO _instance;

	private OxyCylBookineDAO() {
		// singleton
	}

	public static OxyCylBookineDAO getInstance() {
		if (_instance == null) {
			_instance = new OxyCylBookineDAO();
		}
		return _instance;
	}

	public int saveOxygenBookine(OxygenCylinerBookingDTO dto) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = getConnection();
			ps = con.prepareStatement("INSERT INTO OxygenCylinderBooking(oxygenCylinderType, oxygenCylinderQuantity, bookingDate, userName) VALUES(?, ?, ?, ?)");
			ps.setString(1, dto.getOxyCylType());
			ps.setInt(2, dto.getOxyCylQuantity());
			java.sql.Date date = new Date(dto.getBookingDate().getTime());
			ps.setDate(3, date);
			ps.setString(4, dto.getUserName());
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
