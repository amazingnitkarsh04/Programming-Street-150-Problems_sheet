package com.pattern;

public class PyramidPattern {
  public static void PyramidPattern1(int n) {
	for(int i=0;i<n;i++) {
	  // for space
		for(int j=0;j<n-i-1;j++) {
			System.out.print(" ");
		}
		for(int j=0;j<2*i+1;j++) {
			System.out.print("*");
		}
		for(int j=0;j<n-i-1;j++) {
			System.out.print(" ");
		}
		System.out.println();
		
		
	}
	
	  
  }
  public static void main(String[] args) {
	int n=5;
	PyramidPattern1(n);
}
}
