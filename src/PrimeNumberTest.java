import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		if(num==0 || num==1)
		{
			System.out.println("Exit");
		}
		else
		{
		int flag=0;
		     //  25 
			for(int i=2;i<=num/2+1;i++)
			{
				System.out.println("Number travers in index="+i);
				if(num%i==0)
				{
					System.out.println("Number divided at index="+i);
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("Not prime");
			}
			else
			{
				System.out.println("Prime Number");
			}
			
			
		}
	}
}
