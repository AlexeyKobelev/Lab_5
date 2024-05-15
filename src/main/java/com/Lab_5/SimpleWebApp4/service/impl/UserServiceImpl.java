package com.Lab_5.SimpleWebApp4.service.impl;

import com.Lab_5.SimpleWebApp4.entity.User;
import com.Lab_5.SimpleWebApp4.repository.UserRep;
import com.Lab_5.SimpleWebApp4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRep entityRepository;
    @Override
    public User findByUserName(String userName) {
        return entityRepository.findByName(userName);
    }

    @Override
    public User addUser(User user) {
        user.setRole("user");return entityRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return  entityRepository.findAll();
    }
}
