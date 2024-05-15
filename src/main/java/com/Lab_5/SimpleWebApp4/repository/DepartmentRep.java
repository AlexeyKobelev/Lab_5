package com.Lab_5.SimpleWebApp4.repository;

import com.Lab_5.SimpleWebApp4.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRep extends JpaRepository<Department, Long> {
}

