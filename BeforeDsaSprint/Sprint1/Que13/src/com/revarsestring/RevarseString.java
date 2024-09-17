package com.revarsestring;


import java.util.Scanner;

public class RevarseString {
	public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the String:");
	  String name = sc.next();
	  String revarseStringa1= "";
	  for (int i=name.length()-1;i>=0;i--) {
		  revarseStringa1 =revarseStringa1+name.charAt(i);
	
		  
	  }
	  System.out.println("The revarse string is :"+revarseStringa1);
	}

}
