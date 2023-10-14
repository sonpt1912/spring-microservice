package com.example.employeeservice.controller;

import com.example.employeeservice.modal.Employeee;
import com.example.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/get-all")
    public List<Employeee> getAll() {
        return service.getAll();
    }

    @PostMapping("/save")
    public Employeee saveOrUpdate(@RequestBody Employeee employeee) {
        return service.saveOrUpdate(employeee);
    }

    @GetMapping("/get-one/{id}")
    public Employeee getOneById(@PathVariable("id") Long id) {
        return service.getOneById(id);
    }

    @GetMapping("/get-by-department/{id}")
    public List<Employeee> getByDepartment(@PathVariable("id") Long id) {
        return service.getByDepartment(id);
    }

}
