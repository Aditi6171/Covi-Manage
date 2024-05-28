package org.rait.covimanage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author BS00727428
 *
 */
public abstract class AbstractJDBCDAO {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covimanagedb", "root", "Root@123");
		return con;
	}

}
