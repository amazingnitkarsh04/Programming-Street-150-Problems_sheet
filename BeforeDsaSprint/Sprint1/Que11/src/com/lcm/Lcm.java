package com.lcm;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int n1= sc.nextInt();
		System.out.println("Enter the second Number");
		int n2=sc.nextInt();
		int n3=n1*n2;
		
		while(n1%n2 !=0) {
			int rim= n1%n2;
		    n1=n2;
		    n2=rim;
		    
		}
		System.out.println("These two number lcm is :"+n3/n2);
	}

}
