package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee createEmployee(EmployeeDTO dto);
    List<Employee> getAllEmployees();
    Employee updateEmployee(int id, EmployeeDTO dto);
    String deleteEmployee(int id);
}
