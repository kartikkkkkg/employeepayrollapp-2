# EmployeePayrollApp-2

A simple Spring Boot REST API to manage employee payroll data.

## ✅ UC1 - Project Setup
- Initialized using Spring Initializr
- Dependencies: Spring Web, DevTools
- Added a WelcomeController with `/employee/welcome`
- Tested using Postman
---

## ✅ UC2 - Basic CRUD (In-Memory)
- Created `EmployeeDTO` and `Employee` model
- Added REST endpoints in `EmployeeController`:
  - `POST /employee/create`
  - `GET /employee/getAll`
  - `PUT /employee/update/{id}`
  - `DELETE /employee/delete/{id}`
- Stored data in in-memory list
- Tested using Postman

