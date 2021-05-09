import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println( " Enter a number b/N 1 to 7");
		int day = input.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("Monday it's weekday");
			break;
		case 2:
			System.out.println("Tuesday it's weekday");
			break;
		case 3:
			System.out.println("Wednesday it's weekday");
			break;
		case 4:
			System.out.println("Thursday it's weekday");
			break;
		case 5:
			System.out.println("Friday it's weekday");
			break;
		case 6:
			System.out.println("Satuday it's weekend");
			break;
		case 7:
			System.out.println("Sunday it's weekend");
			break;
			default:
			System.out.println("Sorry the input is invalid, pls enter 1 to 7 numbers");
			
		}
		
		}
	}


