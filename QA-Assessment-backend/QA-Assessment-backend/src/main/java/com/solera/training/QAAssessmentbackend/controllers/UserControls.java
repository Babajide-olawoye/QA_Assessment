package com.solera.training.QAAssessmentbackend.controllers;

import java.io.IOException;
import java.util.List;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.solera.training.QAAssessmentbackend.entity.User;
import com.solera.training.QAAssessmentbackend.services.UserData;

@RestController
public class UserControls {
	private UserData data;
	
	
	public UserControls(UserData data) {
		this.data = data;
	}
	

	@GetMapping(path="/AllUserData")
	public List<User> helloWorld() {
		return data.getUsers();
	}
	
	@GetMapping(path="/user/{name}/{pWord}")
	public User getUser(@PathVariable String name, @PathVariable String pWord) {
		
		return data.getUser(name, pWord);
	}
	
}
