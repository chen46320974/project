package edu.hope.demo.model;

public class Administrator {
	private int administratorsid;
	private String name;
	private String phonenumber;
	private String username;
	private String password;
	public int getAdministratorsid() {
		return administratorsid;
	}
	public void setAdministratorsid(int administratorsid) {
		this.administratorsid = administratorsid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	@Override
	public String toString() {
		return "Administrator [administratorsid=" + administratorsid + ", name=" + name + ", phonenumber=" + phonenumber
				+ ", username=" + username + ", password=" + password + "]";
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
