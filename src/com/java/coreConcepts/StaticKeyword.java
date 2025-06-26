package com.java.coreConcepts;



class Test
{
	static int b=20;
	public static void call() {
		
		int a=10;
		
		System.out.println("Called "+(a+b));
	}
	public static int add()
	{
		System.out.println("Add Called");
		return 9+b;
	}
}


public class StaticKeyword {

	public static void main(String[] args) {
	
		System.out.println(Test.add());
		Test.call();
		
		
	}
}
















