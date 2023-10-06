package com.example.Project2Boot.dao;


import com.example.Project2Boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Integer> {
}

