/*
 * Written by Audrey Webb
 */
import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Please enter a 4-bit binary value: ");
        
        String binaryInput = scanner.nextLine();     

        
        System.out.println("Please enter one more 4-bit binary value: ");
        
        String binaryInput1 = scanner.nextLine();
        // Gets both 4-digit binary values from user

      
        int decimal = convertBinaryToDecimal(binaryInput);
        
        int decimal1 = convertBinaryToDecimal(binaryInput1);
        // Converts both values into decimals

        System.out.println("The first binary value converted to decimal is: " + decimal);
        
        System.out.println("The second binary value converted to decimal is: " + decimal1);

      
        int sum = decimal + decimal1;
        // finds sum of both decimal values
        
        System.out.println("Added together, we get: " + sum);

        scanner.close();
    }

    // Method that converts binary to decimal
    public static int convertBinaryToDecimal(String binary) {
    	
        int decimalNumber = 0;
        
        int power = 0;

        // Loops through binary starting from the right
        for (int i = binary.length() - 1; i >= 0; i--) {
        	
            char bit = binary.charAt(i);

        
            if (bit == '1') {
                decimalNumber += Math.pow(2, power);
                
            }
            
            power++;  
        }

        return decimalNumber;
    }
}
