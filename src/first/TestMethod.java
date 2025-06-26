package first;

public class TestMethod {

	public char add() {
		int a,b;
		a=10;
		b=20;
		System.out.println(a+b);
		return 'a';
		}
	public void sub() {
		int a,b;
		a=10;
		b=20;
		System.out.println("Sub="+(a-b));
	}
	
	public static void main(String[] args) {
		TestMethod   obj=new TestMethod();
		obj.add();
		obj.sub();
		
	
		
		
	}
}
