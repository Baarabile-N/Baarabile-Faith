/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Login1Test class to validate user inputs and simulate login/register testing.
 *
 * @author RC_Student_lab
 */
public class Login1Test {

    private String username = "user_";
    private String phone = "+27123456789";
    private String password = "P@ssw0rd";

    // Helper method to validate username
    private boolean validateUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Helper method to validate password complexity
    private boolean validatePasswordComplexity(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[@#$%^&+=].*");
    }

    // Helper method to validate phone number
    private boolean validateCellPhoneNumber(String phone) {
        String saCode = "+27";
        return phone.startsWith(saCode) && phone.length() == 12;
    }

    // Test methods
    @Test
    public void testCheckUserName() {
        boolean result = validateUserName(username);
        assertTrue("Username validation failed", result);
    }

    @Test
    public void testCheckPasswordComplexity() {
        boolean result = validatePasswordComplexity(password);
        assertTrue("Password complexity validation failed", result);
    }

    @Test
    public void testCheckCellPhoneNumber() {
        boolean result = validateCellPhoneNumber(phone);
        assertTrue("Cellphone number validation failed", result);
    }

    @Test
    public void testRegisterUser() {
        boolean validateUserName = validateUserName(username);
        boolean validatePassword = validatePasswordComplexity(password);
        boolean validatePhone = validateCellPhoneNumber(phone);

        if (validateUserName && validatePassword && validatePhone) {
            System.out.println("User is successfully registered");
        } else {
            System.out.println("User registration failed!");
        }
    }

    @Test
    public void testLoginUser() {
        boolean validateUserName = validateUserName(username);
        boolean validatePassword = validatePasswordComplexity(password);

        if (validateUserName && validatePassword) {
            System.out.println("A successful login");
        } else {
            System.out.println("A failed login");
        }
    }
}
