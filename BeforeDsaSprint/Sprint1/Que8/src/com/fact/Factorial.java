package com.fact;

public class Factorial {
	static int cont=1;
   public static void fact(int n) {
	   for(int i=1;i<=n;i++ ) {
		   cont= cont*i;
	   }
	   System.out.println(cont);
	   
   }
   public static void main(String[] args) {
	int n=5;
	fact(n);
}
}
