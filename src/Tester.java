class Test
{
	public void business()
	{
		System.out.println("Parent have business");
	}
}
class TestChild extends Test
{
	public void job()
	{
		System.out.println("Going for job");
	}
	
	
}
public class Tester {

	public static void main(String[] args) {
		
		TestChild xyz=new TestChild();
		xyz.business();
		
		
		
	}
}
