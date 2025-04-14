/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;
import javax.swing.JOptionPane;

public class MainTest {

    public MainTest() {
    }

    public static void main(String[] args) {
        // Prompt user inputs
        String username = JOptionPane.showInputDialog("Enter your username");
        String password = JOptionPane.showInputDialog("Enter your password");
        String phone = JOptionPane.showInputDialog("Enter your phone number");

        // Create and instantiate the Login1 object
        Login1 login1 = new Login1(); 

        // Validate inputs
        boolean validatePhone = login1.checkCellPhoneNumber(phone);
        boolean validatePassword = login1.checkPasswordComplexity(password);
        boolean validateUsername = login1.checkUserName(username);

        // Check and validate username
        if (validateUsername) {
            JOptionPane.showMessageDialog(null, "Username successfully captured");
        } else {
            JOptionPane.showMessageDialog(null, 
                "Username is not correctly formatted. Please ensure it contains an underscore and is no more than five characters long.");
        }

        // Check and validate password
        if (validatePassword) {
            JOptionPane.showMessageDialog(null, "Password successfully captured");
        } else {
            JOptionPane.showMessageDialog(null, 
                "Password is not correctly formatted. Please ensure it contains at least eight characters, a capital letter, a number, and a special character.");
        }

        // Check and validate phone number
        if (validatePhone) {
            JOptionPane.showMessageDialog(null, "Cell phone number successfully added");
        } else {
            JOptionPane.showMessageDialog(null, 
                "Cell phone number is incorrectly formatted. Please ensure it includes the international code (+27).");
        }

        // Final login validation
        if (validateUsername && validatePassword && validatePhone) {
            JOptionPane.showMessageDialog(null, "Successfully logged in. Welcome " + username + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Login failed. Please check your details and try again.");
        }
    }
}


