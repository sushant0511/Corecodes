package com.java.testCode;
import java.util.Scanner;

public class Testeh {

	public static void main(String[] args) {
		
		char x,y,z;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter 3 alphabets:");
		String r=scanner.next();
		
		x=r.charAt(0);
		y=r.charAt(1);
		z=r.charAt(2);
		System.out.println(x+" "+y+" "+z);
		
		if(x=='a' &&  y=='b'  &&  z=='c')
		{
			System.out.println("code successful");
		}
		else
		{
			System.out.println("code unsuccessful");
		}
		
		
	}

}