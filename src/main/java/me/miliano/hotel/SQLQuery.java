package me.miliano.hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLQuery {
	String query;
	Connection con;
	Statement stmt;

	public SQLQuery(String q) {
		try {
			con = new DB().getConn();
			stmt = new DB().getStmt();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		query = q;
	}

	protected ResultSet callRs() {
		try {
			stmt = con.createStatement();
			return stmt.executeQuery(query);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	protected void call() {
		try {
			stmt = con.createStatement();
			System.out.println("Query Succeded");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}