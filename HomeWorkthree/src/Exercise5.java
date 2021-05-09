import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
	
		int sum = 0;
		double average = 0;
		Scanner input= new Scanner (System.in);
		System.out.println(" Enter your first number");
		int x = input.nextInt();

		System.out.println(" Enter your second number");
		int y = input.nextInt();
		
		while(true) {
			sum = x+y;
			average = sum /2;
			System.out.println("the average of x and y " + average);
			break;
			
		}
	}

}
