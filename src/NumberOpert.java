
public class NumberOpert {

	public int calculateDifference(int n)
	{
		long sumOfSquares=0;
		long sum=0;
		for(int i=1;i<=n;i++)
		{
		// sumofsquare=1+4
			sumOfSquares=sumOfSquares+(long)i*i;  //385 
			sum=sum+i;//sum=0+1;1+2;3+3;6+4;10+5;15+6;21+7;28+8;36+9;45+10=55
		}
		//System.out.println(sum);
		long squareOfSum=sum*sum;  //3025
		
		return (int)(squareOfSum-sumOfSquares);
	}
	
	public static void main(String[] args) {
		
		NumberOpert opert=new NumberOpert();
		System.out.println( opert.calculateDifference(10));
		
		
		
	}
	
	
	
}
