package com.prime;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n= scanner.nextInt();
		int cont = 0;
		
		for(int i=1;i>=n;i++) {
			if (n%i==0) {
				cont= cont+1;
			}
			
		}
		if (cont==2) {
			System.out.println("number is prime");
			
		} else {
			System.out.println("Number is not prime");

		}

		
		}
	}


