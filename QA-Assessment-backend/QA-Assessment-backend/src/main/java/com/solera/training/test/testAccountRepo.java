package com.solera.training.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.solera.training.QAAssessmentbackend.entity.Account;
import com.solera.training.QAAssessmentbackend.entity.User;
import com.solera.training.QAAssessmentbackend.repos.AccountRepo;
import com.solera.training.QAAssessmentbackend.services.UserData;

public class testAccountRepo {
	AccountRepo repo = new AccountRepo();
	List<Account>allAccount = new ArrayList<>();
	
	@BeforeMethod
	private void setupTest() {
		allAccount = repo.getAllAccounts();
	}
	
	@Test // Test if List is populate with user details
	public void checkList() {
		// assertTrue(allAccount.size() == 0); - returns false, as expected
		assertTrue(allAccount.size() == 3);
	}
	
	//Test whether userAcc == acc
	public void check() {
		List<User> users = new UserData().getUsers();
		
		assertEquals(users.get(0).getAcc(), allAccount.get(0));
	}
	
	
	//Value Im testing 333, 200
	@Test
	public void testGetAcc_ID() {
		int id = allAccount.get(0).getAccountID();
		Account perdictedAcc = new Account(333, 200);
		Account actualAcc = repo.getAnAccount(id);
		
		assertEquals(actualAcc.getAccountID(), perdictedAcc.getAccountID());
	}
	
	
	@Test
	public void testGetAcc_Username() {
		List<User> allData = new UserData().getUsers();
		
		
		int perdictedID = 333;
		int actualID = allAccount.get(0).getAccountID();
		
		assertEquals(actualID, perdictedID);
	}
	
	
	
}
