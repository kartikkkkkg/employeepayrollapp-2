package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.Employee;
import com.example.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(EmployeeDTO dto) {
        Employee emp = new Employee();
        emp.setName(dto.getName());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());
        return employeeRepository.save(emp);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(int id, EmployeeDTO dto) {
        Employee emp = employeeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
        emp.setName(dto.getName());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());
        return employeeRepository.save(emp);
    }

    @Override
    public String deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return "Deleted employee with ID: " + id;
    }
}
