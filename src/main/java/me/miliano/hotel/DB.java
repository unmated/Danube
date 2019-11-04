package me.miliano.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB {
	private final String host = "ubt.miliano.xyz";
	private final String db = "hotel";
	private final String user = "pie";
	private final String pass = "pieproj";

	private Statement stmt;
	private Connection conn;

	public DB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://" + host + "/" + db, user, pass);
			stmt = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}
	}

	protected Statement getStmt() {
		return stmt;
	}

	protected Connection getConn() {
		return conn;

	}

}