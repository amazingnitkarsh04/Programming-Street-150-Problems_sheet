package com.vovalconsonant;

import java.util.Scanner;

public class CountingVowelsConsonants {
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the String for Counting Vowels and Consonants ");
	 String name= sc.nextLine();
	 int voval=0;
	 int consonant=0;
	 for(int i=0;i<name.length();i++) {
		 char a=name.charAt(i);
		 if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
			 voval=voval+1;
			
		}else {
			consonant=consonant+1;
		}
		
	 }
	 System.out.println("In a string total voval is :"+voval);
	 System.out.println("in a String total consonant is:"+consonant);
	 
}
}
