package com.solera.training.QAAssessmentbackend;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.json.JSONArray;

import org.testng.annotations.DataProvider;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Data {
	private static List<User> users = new ArrayList<>();

	static {
		setUserObj();
	}
	

	private static void setUserObj() {
		User user1 = new User("James", "Franklin", "J_Frank", "Frank.2022");
		User user2 = new User("Henry", "Horrid", "HH_Beast", "Horrid2022");
		User user3 = new User("King", "Kong", "DonkeyKong_4lif", "Password");

		users.add(user1);
		users.add(user3);
		users.add(user2);
	}
	
	public List<User> getUsers() {
		return users;
	}
	
	public User getUser(String userName, String pWord) {

		for (User user : users) {
			if(user.getUserName().equalsIgnoreCase(userName) && user.loginFunc(userName, pWord)) {
				return user;
			}
		}
		return null;
		
	}
	
	
	
//	
//	//Returns User data in json format
//	public JSONObject getUserJson() throws IOException {
//		// Creating Object of ObjectMapper define in Jackson API
//		ObjectMapper Obj = new ObjectMapper();
//		JSONObject object = new JSONObject();
//
//		// Converting the Java object into a JSON string
//		String jsonStr = Obj.writeValueAsString(users);
//		// Displaying Java object into a JSON string
//
//		JSONArray array = new JSONArray(jsonStr);
//
//		for (int i = 0; i < array.length(); i++) {
//			object = array.getJSONObject(i);
//		}
//
//		return object;
//	}
//
//	public static void main(String[] args) {
//		// Creating object of Product
//
//		// Inserting the data into the object
//		Data data = new Data();
//		List<User> users = data.getUsers();
//
//		// Creating Object of ObjectMapper define in Jackson API
//		ObjectMapper Obj = new ObjectMapper();
//
//		try {
//			// Converting the Java object into a JSON string
//			String jsonStr = Obj.writeValueAsString(users);
//			// Displaying Java object into a JSON string
//			System.out.println(jsonStr);
//
//			JSONArray array = new JSONArray(jsonStr);
//
//			for (int i = 0; i < array.length(); i++) {
//				JSONObject object = array.getJSONObject(i);
//				System.out.println(object.getString("fName"));
//				System.out.println(object.getString("lName"));
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
////		String loudScreaming = jsonStr.getJSONObject("LabelData").getString("slogan");

//	}

}
