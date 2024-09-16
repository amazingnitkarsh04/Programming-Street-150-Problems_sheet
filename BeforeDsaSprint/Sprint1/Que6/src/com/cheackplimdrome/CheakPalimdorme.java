package com.cheackplimdrome;

import java.util.Scanner;

public class CheakPalimdorme {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number or string to check palindrome:");
	        String p = scanner.next();
	        
	        String reverse = ""; // Renamed for clarity
	        for (int i = p.length() - 1; i >= 0; i--) {
	            reverse += p.charAt(i); // Build the reversed string
	        }
	        
	        // Compare the reversed string with the original
	        if (reverse.equals(p)) {
	            System.out.println("It is a palindrome.");
	        } else {
	            System.out.println("It is not a palindrome.");
	        }
	    }

}
