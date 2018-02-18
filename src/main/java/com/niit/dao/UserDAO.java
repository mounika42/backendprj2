package com.niit.dao;

import com.niit.model.User;

public interface UserDAO {
	 void registerUser(User user);
	 boolean isEmailUnique(String email);
	 User login(User user);
	void update(User user);
	User getUser(String email);
	
}
