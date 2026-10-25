/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advanced;

/**
 *
 * @author Sanchez
 */
public class NestedLoginValidator {
    public static void main(String[] args) {
        
        String username = "admin";
        String password = "0523";
        boolean accountLocked = false;

        // Test login details
        
        String inputUsername = "admin";
        String inputPassword = "0523";

        if (inputUsername.equals(username)) {
            if (inputPassword.equals(password)) {
                if (!accountLocked) {
                    System.out.println("Login successful!");
                    System.out.println("Welcome, " + username + "!");
                } else {
                    System.out.println("Login failed: Account is locked.");
                }
            } else {
                System.out.println("Login failed: Incorrect password.");
            }
        } else {
            System.out.println("Login failed: Incorrect username.");
        }
    }
}
