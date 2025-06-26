package callpack;

import java.util.Scanner;

import com.java.testPack.User;

public class CallPackageUser {

	public static void main(String[] args) {
		
		User user=new User();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x,y;
		x=scanner.nextInt();
		y=scanner.nextInt();
		
		System.out.println(user.findMax(x,y));
		System.out.println(user.doAdd(x, y));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
