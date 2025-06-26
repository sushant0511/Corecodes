import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=scanner.nextInt();
		int rem=0;
		int res=0;
		while(num>0)
		{
			rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		System.out.println("sum of digit="+res);
		
		
		
		

	}

}
