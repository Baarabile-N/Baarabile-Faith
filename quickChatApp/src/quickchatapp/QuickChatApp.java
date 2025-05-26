/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quickchatapp;

import javax.swing.JOptionPane;

public class QuickChatApp {
    public static void main(String[] args) {
        boolean loggedIn = login();
        if (!loggedIn) { 
            JOptionPane.showMessageDialog(null, "Login failed. Exiting.");
            return;
        }

        JOptionPane.showMessageDialog(null, "Welcome to QuickChat");
        int messageLimit = Integer.parseInt(JOptionPane.showInputDialog("How many messages would you like to send?"));
        int sentCount = 0;

        while (true) {
            String input = JOptionPane.showInputDialog("Choose an option:\n1) Send message\n2) Show recently sent messages\n3) Quit");
            if (input == null) break;

            int option;
            try {
                option = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
                continue;
            }

            switch (option) { 
                case 1:
                    if (sentCount >= messageLimit) {
                        JOptionPane.showMessageDialog(null, "Message limit reached.");
                        break;
                    }

                    String message = JOptionPane.showInputDialog("Enter message (max 256 characters):");
                    if (message.length() > 256) {
                        JOptionPane.showMessageDialog(null, "Message exceeds 256 characters by " + (message.length() - 256) + ". Please shorten it.");
                        break;
                    }

                    // Message sending logic would go here
                    sentCount++;
                    JOptionPane.showMessageDialog(null, "Message sent successfully!");
                    break;

                case 2:
                    // Show recent messages logic would go here
                    JOptionPane.showMessageDialog(null, "Displaying recent messages...");
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Exiting QuickChat. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please choose 1, 2, or 3.");
            }
        }
    }

    private static boolean login() {
        String userName = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");

        return userName != null && password != null && userName.equals("admin") && password.equals("pass123");
    }
}