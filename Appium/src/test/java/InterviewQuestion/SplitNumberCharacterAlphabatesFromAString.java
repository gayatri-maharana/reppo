package InterviewQuestion;

import java.util.Scanner;

public class SplitNumberCharacterAlphabatesFromAString {

	public static void main(String[] args) {
//		Scanner user_input = new Scanner( System.in );
//
//	      String variable;
//
//	      System.out.print("Enter Variable:");
//
//	      variable = user_input.next();
//
//	      Separate(variable);

//	}
//	 public static void Separate(String str) 
//     {
		String str="34ACx3%@!OPPklytesd";
      String number = "";
      String Uletter = "";
      String lowletter = "";
      String symbol = "";
      
      for (int i = 0; i < str.length(); i++) {

             char a = str.charAt(i);

             if (Character.isDigit(a)) {
                   number = number + a;

             }else if (Character.isUpperCase(a)) {
				Uletter=Uletter+a;
			} 
             else if (Character.isLowerCase(a)) {//.isLetter(a)
            	 lowletter = lowletter + a;
             } else {
                   symbol = symbol + a;
     }
   }
 System.out.println("Uppercase Alphabets in string:"+Uletter);
 System.out.println("Lower case alphabates in string: "+lowletter);
 System.out.println("Numbers in String:"+number);
 System.out.println("Symbols in String:"+symbol);   
}

}
