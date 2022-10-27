package com.solera.training.QAAssessmentbackend.repos;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.solera.training.QAAssessmentbackend.entity.Account;
import com.solera.training.QAAssessmentbackend.entity.User;
import com.solera.training.QAAssessmentbackend.services.AccsData;
import com.solera.training.QAAssessmentbackend.services.UserData;

public class AccountRepo {
	private AccsData accData;
	private UserData data;
	
	public List<Account> getAllAccounts() {
		return accData.getAccList();
	}
	
	//Get access to account with account id
	public Account getAnAccount(int id) {
		for (Account account : accData.getAccList()) {
			if(account.getAccountID() == id) {
				return account;
			}
		}
		return null;
	}
	
	//get access with your Username
	public Account getAnAccount(String userName) {
		List<User> allData = data.getUsers();
		for (User user : allData) {
			if(user.getUserName().equals(userName)) {
				return user.getAcc();
			}
		}
		return null;
	}
	
	//get access with first and last name
	public Account getAnAccount(String firstName, String lastName) {
		List<User> allData = data.getUsers();
		for (User user : allData) {
			if(user.getfName().equals(firstName) && user.getlName().equals(lastName)) {
				return user.getAcc();
			}
		}
		return null;
	}
	
	//Deposit money in account
	public void deposit(double funds, int id) {
		Account account = getAnAccount(id);
		account.deposit(funds);
	}
	
	//Withdraw money from account
	public void withdraw(double funds, int id) {
		Account account = getAnAccount(id);
		account.withdrawal(funds);
	}
	

	
}
