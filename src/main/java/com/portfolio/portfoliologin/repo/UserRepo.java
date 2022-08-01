package com.portfolio.portfoliologin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.portfoliologin.model.User;

@Repository
public interface UserRepo extends JpaRepository <User,String> {
    User findByUserId(String userId);
}
