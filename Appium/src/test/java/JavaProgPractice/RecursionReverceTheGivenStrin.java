package JavaProgPractice;

public class RecursionReverceTheGivenStrin {
   
	public static void main(String[] args) {
		String str="how are u";
		reverseString(str);

	}
	public static void reverseString(String string)
	{
		{   
			if ((string==null)||(string.length() <= 1))   
			System.out.println(string);   
			else  
			{   
			System.out.print(string.charAt(string.length()-1));   
			reverseString(string.substring(0,string.length()-1));   
			}   
			}   
		
	}

}
