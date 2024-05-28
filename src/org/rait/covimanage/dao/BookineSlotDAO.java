package org.rait.covimanage.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.rait.covimanage.dto.BookingSlot;

/**
 * @author BS00727428
 *
 */
public class BookineSlotDAO extends AbstractJDBCDAO {

	private static BookineSlotDAO _instance;

	private BookineSlotDAO() {
		// singleton
	}

	public static BookineSlotDAO getInstance() {
		if (_instance == null) {
			_instance = new BookineSlotDAO();
		}
		return _instance;
	}

	public int saveBookineSlot(BookingSlot slot) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = getConnection();
			ps = con.prepareStatement("INSERT INTO VaccineBookingSlot(vaccineType, vaccineLocation, vaccineDate,timeSlot, userName) VALUES(?, ?, ?, ?, ?)");
			ps.setString(1, slot.getVaccineType());
			ps.setString(2, slot.getVaccineLocation());
			java.sql.Date date = new Date(slot.getVaccineDate().getTime());
			ps.setDate(3, date);
			ps.setString(4, slot.getTimeSlot());
			ps.setString(5, slot.getUserName());
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
