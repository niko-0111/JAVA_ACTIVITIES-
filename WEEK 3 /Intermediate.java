/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intermediate;

/**
 *
 * @author Sanchez
 */
public class MultiTierDiscountSystem {
    public static void main(String[] args) {

        double purchaseAmount = 6000;
        double discountRate;
        double discount;
        double discountedPrice;

        if (purchaseAmount >= 10000) {
            discountRate = 0.15;
        } else if (purchaseAmount >= 5000) {
            discountRate = 0.10;
        } else if (purchaseAmount >= 2000) {
            discountRate = 0.05;
        } else {
            discountRate = 0.00;
        }

        discount = purchaseAmount * discountRate;
        discountedPrice = purchaseAmount - discount;

        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Discount Amount: " + discount);
        System.out.println("Discounted Price: " + discountedPrice);
    }
}
