package com.example.employeeservice.service.impl;

import com.example.employeeservice.modal.Department;
import com.example.employeeservice.modal.Employeee;
import com.example.employeeservice.repository.EmployeeRepository;
import com.example.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employeee saveOrUpdate(Employeee employeee) {
        return repository.save(employeee);
    }

    @Override
    public List<Employeee> getAll() {
        return repository.findAll();
    }

    @Override
    public Employeee getOneById(Long id) {
        return repository.findById(id).get();
    }

}
