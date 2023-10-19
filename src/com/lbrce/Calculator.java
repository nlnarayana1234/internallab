package com.lbrce;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		summation(10,20);
		difference(100,200);
		product(10,24);
		division(20,5);

	}
	public static void summation(int a, int b)
	{
		int c = a+b;
		//Summation process
		System.out.println("Sum = "+c);
	}
	public static void difference(int a, int b)
	{
		int c = b-a;
		//Subtraction process
		System.out.println("Difference = "+c);
	}
	public static void product(int a, int b)
	{
		int c = a*b;
		//Multiplication process
		System.out.println("Product = "+c);
	}
	public static void division(int a, int b)
	{
		int c = b/a;
		//Division process
		System.out.println("Division = "+c);
	}
}