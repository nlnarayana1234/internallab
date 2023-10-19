package com.lbrce;

public class Simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleinterest(5000,5,2);
	}
	public static void simpleinterest(int p, int t, int r)
	{
		double x;
		x = (p*t*r)/100;
		System.out.println("simple interest : "+x);
	}
}
