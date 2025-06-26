package com.java.testexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		try
		{
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=a/b;
		System.out.println(c);
		}
		catch (ArithmeticException e) {
			System.out.println("Do not enter Zero"+e);
		}
		
		catch (InputMismatchException e) {
			System.out.println("Please Input integer value ");
		}
	}
}
