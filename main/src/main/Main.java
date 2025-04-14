/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.Scanner;
import javax.swing.JOptionPane;
//ASSIGMENT PART 1
/**
 *
 * @author Baarabile Ndlalane(st10477929)
 */
public class Main {
private static boolean validateUsername;
    
    public static void main(String[] args) {
        
        //String firstname = JOptionPane.showInputDialog("Enter your first name");
        //String lastname = JOptionPane.showInputDialog("Enter your last name");
        String username = JOptionPane.showInputDialog("Enter your username");
        String password = JOptionPane.showInputDialog("Enter your password");
        String phone = JOptionPane.showInputDialog("Enter your phone");
        
        
        Login1 login1 = new Login1(); //create and instantiate Lgin object
      boolean validatePhone = login1.checkCellPhoneNumber(phone);
      boolean validatePassword = login1.checkPasswordComplexity(password);
      boolean validateUsername = login1.checkUserName (username);
      
      //checks and validates username
      if(validateUsername ==true){
        JOptionPane.showMessageDialog(null,"username succesfully captured");
      }else{ 
        JOptionPane.showMessageDialog(null,"username is not captured correctly formatted,please ensure that your username contains an underscore and no more than five characters in length");
      }
      //checks and validates password
      if(validatePassword == true){
          JOptionPane.showMessageDialog(null,"password successfully captured");
      }else{
          JOptionPane.showMessageDialog(null,"password is not correctly formatted;please ensure that the password contains at least eight characters,a capital letter, a number,and a special character");
      }
       //checks and validates phone
       if(validatePhone == true){
           JOptionPane.showMessageDialog(null,"cell phone number successfully added");
       }else{
           JOptionPane.showMessageDialog(null,"cell phone number incorrectly formatted or does not contain international code");
       }
       
       if(validateUsername==true && validatePassword == true && validatePhone == true){
           JOptionPane.showMessageDialog(null,"Successfully logged in. Welcome "+username);
       }
        
       String login1username;
       String login1password;
       String login1phone;
      
        
       
    }
    
    }

