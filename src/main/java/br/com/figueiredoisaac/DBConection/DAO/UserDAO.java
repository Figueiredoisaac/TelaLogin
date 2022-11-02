package br.com.figueiredoisaac.DBConection.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.figueiredoisaac.DBConection.Connector;
import br.com.figueiredoisaac.DBConection.bean.User;

public class UserDAO {
	public void Insert(User u) throws SQLException, ClassNotFoundException {
		Connection con = Connector.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("INSERT INTO acessos VALUES (?, ?)");
			stmt.setString(1, u.getUser());
			stmt.setString(2, u.getPassword());
			stmt.executeUpdate();

		} catch (SQLException ex) { 
			System.out.println(ex);
		} 
	}

	public void Delete(User u) throws SQLException, ClassNotFoundException {
		Connection con = Connector.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("DELETE FROM acessos WHERE user = ?");
			stmt.setString(1, u.getUser());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}

	public void Update(User u) throws SQLException, ClassNotFoundException {
		Connection con = Connector.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("UPDATE acessos SET password = ? WHERE user = ?");
			stmt.setString(1, u.getPassword());
			stmt.setString(2, u.getUser());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			System.out.println(ex);
		}
	}

	public List<User> Select() throws SQLException, ClassNotFoundException {
		Connection con = Connector.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<User> users = new ArrayList<>();
		try {
			stmt = con.prepareStatement("SELECT * FROM acessos");
			rs = stmt.executeQuery();
			while (rs.next()) {
				String userName = rs.getString("user");
				String userPassword = rs.getString("password");
				User user = new User(userName, userPassword);
				users.add(user);
			}
		} catch (SQLException ex) {
			Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
		}
		return users;
	}

}
