package com.example.employeepayrollapp.service;

import com.example.employeepayrollapp.dto.EmployeeDTO;
import com.example.employeepayrollapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    private List<Employee> employeeList = new ArrayList<>();
    private int currentId = 1;

    @Override
    public Employee createEmployee(EmployeeDTO dto) {
        Employee newEmp = new Employee(currentId++, dto.getName(), dto.getDepartment(), dto.getSalary());
        employeeList.add(newEmp);
        return newEmp;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public Employee updateEmployee(int id, EmployeeDTO dto) {
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

    @Override
    public String deleteEmployee(int id) {
        employeeList.removeIf(emp -> emp.getId() == id);
        return "Deleted employee with ID: " + id;
    }
}
