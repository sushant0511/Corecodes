
public class FibonacciCode {

	public static void main(String[] args) {
		int n=10;
		int first=0;
		int second=1;
		int next=0;
		System.out.println("Fibonacci Series ");
		System.out.println(first);  // 0
		System.out.println(second);  //1
				for(int i=0;i<n-2;i++)
		{
			next=first+second;  // 5+8=13
			first=second; // first=5
			second=next;  // second=8
			System.out.println(next);
		}
	}
}
