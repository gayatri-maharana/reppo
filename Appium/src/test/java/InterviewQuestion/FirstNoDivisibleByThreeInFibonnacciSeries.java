package InterviewQuestion;

import java.util.Scanner;

public class FirstNoDivisibleByThreeInFibonnacciSeries {

	public static void main(String[] args) {
		int term,a=0,b=1,c;
		System.out.print("Enter term");
		Scanner sc= new Scanner(System.in);
		term=sc.nextInt();
		for(int i=1; i<=term;i++) {
			if(a%3==0&&a!=0) {
				System.out.println(a);
			}
			c=a+b;
			a=b;
			b=c;
		}


	}

}
