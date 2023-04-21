package com.swapingNumber;

public class SwapNum {
	public static void main(String[] args) {
	
	int a=10, b=20;
	System.out.println("before swaping number :"+"a="+a+" "+"b="+b);
	
	//logic (By using (+ -) Arithmetic Operations)
	
	a=a+b;  //10+20=30
	b=a-b;  //30-20=10
	a=a-b;  //30-10=20
	
	System.out.println("After swaping number :"+"a="+a+" "+"b="+b);
	
	//-----------------------------------------------------------------------------------
	
	int c=5, d=8;
	System.out.println("Before Swping Number :"+"c="+c+" "+"d="+d);
	
	//logic (By using (* /) Arithmetic Operations)
	c=c*d;  //5*8=40
	d=c/d;  //40/8=5
	c=c/d;  //40/5=8
	
	System.out.println("After Swaping Number :"+"c="+c+" "+"d="+d);
	
	}
}
