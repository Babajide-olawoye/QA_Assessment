package com.solera.training.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.solera.training.QAAssessmentbackend.entity.User;
import com.solera.training.QAAssessmentbackend.services.UserData;

public class testData {
	UserData data = new UserData();
	List<User> testUserList = new ArrayList();

	@BeforeMethod
	public void users() {
		testUserList = data.getUsers();
	}

	@Test // Test if List is populate with user details
	public void checkList() {
		// assertTrue(testUserList.size() == 0); - returns false, as expected
		
		assertTrue(testUserList.size() > 0);
	}

	// "James", "Franklin", "J_Frank"
	@Test
	public void checkUserDetails_Fname() {

		String actualFname = testUserList.get(0).getfName();
		String pedictedFname = "James";

		assertEquals(actualFname, pedictedFname);
	}

	@Test
	public void checkUserDetails_Lname() {

		String actualLname = testUserList.get(0).getlName();
		String pedictedLname = "Franklin";

		assertEquals(actualLname, pedictedLname);
	}

	@Test
	public void checkUserDetails_Username() {

		String actualUsername = testUserList.get(0).getUserName();
		String pedictedUsername = "J_Frank";

		assertEquals(actualUsername, pedictedUsername);
	}
	
	
	

	// Test Login func
	// "James", "Franklin", "J_Frank", "Frank.2022"
	@Test
	public void testLoginFunc() {
		boolean actualAnwer;
		String userName = "J_Frank";
		String pword = "Frank.2022";

		actualAnwer = testUserList.get(0).loginFunc(userName, pword);

		assertTrue(actualAnwer);

	}

	// Test mix up username and passwords
	//testing on "James", "Franklin", "J_Frank", "Frank.2022"
	//and "Henry", "Horrid", "HH_Beast", "Horrid2022"
	@Test
	public void testLoginFunc_Mix() {
		boolean actualAnwer;
		String userName = "J_Frank";
		String pword = "Horrid2022";

		actualAnwer = testUserList.get(0).loginFunc(userName, pword);

		assertFalse(actualAnwer);
	}

	// Test to make sure Password is case sensitive
	//testing on "James", "Franklin", "J_Frank", "Frank.2022"
	@Test
	public void testLoginFunc_CapCase_passwor() {
		boolean actualAnwer;
		String userName = "J_Frank";
		String pword = "fRANK.2022";
		//String pword = "Frank.2022"; This failed just as expected

		
		actualAnwer = testUserList.get(0).loginFunc(userName, pword);
		assertFalse(actualAnwer);
	}

	// Test to make sure Username is NOT case sensitive
	//testing on "James", "Franklin", "J_Frank", "Frank.2022"
	@Test
	public void testLoginFunc_CapCase_Username() {
		boolean actualAnwer;
		String userName = "j_fRANK";
		String pword = "Frank.2022";

		actualAnwer = testUserList.get(0).loginFunc(userName, pword);
		assertTrue(actualAnwer);
	}
	
	

}
