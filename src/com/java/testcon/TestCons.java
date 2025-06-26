package com.java.testcon;

import java.util.Scanner;

class Test
{
	public Test() {
		System.out.println("Hi from Constructor");
	}
	
	public Test(int a,int b)
	{
		System.out.println("Add="+(a+b));
	}
	
}

public class TestCons {
	
	public static void main(String[] args) {
		
		new Test();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter numbers");
		new Test(scanner.nextInt(),scanner.nextInt());
	}
	

}
