package main;

import model.Employee;
import model.Department;
import service.EmployeeService;
import service.DepartmentService;
import util.InputValidator;
import exception.EmployeeNotFoundException;
import exception.DepartmentNotFoundException;

import java.util.Scanner;

public class EmployeeManagementSystem {

    private static EmployeeService employeeService = new EmployeeService();
    private static DepartmentService departmentService = new DepartmentService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            handleMenuChoice(choice);
        } while (choice != 0);
    }

    private static void showMenu() {
        System.out.println("\n=== Employee Management System ===");
        System.out.println("1. Add Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. Update Employee");
        System.out.println("4. Add Department");
        System.out.println("5. Remove Department");
        System.out.println("6. Assign Employee to Department");
        System.out.println("7. Update Employee Department");
        System.out.println("8. List All Employees");
        System.out.println("9. List All Departments");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                addEmployee();
                break;
            case 2:
                removeEmployee();
                break;
            case 3:
                updateEmployee();
                break;
            case 4:
                addDepartment();
                break;
            case 5:
                removeDepartment();
                break;
            case 6:
                assignEmployeeToDepartment();
                break;
            case 7:
                updateEmployeeDepartment();
                break;
            case 8:
                listAllEmployees();
                break;
            case 9:
                listAllDepartments();
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter Department ID: ");
        int departmentId = scanner.nextInt();

        if (InputValidator.validateId(id) && InputValidator.validateName(name) && InputValidator.validateSalary(salary)) {
            Employee employee = new Employee(id, name, designation, salary, departmentId);
            employeeService.addEmployee(employee);
            System.out.println("Employee added successfully.");
        } 
        
        else {
            System.out.println("Invalid input. Please try again.");
        }
    }

    private static void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        int employeeId = scanner.nextInt();

        try {
            employeeService.removeEmployee(employeeId);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void updateEmployee() {
        System.out.print("Enter Employee ID to update: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter new Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new Designation: ");
        String designation = scanner.nextLine();

        System.out.print("Enter new Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter new Department ID: ");
        int departmentId = scanner.nextInt();

        if (InputValidator.validateName(name) && InputValidator.validateSalary(salary)) {
            Employee updatedEmployee = new Employee(employeeId, name, designation, salary, departmentId);
            try {
                employeeService.updateEmployee(employeeId, updatedEmployee);
                System.out.println("Employee updated successfully.");
            } catch (EmployeeNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } 
        
        else {
            System.out.println("Invalid input. Please try again.");
        }
    }

    private static void addDepartment() {
        System.out.print("Enter Department ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Department Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department Description: ");
        String description = scanner.nextLine();

        if (InputValidator.validateId(id) && InputValidator.validateName(name)) {
            Department department = new Department(id, name, description);
            departmentService.addDepartment(department);
            System.out.println("Department added successfully.");
        } 
        
        else {
            System.out.println("Invalid input. Please try again.");
        }
    }

    private static void removeDepartment() {
        System.out.print("Enter Department ID to remove: ");
        int departmentId = scanner.nextInt();

        try {
            departmentService.removeDepartment(departmentId);
        } catch (DepartmentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void assignEmployeeToDepartment() {
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();

        System.out.print("Enter Department ID: ");
        int departmentId = scanner.nextInt();

        try {
            employeeService.assignEmployeeToDepartment(employeeId, departmentId);
            System.out.println("Employee assigned to department successfully.");
        } catch (EmployeeNotFoundException | DepartmentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void updateEmployeeDepartment() {
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();

        System.out.print("Enter new Department ID: ");
        int departmentId = scanner.nextInt();

        try {
            employeeService.updateEmployeeDepartment(employeeId, departmentId);
            System.out.println("Employee department updated successfully.");
        } catch (EmployeeNotFoundException | DepartmentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void listAllEmployees() {
        employeeService.listAllEmployees();
    }

    private static void listAllDepartments() {
        departmentService.listAllDepartments();
    }
}
