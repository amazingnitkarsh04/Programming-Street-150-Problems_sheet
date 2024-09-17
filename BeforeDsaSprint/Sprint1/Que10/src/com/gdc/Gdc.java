package com.gdc;

import java.util.Scanner;

public class Gdc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int n1= sc.nextInt();
		System.out.println("Enter the Second number");
		int n2=sc.nextInt();
		while (n1%n2 !=0) {
			int rim=n1%n2;
			n1=n2;
			n2=rim;
			
		}
		System.out.println("The number of gdc is:"+n2);
	}

}
