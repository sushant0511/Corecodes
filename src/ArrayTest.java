import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		int a,b,c,d,e,f;
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter your numbers");
		for(int i=0;i<5;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("Output");
		for(int i=0;i<6;i++)
		{
			System.out.println(arr[i]);
		}
		
	
//		a=scanner.nextInt();
//		b=scanner.nextInt();
//		c=scanner.nextInt();
//		d=scanner.nextInt();
//		e=scanner.nextInt();
//		f=a+b+c+d+e;
//		System.out.println("Add="+f);
		
		
	}
}
