package InterviewQuestion;

public class PrintOneToThousandAndPrintHIinFourthPosition {

	public static void main(String[] args) {
		// 1,2,3,hi,5,6,7,hi...1000
		for(int i=1;i<=1000;i++)
		{
			if(i==1000)
			{
				System.out.println(i);
			}
			else if( i%4==0)
				System.out.println("hi");
			else 
				System.out.println(i);
		}

	}

}
