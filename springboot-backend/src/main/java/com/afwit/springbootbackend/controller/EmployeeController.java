package com.afwit.springbootbackend.controller;

import com.afwit.springbootbackend.entity.Employee;
import com.afwit.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping
    public ResponseEntity<List<Employee>> fetchEmployee(){
        return ResponseEntity.ok().body(employeeRepository.findAll());
    }
}
