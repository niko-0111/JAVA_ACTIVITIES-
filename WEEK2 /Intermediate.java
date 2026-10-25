/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intemediate;

/**
 *
 * @author Sanchez
 */
public class GradeThresholdChecker {
    public static void main(String[] args) {

        double average = 85;
        int absences = 2;

        if ((average >= 75 && absences <= 3) || average >= 90) {
            System.out.println("PASS");
            System.out.println("Reason: The average is at least 75 and absences are 3 or fewer, or the average is at least 90.");
        } else {
            System.out.println("FAIL");
            System.out.println("Reason: The student does not meet the passing requirements.");
        }
    }
 
}
