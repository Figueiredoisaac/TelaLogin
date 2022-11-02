package br.com.figueiredoisaac.DBConection.bean;

public class User {

	private int id;
	private String user;
	private String password;
	private static int total;

	public User(String user, String password) {
		this.id = total;
		this.password = password;
		this.user = user;
		total++;

	}
	public void reduzTotal() {
		total--;
	}
		
	public int getId() {
		return id;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
