package com.example.Project2Boot.service;


import com.example.Project2Boot.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User getUserById(Integer id);
    void saveUser(User user);
    void deleteUser(Integer id);

    void updateUser(User user, Integer id);
}
