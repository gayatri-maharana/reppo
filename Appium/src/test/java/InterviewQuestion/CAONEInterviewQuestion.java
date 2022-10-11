package InterviewQuestion;

public class CAONEInterviewQuestion {

	public static void main(String[] args) {
		Thread t=new Thread();
		Object o = new Object();
		String str="ABC";
		System.out.println(t==o);//false
		System.out.println(o==str);//true
	//	System.out.println(t==str);//incompatible type thread and string

	}

}
