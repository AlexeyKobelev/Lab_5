package com.Lab_5.SimpleWebApp4.service;

import com.Lab_5.SimpleWebApp4.entity.User;

import java.util.List;

public interface UserService {
    User findByUserName(String userName);
    User addUser(User user);
    List<User> findAllUsers();
}
