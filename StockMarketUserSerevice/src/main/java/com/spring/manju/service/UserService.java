package com.spring.manju.service;


import java.util.List;

import com.spring.manju.bean.User;

public interface UserService {
	
	public boolean loginValidation(String username,String password);
	public User registerUser(User user);
	public List<User> getAllUsers();
	

}
