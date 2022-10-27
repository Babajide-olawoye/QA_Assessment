package com.solera.training.QAAssessmentbackend.entity;

public class Account {
	int accountID;
	double amount;
	
	public Account(int accountID, double amount) {
		super();
		this.accountID = accountID;
		this.amount = amount;
	}

	public int getAccountID() {
		return accountID;
	}

//	private void setAccountID(int accountID) {
//		this.accountID = accountID;
//	}

	public double getAmount() {
		return amount;
	}

	public void deposit(double amount) {
		this.amount += amount;
	}
	public void withdrawal(double amount) {
		this.amount -= amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	

}
