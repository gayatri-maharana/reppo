package InterviewQuestion;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CountEachCharacterOccuranceOfCharacter {
	@Test
	public void countNoChar()
	{
		String str="gayatrii";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(ch==str.charAt(i))
				{
					count++;
				}
			}
			System.out.print(ch+":"+count);
		}
	}
	
	@Test
	public void firstLetterUpperCase()
	{
		String str="gayatri can Do everything";
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			String word = s[i];
			word=word.substring(0, 1).toUpperCase()+word.substring(1);
			System.out.println(word);
			
		}
	}

	public void countVowelInStrinArray()
	{
		String str[]= {"apple","orange","mango","banana"};
		for(int i=0;i<str.length;i++)
		{
			String m=str[i];
			for(int j=0;j<m.length();j++)
			{
				char ch=m.charAt(j);
				
			}
		}
	}
}
