package com.coderscampus.assignment3;

public class User{
	private String name;
	private String userName;
	private String password;
	public User(String _userName, String _password,String _name) {
		this.setUserName(_userName);
		this.setPassword(_password);
		this.setName(_name);
	}
	// copy constructor to handle reference trap
	public User(User source){
		this.name = source.name;	
		this.userName = source.userName;
		this.password = source.password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", userName=" + userName + ", password=" + password + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
