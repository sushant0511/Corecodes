import java.util.Scanner;

public class TestFactRecu {

	static long factorial(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=scanner.nextInt();
		System.out.println("Factorial="+factorial(n));
		
		
		
		
		
	}
	
}
