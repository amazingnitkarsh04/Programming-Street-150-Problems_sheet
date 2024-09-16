package com.armstrongNumber;

import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int ams=0;
		int rem;
		int c=n;
		while(n>0) {
			rem=n%10;
			ams=(rem*rem*rem)+ams;
			n= n/10;
			}
		if (c==ams) {
			System.out.println("number is amstrome number ");
			
		}else {
			System.out.println("number is not amstrome");
		}
			
		}
	}


