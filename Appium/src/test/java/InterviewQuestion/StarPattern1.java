package InterviewQuestion;

import org.testng.annotations.Test;

public class StarPattern1 {
	
	@Test
	public void downSideTringle()
	{
		int n=5;
		for(int i=n;i>0;i--)
		{
			for(int j=n;j>0;j--)
			{
				if(i>=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	@Test
	public void upaideTringle()
	{
		int n=5;
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	@Test
	public void fibbonacciSeries()
	{
		int num =5;
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0;i<=num;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
		}
		
	}
	
	@Test
	public void pallendrom()
	{
		String str="ph : 12345678";
		String s[]=str.split(":");
		
			 
			System.out.print(s[1]);
			 
		
		
	}
	
	

}
