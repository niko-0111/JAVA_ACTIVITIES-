/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Advanced;

/**
 *
 * @author Sanchez
 */
public class UnitCastingConverter {
    public static void main(String[] args) {

        double centimeters = 275.5;

        // Explicit casting from double to int for whole meters
        int meters = (int) centimeters / 100;
        double remainingCentimeters = centimeters - (meters * 100);

        System.out.println("=== Unit Conversion ===");
        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole Meters: " + meters);
        System.out.println("Remaining Centimeters: " + remainingCentimeters);

        // Implicit widening: int is automatically converted to double.
        int number = 10;
        double widenedNumber = number;

        System.out.println("\n=== Implicit Widening ===");
        System.out.println("Integer: " + number);
        System.out.println("Double: " + widenedNumber);

        // Explicit narrowing: double is converted to int.
        double decimalNumber = 25.75;
        int narrowedNumber = (int) decimalNumber;

        // The .75 decimal part is lost during the conversion.
        System.out.println("\n=== Explicit Narrowing ===");
        System.out.println("Original Double: " + decimalNumber);
        System.out.println("Converted Integer: " + narrowedNumber);
    }
}


