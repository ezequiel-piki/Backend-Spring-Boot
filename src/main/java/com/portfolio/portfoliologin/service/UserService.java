package com.portfolio.portfoliologin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.portfolio.portfoliologin.model.User;
import com.portfolio.portfoliologin.repo.UserRepo;

@Service
public class UserService implements IUserService{

	@Autowired UserRepo userRepo;
	
	
	@Override
	public List<User> getUser() {
		List<User> user = userRepo.findAll();
		return user;
	}

	@Override
	public void saveUser(User user) {
	userRepo.save(user);
		
	}

	@Override
	public void deleteUserById(String userId) {
		userRepo.deleteById(userId);
		
	}

	@Override
	public User findUserById(String userId) {
		User user = userRepo.findById(userId).orElse(null);
		return user;
	}
	
	@Override
    public ResponseEntity<?> loginUser(User userData){
        
       
        
        User user = userRepo.findByUserId(userData.getUserId());
        
        if(user.getPassword().equals(userData.getPassword()))
        return ResponseEntity.ok(user);
       return (ResponseEntity<?>)ResponseEntity.internalServerError();
	
        }

}
