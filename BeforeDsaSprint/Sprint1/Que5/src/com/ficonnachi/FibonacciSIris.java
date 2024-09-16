package com.ficonnachi;

import java.util.Scanner;

public class FibonacciSIris {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
		int com=n;
		int a=0;
		int b=1;
		int c=0;
		for (int i=1;i<n;i++) {
			if (a<n) {
				System.out.print("["+a+","+"]");
				c=a+b;
				a=b;
				b=c;
				
			}
		}
	}

}
