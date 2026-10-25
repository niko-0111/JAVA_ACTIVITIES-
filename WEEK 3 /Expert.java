/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expert;

/**
 *
 * @author Sanchez
 */
public class ATMTransactionAuthorizer {
    public static void main(String[] args) {

        // Account Information
        String username = "Curs1";
        String pin = "0319";
        double balance = 67000.00;

        // Login Information
        String inputUsername = "Nico1";
        String inputPin = "1021";

        // Transaction Information
        double withdrawalAmount = 7000.00;

        String tier = "";
        double dailyLimit = 0.00;
        double feeRate = 0.00;
        double transactionFee = 0.00;
        double totalDeduction = 0.00;

        boolean approved = false;
        String denialReason = "";

        // Authenticate username and PIN using nested if
        if (inputUsername.equals(username)) {
            if (inputPin.matches("\\d{4}") && inputPin.equals(pin)) {

                // Determine account tier based on balance
                if (balance < 5000) {
                    tier = "Bronze";
                    dailyLimit = 2000.00;
                } else if (balance < 15000) {
                    tier = "Silver";
                    dailyLimit = 5000.00;
                } else if (balance < 50000) {
                    tier = "Gold";
                    dailyLimit = 10000.00;
                } else {
                    tier = "Platinum";
                    dailyLimit = 50000.00;
                }

                // Select transaction fee using switch
                switch (tier) {
                    case "Bronze":
                        feeRate = 0.03;
                        break;
                    case "Silver":
                        feeRate = 0.02;
                        break;
                    case "Gold":
                        feeRate = 0.01;
                        break;
                    case "Platinum":
                        feeRate = 0.005;
                        break;
                    default:
                        denialReason = "Invalid account tier.";
                }

                // Authorize withdrawal using nested if
                if (denialReason.isEmpty()) {
                    if (withdrawalAmount > 0) {
                        if (withdrawalAmount <= balance) {
                            if (withdrawalAmount <= dailyLimit) {

                                transactionFee = withdrawalAmount * feeRate;
                                totalDeduction = withdrawalAmount + transactionFee;

                                // Final approval or denial
                                if (totalDeduction <= balance) {
                                    approved = true;
                                } else {
                                    denialReason =
                                        "Insufficient balance to cover withdrawal and transaction fee.";
                                }

                            } else {
                                denialReason =
                                    "Withdrawal exceeds the daily limit for your " + tier + " account.";
                            }
                        } else {
                            denialReason =
                                "Insufficient balance for the requested withdrawal.";
                        }
                    } else {
                        denialReason =
                            "Withdrawal amount must be greater than zero.";
                    }
                }

            } else {
                denialReason = "Invalid PIN. PIN must be correct and exactly 4 digits.";
            }
        } else {
            denialReason = "Invalid username.";
        }

        // Display the authorization result
        System.out.println("===== ATM TRANSACTION AUTHORIZER =====");
        System.out.println("Username: " + inputUsername);

        if (denialReason.isEmpty() && !tier.isEmpty()) {
            System.out.println("Account Tier: " + tier);
            System.out.printf("Account Balance: PHP %.2f%n", balance);
            System.out.printf("Daily Withdrawal Limit: PHP %.2f%n", dailyLimit);
        }

        if (approved) {
            System.out.println("Transaction Status: APPROVED");
            System.out.printf("Withdrawal Amount: PHP %.2f%n", withdrawalAmount);
            System.out.printf("Transaction Fee (%.2f%%): PHP %.2f%n",
                    feeRate * 100, transactionFee);
            System.out.printf("Total Deduction: PHP %.2f%n", totalDeduction);
            System.out.printf("Remaining Balance: PHP %.2f%n",
                    balance - totalDeduction);
        } else {
            System.out.println("Transaction Status: DENIED");
            System.out.println("Reason: " + denialReason);
        }   
    }
}
