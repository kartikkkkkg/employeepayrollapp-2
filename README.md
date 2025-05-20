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

---

## ✅ UC3 - Service Layer and Architecture
- Created `service` package with interface and implementation
- Moved all logic from controller to `EmployeeService`
- Controller now only handles HTTP, calls service layer
- Follows clean layered architecture: Controller → Service → Model

---

## ✅ UC4 - Database Integration (MySQL + JPA)
- Added MySQL + JPA dependencies
- Configured `application.properties`
- Annotated `Employee` with `@Entity`
- Created `EmployeeRepository` interface
- Replaced in-memory list with real database
- Fully tested via Postman

### UC5 - Get Employee By ID ✅
- New endpoint: `GET /employee/{id}`
- Retrieves employee details by ID from the database.
- If ID not found, returns a 404-style error response.
