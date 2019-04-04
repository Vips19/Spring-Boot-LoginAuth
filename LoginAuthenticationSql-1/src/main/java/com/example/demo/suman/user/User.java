package com.example.demo.suman.user;


public class User {

	private String name;
	private String address;
	private String  contactNo;
	private String userName;
	private String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String address, String contactNo, String userName, String password) {
		super();
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
		this.userName = userName;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
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
