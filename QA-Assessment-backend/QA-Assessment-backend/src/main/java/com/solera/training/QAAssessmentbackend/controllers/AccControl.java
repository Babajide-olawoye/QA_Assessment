package com.solera.training.QAAssessmentbackend.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.solera.training.QAAssessmentbackend.entity.Account;
import com.solera.training.QAAssessmentbackend.entity.User;
import com.solera.training.QAAssessmentbackend.repos.AccountRepo;
import com.solera.training.QAAssessmentbackend.services.AccsData;
import com.solera.training.QAAssessmentbackend.services.UserData;

@Controller
public class AccControl {
	AccountRepo accountRepo = new AccountRepo();

	@GetMapping(path="/GetAccDeets")
	public List<Account> allAccount() {
		return accountRepo.getAllAccounts();
	}
	
	@GetMapping(path="/user/{id}")
	public Account getUser(@PathVariable int id) {
		
		return accountRepo.getAnAccount(id);
	}
	
	
	

}
