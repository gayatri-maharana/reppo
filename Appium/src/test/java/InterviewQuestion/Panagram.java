package InterviewQuestion;

public class Panagram {

	public static void main(String[] args) {
		String str="The  quick brown fox jumps over the lazy dog";
		allLetter(str);

	}
	
	
	
	public static void  allLetter(String str)
	{
		str=str.toLowerCase();
		boolean allLettersPresent = true;
		for(char ch='a';ch<='z';ch++)
		{
			if(!str.contains(String.valueOf(ch)))
			{
				allLettersPresent=false;
				break;
			}
		}
		if(allLettersPresent)
			System.out.println(str+" is panagram");
		else
			System.out.println(str+ " is not a panagram");
	}

}
