package com.lara5;

public class B {
	public static void main(String[] args) {
		System.out.println(1);
		if(true)
		{
			throw new ArithmeticException();
		}
		System.out.println(2);
	}
}
