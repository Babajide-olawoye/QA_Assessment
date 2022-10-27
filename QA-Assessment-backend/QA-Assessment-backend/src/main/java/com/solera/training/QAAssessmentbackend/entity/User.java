package com.solera.training.QAAssessmentbackend.entity;

public class User {
	private String fName;
	private String lName;
	private String userName;
	private String pword;
	private Account acc;
	public User(String fName, String lName, String userName, String pword, Account acc) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.userName = userName;
		this.pword = pword;
		this.acc = acc;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	
	public Account getAcc() {
		return acc;
	}
	private void setAcc(Account acc) {
		this.acc = acc;
	}
	
	//Login func
	
	public boolean loginFunc(String username, String password) {
		if(username.equalsIgnoreCase(this.userName) && password.equals(this.pword)) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
	}
	

}
