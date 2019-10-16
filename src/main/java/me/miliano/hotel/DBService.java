package me.miliano.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBService {
	private final String host = "ubt.miliano.xyz";
	private final String db = "hotel";
	private final String user = "root";
	private final String pass = "pass";

	private static Statement stmt = null;
	private static Connection conn = null;

	private DBService() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://" + host + "/" + db, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}

	}

	public static Connection getConnection() {
		if (conn == null) {
			new DBService();
			return DBService.conn;
		} else {
			return conn;
		}
	}

	public static Statement getStatement() {
		if (conn == null) {
			new DBService();
		} else if (stmt == null) {
			try {
				return conn.createStatement();
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		} else {
			return stmt;
		}

		return null;
	}

}