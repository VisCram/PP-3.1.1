package com.example.Project2Boot.dao;


import com.example.Project2Boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository  extends JpaRepository<User,Integer> {
}

