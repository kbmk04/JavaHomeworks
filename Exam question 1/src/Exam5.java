import java.util.Scanner;
public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your phone number : ");
		long num = input.nextLong();
		
		long length = (long)(Math.log10(num) + 1);
		if (length == 10) {
			System.out.println("Valid phone number");
		} else if (length > 10) {
			System.out.println("Invaild phone number it's too long");
		} else  {
			System.out.println("Invalid phone number it's too short");
		} 
		
	
	}

}
