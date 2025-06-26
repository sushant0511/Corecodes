package com.java.testLoop;

public class TestLoop {

	public static void main(String[] args) {
		int sr=20,er=40;
		int t=0;
		for(int i=sr;i<=er;i++)
		{
			if(i%5==0)
			{
				t++;
			}
		}
		System.out.println("/by 3="+t);
	}
}
