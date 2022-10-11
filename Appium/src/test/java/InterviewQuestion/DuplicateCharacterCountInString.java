package InterviewQuestion;

import java.util.LinkedHashSet;

public class DuplicateCharacterCountInString {

	public static void main(String[] args) {
		String str="Welcome to Moolya";
		str=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==ch)
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(ch+" : "+count);
			}
		}
		
		
		
			}

	

}
