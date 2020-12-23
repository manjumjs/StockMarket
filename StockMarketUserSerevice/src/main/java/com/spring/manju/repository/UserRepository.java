package com.spring.manju.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.manju.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsernameAndPassword(String username,String password);

}
