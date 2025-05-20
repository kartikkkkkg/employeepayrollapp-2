package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private List<Employee> employeeList = new ArrayList<>();
    private int currentId = 1;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Employee Payroll App 2!";
    }

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody EmployeeDTO dto) {
        Employee newEmp = new Employee(currentId++, dto.getName(), dto.getDepartment(), dto.getSalary());
        employeeList.add(newEmp);
        return newEmp;
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody EmployeeDTO dto) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                emp.setName(dto.getName());
                emp.setDepartment(dto.getDepartment());
                emp.setSalary(dto.getSalary());
                return emp;
            }
        }
        throw new RuntimeException("Employee not found with ID: " + id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeList.removeIf(emp -> emp.getId() == id);
        return "Deleted employee with ID: " + id;
    }
}
