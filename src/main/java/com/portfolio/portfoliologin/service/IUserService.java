package com.portfolio.portfoliologin.service;

import java.util.List;

import org.springframework.http.ResponseEntity;


import com.portfolio.portfoliologin.model.User;

public interface IUserService {
    
	//Get list users
	public List <User> getUser();
	
	//Save object User
	public void saveUser(User user);
	
	//Delete object by Id
	public void deleteUserById(String userId);
	
	//Find User by ID
	public User findUserById(String userId);
	
	//Login User
    public ResponseEntity<?> loginUser(User userData);
}
