package InterviewQuestion;

import java.util.LinkedHashSet;

public class OccuranceWithOutCollection {

	public static void main(String[] args) {
		//to append no of zeros
		int a[]= {3,7,0,0,9,8,7,0};
		for(int i=0;i<a.length;i++) {
		if(a[i]==0)
		{
			System.out.print(a[i]+" ");
		}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
