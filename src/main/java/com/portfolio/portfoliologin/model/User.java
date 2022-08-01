package com.portfolio.portfoliologin.model;

import javax.persistence.Entity;
import javax.persistence.Id    ;
import javax.persistence.Table ;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data              ;
import lombok.NoArgsConstructor ;

@Entity
@Table(name="loginUser")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class User {
    
    

	@Id
    private String userId  ;
    private String password;
    
    public String getUserId(){
        return userId;
    }

    public Object getPassword(){
        return password;
    }
    
    public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
