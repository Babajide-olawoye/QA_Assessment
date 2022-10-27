package com.solera.training.QAAssessmentbackend.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.solera.training.QAAssessmentbackend.entity.Account;

@Component
public class AccsData {
	private static List<Account> accList = new ArrayList();
	static {
		setAccObj();
	}
	
	//Create static List of users
	private static void setAccObj() {
		Account acc1 = new Account(generateID(), 200);
		Account acc2 = new Account(generateID(), 928);
		Account acc3 = new Account(generateID(), 278);
		
		accList.add(acc1);
		accList.add(acc2);
		accList.add(acc3);
		
	}
	
	//Returns List of all acount
	public static List<Account> getAccList() {
		return accList;
	}

	//Generate random number for account ID
	private static int generateID() {
		Random randomNum = new Random();
		int id = 100 + randomNum.nextInt(9999);
		return id;
	}
}
