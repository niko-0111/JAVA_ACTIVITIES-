/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expert;

/**
 *
 * @author Sanchez
 */
import java.util.Scanner;

public class WarehouseInventoryScanner {
  
     static Scanner input = new Scanner(System.in);
    static int[][] warehouse = {
        {25, 10, 0, 18},
        {12, -1, 5, 30},
        {8, 20, 3, 15},
        {40, 6, 22, 11}
    };

    static final int DAMAGED_SHELF = -1;
    static final int LOW_STOCK_LIMIT = 5;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n=== WAREHOUSE INVENTORY SCANNER ===");
            System.out.println("1. Display Inventory");
            System.out.println("2. Calculate Total Inventory");
            System.out.println("3. Find First Critically Low Shelf");
            System.out.println("4. Restock a Shelf");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
                System.out.print("Enter your choice: ");
            }

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    displayInventory();
                    break;
                case 2:
                    calculateTotal();
                    break;
                case 3:
                    findLowStock();
                    break;
                case 4:
                    restockShelf();
                    break;
                case 5:
                    System.out.println("Exiting inventory scanner...");
                    break;
                default:
                    System.out.println("Invalid choice. Select 1 to 5.");
            }

        } while (choice != 5);

        input.close();
    }

    // Display the warehouse 2D array
    public static void displayInventory() {
        System.out.println("\nWarehouse Inventory:");

        for (int row = 0; row < warehouse.length; row++) {
            for (int col = 0; col < warehouse[row].length; col++) {
                if (warehouse[row][col] == DAMAGED_SHELF) {
                    System.out.print("[DAMAGED]\t");
                } else {
                    System.out.print(warehouse[row][col] + "\t\t");
                }
            }
            System.out.println();
        }
    }

    // FOR loop with CONTINUE skips damaged shelves
    public static void calculateTotal() {
        int total = 0;

        for (int row = 0; row < warehouse.length; row++) {
            for (int col = 0; col < warehouse[row].length; col++) {

                if (warehouse[row][col] == DAMAGED_SHELF) {
                    continue; // Skip damaged shelf
                }

                total += warehouse[row][col];
            }
        }

        System.out.println("Total inventory: " + total + " items");
    }

    // Nested loops with BREAK find the first low-stock shelf
    public static void findLowStock() {
        boolean found = false;

        for (int row = 0; row < warehouse.length; row++) {
            for (int col = 0; col < warehouse[row].length; col++) {

                int stock = warehouse[row][col];

                if (stock != DAMAGED_SHELF && stock <= LOW_STOCK_LIMIT) {
                    System.out.println("First critically low shelf found!");
                    System.out.println("Row: " + (row + 1));
                    System.out.println("Column: " + (col + 1));
                    System.out.println("Stock: " + stock + " items");

                    found = true;
                    break; // Stop the inner loop
                }
            }

            if (found) {
                break; // Stop the outer loop too
            }
        }

        if (!found) {
            System.out.println("No critically low shelves found.");
        }
    }

    // WHILE loop validates restocking input; RETURN exits the method
    public static void restockShelf() {
        System.out.print("Enter row (1-" + warehouse.length + "): ");
        int row = readInteger();

        System.out.print("Enter column (1-" + warehouse[0].length + "): ");
        int col = readInteger();

        // Validate shelf position
        if (row < 1 || row > warehouse.length ||
            col < 1 || col > warehouse[0].length) {
            System.out.println("Invalid shelf position.");
            return;
        }

        // Convert to zero-based array indexes
        row--;
        col--;

        if (warehouse[row][col] == DAMAGED_SHELF) {
            System.out.println("Cannot restock a damaged shelf.");
            return;
        }

        System.out.print("Enter quantity to add: ");
        int quantity = readInteger();

        while (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            System.out.print("Enter quantity to add: ");
            quantity = readInteger();
        }

        warehouse[row][col] += quantity;

        System.out.println("Restocking successful!");
        System.out.println("Updated stock: " + warehouse[row][col]);
    }

    // Input validation helper
    public static int readInteger() {
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a whole number.");
            input.next();
            System.out.print("Try again: ");
        }

        return input.nextInt();
    }   
}
