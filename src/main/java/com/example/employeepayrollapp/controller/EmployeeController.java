package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.Employee;
import com.example.employeepayrollapp.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Employee Payroll App 2!";
    }

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody EmployeeDTO dto) {
        return employeeService.createEmployee(dto);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody EmployeeDTO dto) {
        return employeeService.updateEmployee(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }
}
