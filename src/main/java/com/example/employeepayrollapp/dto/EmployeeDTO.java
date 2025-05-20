package com.example.employeepayrollapp.dto;

public class EmployeeDTO {
    private String name;
    private String department;
    private long salary;

    public EmployeeDTO() {}

    public EmployeeDTO(String name, String department, long salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
