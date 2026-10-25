/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expert;

/**
 *
 * @author Sanchez
 */
public class PrecedencePuzzleSolver {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c = 2;

        // Prediction: 11
        // Multiplication happens before addition.
        System.out.println("Expression 1: " + (a + b * c));

        // Prediction: true
        // Multiplication happens first, followed by equality,
        // relational comparison, and logical AND.
        System.out.println("Expression 2: " + (a > b && b * c == 6));

        int count = 4;

        // Prediction: 9
        // Postfix uses 4 first, then count becomes 5.
        // Therefore, 4 + 5 = 9.
        System.out.println("Expression 3: " + (count++ + a));
        System.out.println("Count after Expression 3: " + count);

        int x = 5;

        // Prediction: true
        // Parentheses are evaluated first, then comparison,
        // followed by logical AND.
        System.out.println("Expression 4: " + ((x + 2 > 6) && (x != 0)));

    }
}
}
