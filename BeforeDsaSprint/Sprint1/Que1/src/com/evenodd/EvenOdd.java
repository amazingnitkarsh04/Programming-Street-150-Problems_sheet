package com.evenodd;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter the number :");
		  int n= scanner.nextInt();
		  if (n%2==0) {
			  System.out.println("Number is even");
			
		} else {
			System.out.println("Numbeer is odd ");

		}
	}

}
