package InterviewQuestion;

public class PrintTenNumberWithOutLoop {

	public static void main(String[] args) {
	
		System.out.println("start");
		printNumber(1);
		
		System.out.println("end");

	}
	public static void printNumber(int num)
	{
		
		if (num <= 10) {
            System.out.println(num);
            printNumber(num + 1);
        }
			
	}

}
