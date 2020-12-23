package com.spring.manju.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.manju.bean.User;
import com.spring.manju.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value="/user/login/{username}/{password}",method = RequestMethod.GET)
	public ResponseEntity<String> loginUser(@PathVariable String username,@PathVariable String password)
	{
		if(service.loginValidation(username, password))
		{
			return ResponseEntity.status(HttpStatus.FOUND).body("Login Successfull!");
		}
		return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid Credential");
	}
	
	@RequestMapping(value="/user/adduser",method = RequestMethod.POST)
	public ResponseEntity<User> addUser(@RequestBody User user)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(service.registerUser(user));
	}
	
	@RequestMapping(value="/user/getallusers",method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers()
	{
		return ResponseEntity.status(HttpStatus.FOUND).body(service.getAllUsers());
	}

}
