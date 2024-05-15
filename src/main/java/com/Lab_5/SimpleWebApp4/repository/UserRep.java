package com.Lab_5.SimpleWebApp4.repository;

import com.Lab_5.SimpleWebApp4.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRep extends JpaRepository<User, Long>{
    User findByName(String username);
}
