package com.reverseNum;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int num=scanner.nextInt();
		
		//using Algoritham
		
		int rev=0;
		
		while(num!=0) {
			rev=rev*10 + num%10;
			num= num/10;
		}
		System.out.println("Reverse Number are :"+ rev);
	}

}
