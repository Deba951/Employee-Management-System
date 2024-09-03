package service;

import model.Employee;
import exception.EmployeeNotFoundException;

import java.util.HashMap;

public class EmployeeService {
    private HashMap<Integer, Employee> employees = new HashMap<>();

    // Method to add a new employee to the system
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
        System.out.println("Employee added successfully: " + employee);
    }

    // Method to remove an employee from the system
    public void removeEmployee(int employeeId) {
        if (!employees.containsKey(employeeId)) {
            throw new EmployeeNotFoundException("Employee not found with ID: " + employeeId);
        }
        
        employees.remove(employeeId);
        System.out.println("Employee removed successfully with ID: " + employeeId);
    }

    // Method to update the details of an existing employee
    public void updateEmployee(int employeeId, Employee updatedEmployee) {
        if (!employees.containsKey(employeeId)) {
            throw new EmployeeNotFoundException("Employee not found with ID: " + employeeId);
        }
        
        employees.put(employeeId, updatedEmployee);
        System.out.println("Employee updated successfully: " + updatedEmployee);
    }

    // Method to retrieve an employee's details
    public Employee getEmployee(int employeeId) {
        if (!employees.containsKey(employeeId)) {
            throw new EmployeeNotFoundException("Employee not found with ID: " + employeeId);
        }
        
        return employees.get(employeeId);
    }

    // Method to assign an employee to a department
    public void assignEmployeeToDepartment(int employeeId, int departmentId) {
        Employee employee = getEmployee(employeeId);
        employee.setDepartmentId(departmentId);
        System.out.println("Employee assigned to department successfully: " + employee);
    }

    // Method to update the department assignment of an employee
    public void updateEmployeeDepartment(int employeeId, int newDepartmentId) {
        Employee employee = getEmployee(employeeId);
        employee.setDepartmentId(newDepartmentId);
        System.out.println("Employee department updated successfully: " + employee);
    }

    // Method to list all employees
    public void listAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } 
        
        else {
            employees.values().forEach(System.out::println);
        }
    }
}
