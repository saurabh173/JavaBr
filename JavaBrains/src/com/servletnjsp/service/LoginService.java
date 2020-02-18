package com.servletnjsp.service;

import java.util.HashMap;

import com.servletnjsp.model.User;

public class LoginService {
	HashMap<String, String> users = new HashMap<String, String>();
	
	public LoginService() {
		users.put("johndoe", "John Doe");
		users.put("janedoe", "Jane Doe");
		users.put("jguru", "Java Guru");
	}
	
	public boolean authenticate(String uid, String pw) {
		if(pw == null || pw.trim() == "") {
			return false;
		} else {
			return true;
		}
	}
	
	public User getUserDetails(String userId) {
		User user = new User();
		user.setUserId(userId);
		user.setUserName(users.get(userId));
		return user;
	}
}
