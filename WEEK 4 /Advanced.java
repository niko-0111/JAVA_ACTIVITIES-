/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advanced;

/**
 *
 * @author Sanchez
 */
public class PatternGeneratorWithEarlyExit {
    public static void main(String[] args) {
        
        int size = 5;

        System.out.println("Pattern Generator With Early Exit");
        System.out.println("Size: " + size);
        System.out.println();

        for (int row = 1; row <= size; row++) {

            // CONTINUE: Skip row 3 completely
            if (row == 3) {
                System.out.println("Row 3 skipped.");
                continue;
            }

            for (int column = 1; column <= row; column++) {

                // BREAK: Stop the inner loop when column reaches 3
                if (column == 3) {
                    break;
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
