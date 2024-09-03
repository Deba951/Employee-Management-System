package service;

import model.Department;
import exception.DepartmentNotFoundException;

import java.util.HashMap;

public class DepartmentService {
    private HashMap<Integer, Department> departments = new HashMap<>();

    // Method to add a new department to the system
    public void addDepartment(Department department) {
        departments.put(department.getId(), department);
        System.out.println("Department added successfully: " + department);
    }

    // Method to remove a department from the system
    public void removeDepartment(int departmentId) {
        
        if (!departments.containsKey(departmentId)) {
            throw new DepartmentNotFoundException("Department not found with ID: " + departmentId);
        }
        
        departments.remove(departmentId);
        System.out.println("Department removed successfully with ID: " + departmentId);
    }

    // Method to update the details of an existing department
    public void updateDepartment(int departmentId, Department updatedDepartment) {
        
        if (!departments.containsKey(departmentId)) {
            throw new DepartmentNotFoundException("Department not found with ID: " + departmentId);
        }
        
        departments.put(departmentId, updatedDepartment);
        System.out.println("Department updated successfully: " + updatedDepartment);
    }

    // Method to retrieve a department's details
    public Department getDepartment(int departmentId) {
        
        if (!departments.containsKey(departmentId)) {
            throw new DepartmentNotFoundException("Department not found with ID: " + departmentId);
        }
        
        return departments.get(departmentId);
    }

    // Method to list all departments
    public void listAllDepartments() {
        
        if (departments.isEmpty()) {
            System.out.println("No departments found.");
        } 
        
        else {
            departments.values().forEach(System.out::println);
        }
    }
}
