package Appium.testScript;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintDifferentString {

	public static void main(String[] args) {
		String s1="this dog black";
		String s2="this cat black monkey";
		String s=s1+" "+s2;
		String s3[]=s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < s3.length; i++) {
			set.add(s3[i]);
		}
		for(String str: set)
		{
			int count=0;
			for (int i = 0; i < s3.length; i++) {
				if(s3[i].equals(str))
				{
					count++;
				}
				
			}
			if(count==1)
			{
				System.out.println(str);
			}
		}
	}

}
