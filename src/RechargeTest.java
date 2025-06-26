import java.util.Scanner;

public class RechargeTest {

	public static void main(String[] args) {
		
		
		System.out.println("Meter Recharge App");
		Scanner scanner=new Scanner(System.in);
		System.out.println("WHat is your current balance?");
		int balance=scanner.nextInt();
		if(balance>=2000)
		{
			System.out.println("Balance is fine");
		}
		else if (balance<=1999 && balance>1500)
		{
			System.out.println("Recharge in 12 days");
		}
		
		else if (balance<=1500 && balance>1000)
		{
			System.out.println("Recharge in 10 days");
		}
		else if (balance<=1000 && balance>=500)
		{
			System.out.println("Recharge in 5 days");
		}
		else 
		{
			System.out.println("Recharge now");
		}
	}
}
