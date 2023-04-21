package com.findLargestofNumbers;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter The First Number");
		int a=scanner.nextInt();
		
		System.out.println("Enter The Second Number");
		int b=scanner.nextInt();
		
		System.out.println("Enter The Third Number");
		int c=scanner.nextInt();
		
		if (a>b && a>c) {
			System.out.println(a+" "+"Is a Largest number");
		}
		else if(b>a && b>c) {
			System.out.println(b+" "+"Is a largest Number");
		}
		else {
			System.out.println(c+" "+"Is a largest Number");
		}
	}

}
