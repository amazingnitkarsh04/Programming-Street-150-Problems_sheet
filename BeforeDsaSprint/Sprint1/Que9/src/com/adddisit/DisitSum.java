package com.adddisit;

import java.util.Scanner;

public class DisitSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("entter the number:");
		int n=scanner.nextInt();
		int cont=0;
		while(n>0) {
			cont=cont+(n%10);
			n=n/10;
		}
		System.out.println("The sum of the unit disit is :"+cont);
	}
}
