package com.java.testinput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(c);
		
		
	}
}
