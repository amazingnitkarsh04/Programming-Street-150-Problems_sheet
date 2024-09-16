package com.leafyear;

import java.util.Scanner;

public class ValidateLeafYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year to validate it is leaf year or not :-");
		int n= scanner.nextInt();
		if (n%4==0) {
			System.out.println("these year is leaf year");
		}
		if (n%100==0) {
		 if (n%400==0) {
			 System.out.println("these year is leaf year");
			
		}
		 else {
			System.out.println("these year is not a leaf year");
		}
			
		}
	}

}
