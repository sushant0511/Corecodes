package com.java.testploymorphishm;

class Test
{
	public void add(int a)
	{
		System.out.println(a+a);
	}
	
	public void add(char a)
	{
		System.out.println(a);
	}
	
}
public class TestOVerlead {

	public static void main(String[] args) {
		
		Test test=new Test();
		test.add(12);
		test.add('a');
		
		
		
		
		
		
		
		
		
		
	}
}
