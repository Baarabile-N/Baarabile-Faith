/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
  
 * @author RC_Student_lab
 */
public class Login1  {
    private String username;
    
    
    public boolean checkUserName (String username) {
if (username.contains("_") && username.length()<=5){
  
return true;
}else{
return false;
}
}
public boolean checkPasswordComplexity (String password){
   // password = JOptionPane.showInputDialog("Enter password");
    
    String lowercase = ".*[a-z].*";//checks lowercase letters
    String specials = ".*[!@#$%^&*(),.?\":{}|<>].*"; // checks special characters 
    String digits = ".*\\d.*"; //checks digit characters
    String uppercase = ".*[A-Z].*"; // checks upercase letters
      if ((password.length() <8 || !password.matches(( digits )) || !password.matches(specials) || !password.matches(lowercase)
              || !password.matches(uppercase))){
    return false;
}else{
    return true;
}
}
public  boolean checkCellPhoneNumber (String phone){
 String saCode = "+27"; 
 String firstThreeChart = phone.substring(0, 3);//gets character nfrom index from 0 to 9 inclusive
 int fourthDigit = Character.getNumericValue(3); //gets and conver the eleventh digit 
if (phone.length()<=12 && firstThreeChart.equals(saCode) && (fourthDigit>=6 || fourthDigit<=8) ){
    return true;
}else{
    return false;
            }
}

public String registerUser (String username, String password, String phoneNumber){
boolean validateUserName = checkUserName (username);
boolean validatePassword = checkPasswordComplexity (password);
boolean validatePhone = checkCellPhoneNumber (phoneNumber);

if(validatePhone ==true && validateUserName ==true &&
        validatePassword ==true ){
    return "User is successfully registered";
}else{
         return "user registeration faild!!!";
         }
}
public boolean loginUser (String username, String password){
    boolean validateUserName = checkUserName(username);
    boolean validatePassword = checkPasswordComplexity(password);
       if(validateUserName ==true && validatePassword ==true){
           return true;
       }else{
           return false;
       }
}
public String returnLoginStatus(String username, String password) {
        boolean validatePassword = false;
        boolean validateUserName = false;
   
   if (validateUserName ==true && validatePassword ==true){
    return "A successful login";
   } else{
       return "A failed login";
   }
}
    
}


