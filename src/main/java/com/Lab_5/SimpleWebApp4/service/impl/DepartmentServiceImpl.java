package com.Lab_5.SimpleWebApp4.service.impl;

import com.Lab_5.SimpleWebApp4.entity.Department;
import com.Lab_5.SimpleWebApp4.repository.DepartmentRep;
import com.Lab_5.SimpleWebApp4.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRep departmentRepository;
    @Override
    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();

    }
}
