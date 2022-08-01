package com.portfolio.portfoliologin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.portfoliologin.model.User;
import com.portfolio.portfoliologin.repo.UserRepo;
import com.portfolio.portfoliologin.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
     
    @Autowired
     private UserService userService;
     
      @Autowired
      private UserRepo userRepo;
    
    @GetMapping("/list")
    public List<User> getUser() {
	return	userService.getUser();	
	}
    
    @PostMapping("/new")
    public String createUser(@RequestBody User user) {
    	userService.saveUser(user);
    	return "El usuario se creo de forma correcta";
    }
    
    @DeleteMapping("/delete/userId")
    public String deleteUserByID(@PathVariable String userId) {
    userService.deleteUserById(userId);
    return "El usuario se elimino de forma correcta";
    }

    @GetMapping("/perfil")
    public User findUser() {
    return userService.findUserById((String)"test1@test.com"); 	
    }
    
    @PostMapping("/login")
     public ResponseEntity<?> loginUser(@RequestBody User userData){
        
        System.out.println(userData);
        
        User user = userRepo.findByUserId(userData.getUserId());
        
        if(user.getPassword().equals(userData.getPassword()))
        return ResponseEntity.ok(user);
        return (ResponseEntity<?>)ResponseEntity.internalServerError();
        }


}
