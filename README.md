# Employee Management System

## Overview

The **Employee Management System** is a Java-based console application designed to help HR administrators manage employee records and departmental information efficiently. Built with Core Java, the system implements key Object-Oriented Programming (OOP) principles, offering a modular, maintainable, and scalable solution for HR management tasks. The system handles operations such as adding, removing, and updating employee and department records, as well as assigning employees to specific departments.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [How to Run the Application](#how-to-run-the-application)
- [Instructions for Each Feature](#instructions-for-each-feature)
- [Exception Handling](#exception-handling)
- [Application Design](#application-design)
- [Object-Oriented Principles Applied](#object-oriented-principles-applied)

## Features

- **Add Employee**: Add new employees with details like name, designation, salary, and department.
- **Remove Employee**: Remove employees from the system using their unique ID.
- **Update Employee**: Update existing employee details.
- **Add Department**: Create new departments and assign employees to them.
- **Remove Department**: Delete departments that are no longer needed.
- **Assign Employee to Department**: Link employees to specific departments.
- **Update Employee Department**: Modify the department assignment of an employee.
- **List All Employees and Departments**: Display the current list of employees and departments.

## Technologies Used

- **Java**: Core Java is used for developing the entire application.

## Project Structure

```plaintext
EmployeeManagementSystem/
|-- src/
    |-- main/
    |   |-- EmployeeManagementSystem.java      # Main application class
    |
    |-- model/
    |   |-- Employee.java                      # Employee model class
    |   |-- Department.java                    # Department model class
    |
    |-- service/
    |   |-- EmployeeService.java               # Employee service class
    |   |-- DepartmentService.java             # Department service class
    |
    |-- exception/
    |   |-- EmployeeNotFoundException.java     # Custom exception for Employee
    |   |-- DepartmentNotFoundException.java   # Custom exception for Department
    |
    |-- util/
        |-- InputValidator.java                # Utility class for input validation
```

## Setup and Installation

### Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher.
- **IDE**: IntelliJ IDEA, VS Code, Eclipse, or any Java-supporting IDE.

### Steps to Set Up

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/Deba951/27667380.git
    cd 27667380
    ```
   ```Or Downlod the zip file and unzip the repository.```

2. **Open the Project in an IDE**:
    - Open the project in your preferred IDE.
    - Ensure that the JDK is properly configured in the IDE settings.

3. **Build the Project**:
    - Compile the project using your IDE's build tools or via the command line:
      ```bash
      javac src/main/EmployeeManagementSystem.java
      ```

## How to Run the Application

1. **Navigate to Main Class**:
   - Go to `src/main/EmployeeManagementSystem.java`.

2. **Run the Main Class**:
   - Run the class using the IDE's run configuration or via the command line:
     ```bash
     java src/main/EmployeeManagementSystem
     ```

3. **Interact with the System**:
   - The application will display a menu. Follow the prompts to add, remove, or update employees and departments.

## Instructions for Each Feature

1. **Add Employee**:
   - Choose option `1`.
   - Enter the required details: ID, name, designation, salary, department ID.
   - The employee will be added to the system.

2. **Remove Employee**:
   - Choose option `2`.
   - Enter the employee's ID.
   - The employee will be removed, or an error will be displayed if the ID is invalid.

3. **Update Employee**:
   - Choose option `3`.
   - Enter the employee's ID and the updated details.
   - The system will update the employee's record.

4. **Add Department**:
   - Choose option `4`.
   - Enter the department's ID, name, and description.
   - The department will be added to the system.

5. **Remove Department**:
   - Choose option `5`.
   - Enter the department's ID.
   - The department will be removed.

6. **Assign Employee to Department**:
   - Choose option `6`.
   - Enter the employee ID and the department ID.
   - The employee will be assigned to the department.

7. **Update Employee Department**:
   - Choose option `7`.
   - Enter the employee ID and the new department ID.
   - The department assignment will be updated.

8. **List All Employees and Departments**:
   - Choose options `8` and `9` respectively to view lists of all employees and departments.

9. **Exit the Application**:
   - Choose option `0` to safely exit the application.

## Exception Handling

The application implements robust exception handling to ensure smooth operation:

- **Custom Exceptions**:
  - `EmployeeNotFoundException`: Thrown when an operation is attempted on a non-existent employee.
  - `DepartmentNotFoundException`: Thrown when an operation is attempted on a non-existent department.

- **Input Validation**:
  - `InputValidator`: Ensures that inputs like IDs, names, and salaries meet the required criteria before processing.

- **Error Messages**:
  - User-friendly error messages are displayed whenever an exception is caught, allowing users to understand and correct their actions without crashing the application.

## Application Design

The Employee Management System is built with a modular architecture:

- **Encapsulation**: Attributes are private, with public getters and setters.
- **Abstraction**: The service layer abstracts complex business logic.
- **Inheritance**: Custom exceptions inherit from `RuntimeException`.
- **Polymorphism**: Methods like `toString` are overridden for custom object representations.

## Object-Oriented Principles Applied

- **Encapsulation**: Protects the internal state of objects through private attributes and public methods.
- **Abstraction**: Simplifies interaction with complex operations via service classes.
- **Inheritance**: Promotes code reuse through custom exceptions.
- **Polymorphism**: Allows different implementations of `toString` and other methods.
