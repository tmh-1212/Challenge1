
package chapter1_challenge_1_1;
 import java.util.Scanner;

public class Chapter1_Challenge_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Step 1: Count number of digits using log10
        int digits = (int) Math.log10(number) + 1;

        // Step 2: Extract first digit
        int firstDigit = (int)(number / Math.pow(10, digits - 1));

        // Step 3: Extract last digit
        int lastDigit = number % 10;

        // Step 4: Extract second digit
        int secondDigit = (int)((number % Math.pow(10, digits - 1)) / Math.pow(10, digits - 2));

        // Step 5: Extract second-last digit
        int secondLastDigit = (int)((number / 10) % 10);

        // Step 6: Compute product of first and last digits
        int product = firstDigit * lastDigit;

        // Step 7: Compute sum of second and second-last digits
        int sum = secondDigit + secondLastDigit;

        // Step 8: Concatenate product and sum
        String decryptedCode = product + "" + sum;

        // Final Output
        System.out.println("The decrypted code is: " + decryptedCode);
    }
}

 
    
    

