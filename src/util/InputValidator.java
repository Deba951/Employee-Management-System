package util;

public class InputValidator {

    // Method to validate that a name contains only letters and spaces
    public static boolean validateName(String name) {
        return name != null && name.matches("[A-Za-z ]+");
    }

    // Method to validate that the salary is a positive number
    public static boolean validateSalary(double salary) {
        return salary > 0;
    }

    // Method to validate that an ID is a positive integer
    public static boolean validateId(int id) {
        return id > 0;
    }
}
