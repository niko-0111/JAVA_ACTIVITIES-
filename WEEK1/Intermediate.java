/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intermediate;

/**
 *
 * @author Sanchez
 */
public class TypeSafeShoppingCalculator {
    public static void main(String[] args) {

        int quantity = 3;
        double unitPrice = 150.50;
        String storeName = "SM Store";

        double totalCost = quantity * unitPrice;

        System.out.println("=== Shopping Summary ===");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: PHP " + unitPrice);
        System.out.println("Total Cost: PHP " + totalCost);

        // totalCost should not be declared as int because
        // unitPrice is a double, so the result can contain decimals.
    }
}
