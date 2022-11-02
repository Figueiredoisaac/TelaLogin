package br.com.figueiredoisaac.DBConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connector {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/telalogin?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		try {
			System.out.println("1");
			Class.forName(DRIVER);
			System.out.println("2");
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println(ex);
			return null;
		}
	}

	public static void closeConnection(Connection con, PreparedStatement stmt) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
