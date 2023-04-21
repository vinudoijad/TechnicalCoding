package com.swapingNumber;

public class SwapNumber {
	
	public static void main(String[] args) {
		
		int a=10, b=30;
		
		System.out.println("Before Swapaning number is :"+"a="+a+" "+"b="+b);
		//logic (take 3rd variable)
		int v=a;
		a=b;
		b=v;
		System.out.println("After Swaping Number :"+"a="+a+" "+"b="+b);
	}

}
