package com.palindromeString;

import java.util.Scanner;

public class PlindromeString {
	
	public static void main(String[] args) {
		String rev="";
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the Word");
	    
	    String str=scanner.next();
		String org_word=str;
		
		int l=str.length();
		
		for(int i=l-1; i>=0; i--) {
			
			rev= rev+str.charAt(i);
		}
		if(org_word.equals(rev)) {
			System.out.println(org_word+" "+"Palindrome String");
		}
		else {
			System.out.println(org_word+" "+"not Palindrome String");
		}
		
	}

}
