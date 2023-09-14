package github;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		   
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        scanner.close();
		        
		        if (isArmstrong(number)) {
		            System.out.println(number + " is an Armstrong number.");
		        } else {
		            System.out.println(number + " is not an Armstrong number.");
		        }
		    }
		    
		    // Function to check if a number is an Armstrong number
		    public static boolean isArmstrong(int number) {
		        int originalNumber, remainder, result = 0, n = 0;
		        originalNumber = number;
		        
		        // Find the number of digits in the number
		        for (;originalNumber != 0; originalNumber /= 10, ++n);
		        originalNumber = number;
		        
		        // Calculate the sum of nth power of individual digits
		        while (originalNumber != 0) {
		            remainder = originalNumber % 10;
		            result += Math.pow(remainder, n);
		            originalNumber /= 10;
		        }
		        
		        // Check if the result is equal to the original number
		        return result == number;
		    }
		

	}


