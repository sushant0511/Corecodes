import java.util.Scanner;

public class TestFact {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		long factorial=1;
		if(num>1)
		{
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("factorial of "+num+"="+factorial);
		}
		else
		{
			System.out.println("Enter number greater then 1");
		}
	}
}
