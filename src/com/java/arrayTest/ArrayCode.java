package com.java.arrayTest;

import java.util.Scanner;
public class ArrayCode
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[6];
System.out.println("Enter numbers");
for(int i =0;i<6;i++)
{
a[i]=sc.nextInt();
}
int dif=a[5]-a[3];
System.out.println(dif);


}

}