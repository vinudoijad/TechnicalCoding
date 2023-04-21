package com.reverseNum;

import java.util.Scanner;

public class revNum {
	
	public static void main(String[] args) {
		Scanner scanner= null;
		scanner= new Scanner(System.in);
		System.out.println("Enter The number");
		int number=scanner.nextInt();
		
		//by Using StringBuffer
		
		StringBuffer sb= new StringBuffer(String.valueOf(number));
		StringBuffer rev=sb.reverse();
		
		scanner.close();
		
		System.out.println("reverse number is :"+rev);
	}

}
