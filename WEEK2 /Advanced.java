/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advanced;

/**
 *
 * @author Sanchez
 */

public class CompoundGrowthAndIncrementTracker {
    public static void main(String[] args) {

        double balance = 1000;

        balance += 500;
        System.out.println("After adding 500: " + balance);

        balance *= 2;
        System.out.println("After multiplying by 2: " + balance);

        balance += 250;
        System.out.println("After adding 250: " + balance);

        int count = 5;

        System.out.println("Postfix (count++): " + count++);
        System.out.println("Count after postfix: " + count);

        count = 5;

        System.out.println("Prefix (++count): " + ++count);
        System.out.println("Count after prefix: " + count);

        // count++ returns the current value first, then increases the variable.
        // ++count increases the variable first, then returns the updated value.
    }
}
   
