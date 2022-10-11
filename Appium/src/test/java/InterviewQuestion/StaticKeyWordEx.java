package InterviewQuestion;

public class StaticKeyWordEx {
	static int a=10;
	public  void m1()
	{
		StaticKeyWordEx.a=20;
	}

	public static void main(String[] args) {
		String str="389758hjldsfbksdnJJKJJHFHG$%^*()(^%$ghjj";
		separate(str);

	}
	//The principal operations on a StringBuilder are the append and insert methods, which areoverloaded so as to accept data of any type. Each effectivelyconverts a given datum to a string and then appends or inserts thecharacters of that string to the string builder. The append method always adds these characters at the endof the builder; the insert method adds the characters ata specified point. 
	
	public static void separate(String string) {
        StringBuilder lowerAlphabetsBuilder = new StringBuilder();
        StringBuilder upperAlphabetsBuilder = new StringBuilder();
        StringBuilder numbersBuilder = new StringBuilder();
        StringBuilder symbolsBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char a = string.charAt(i);
            if (Character.isLowerCase(a)) {
            	lowerAlphabetsBuilder.append(a);
            } else 
            if (Character.isDigit(a)) {
                numbersBuilder.append(a);
            } 
            else if (Character.isUpperCase(a)) {
            	upperAlphabetsBuilder.append(a);
			}
            else {
                symbolsBuilder.append(a);
            }
        }
        System.out.println("Alphabets in string: " + lowerAlphabetsBuilder.toString());
        System.out.println("Alphabets uppercase in string: " + upperAlphabetsBuilder.toString());
        System.out.println("Numbers in String: " + numbersBuilder.toString());
        System.out.println("Sysmbols in String: " + symbolsBuilder.toString()); 
    }

}
