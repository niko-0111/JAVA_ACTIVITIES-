/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expert;

/**
 *
 * @author ASUS
 */
public class OverflowAndReferenceInvestigator {
    public static void main(String[] args) {

        // BYTE OVERFLOW
        byte number = 127;
        number++;

        // A byte can only store values from -128 to 127.
        // After 127, it wraps around to -128.
        System.out.println("=== Byte Overflow ===");
        System.out.println("After increment: " + number);


        // STRING COMPARISON
        String text1 = new String("Hello");
        String text2 = new String("Hello");
        String text3 = "Hello";

        System.out.println("\n=== String Comparison ===");
        System.out.println("text1 == text2: " + (text1 == text2));
        System.out.println("text1.equals(text2): " + text1.equals(text2));
        System.out.println("text1 == text3: " + (text1 == text3));
        System.out.println("text1.equals(text3): " + text1.equals(text3));

        // == compares the references (memory locations) of objects.
        // .equals() compares the actual text stored in the Strings.
        // Since text1 and text2 were created using new, they are
        // different objects even though they contain the same text.


        // SHARED ARRAY REFERENCE
        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        array1[0] = 99;

        System.out.println("\n=== Shared Array Reference ===");
        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);

        // array1 and array2 refer to the same array.
        // Therefore, changing the array through array1
        // is also visible through array2.
    }
}

