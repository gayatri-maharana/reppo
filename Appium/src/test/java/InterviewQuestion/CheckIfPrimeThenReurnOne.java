package InterviewQuestion;

public class CheckIfPrimeThenReurnOne {

	public static void main(String[] args) {
		int n=6;
		int count=0;
		if(n==0||n==1)
		{
			count++;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println(n+ " not prime ");
		}
		else
			System.out.println(n +" is prime");
		
	}

}
