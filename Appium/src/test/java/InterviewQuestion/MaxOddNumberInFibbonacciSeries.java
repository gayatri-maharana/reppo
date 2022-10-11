package InterviewQuestion;

import java.util.Scanner;

public class MaxOddNumberInFibbonacciSeries {

	public static void main(String[] args) {
		
			int term,a=0,b=1,c;
			int firstMax=0;
			System.out.print("Enter term");
			Scanner sc= new Scanner(System.in);
			term=sc.nextInt();
			for(int i=1; i<=term;i++) {
				System.out.print(a+" ");
				if(firstMax<a && a%2==1) {
					firstMax=a;
				}
				
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println();
			System.out.println("Max odd number is = "+firstMax);
			
		}

	

}
