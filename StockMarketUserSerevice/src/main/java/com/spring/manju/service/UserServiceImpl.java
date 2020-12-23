package com.spring.manju.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.manju.bean.User;
import com.spring.manju.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository repo;
	
	@Override
	@Transactional
	public boolean loginValidation(String username, String password)
	{
		User user=repo.findByUsernameAndPassword(username, password);
		if(Objects.isNull(user))
		{
			return false;
		}
		return true;
	}
	
	@Override
	@Transactional
	public User registerUser(User user)
	{
		return repo.save(user);
	
		
	}
	
	@Override
	@Transactional
	public List<User> getAllUsers()
	{
		return repo.findAll();
		
	}

}
