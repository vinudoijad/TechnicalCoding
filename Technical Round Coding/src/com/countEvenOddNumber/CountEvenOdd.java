package com.countEvenOddNumber;

public class CountEvenOdd {
	
	public static void main(String[] args) {
		
		int num= 123456;
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0) {   //123456  12345  1234  123  12  1
			
			int rem=num%10;  //6  5  4  3  2  1
			if(rem%2==0) {
				even_count++; //1 2 3
			}else {
				odd_count++;   //1 2 3
			}
			num=num/10;  //12345  1234  123  12  1  0
		}
		System.out.println("even number count is :"+" "+even_count);
		System.out.println("odd number count is :"+" "+odd_count);
	}

}
