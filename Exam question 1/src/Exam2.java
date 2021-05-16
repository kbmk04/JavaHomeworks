import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter mark : ");
		try {
		int value = input.nextInt();
		
			if (value >= 90 && value < 101) {
				System.out.println(" A ");
			} else if (value >= 80 && value < 90) {
				System.out.println(" B ");
			} else if (value >= 70 && value < 80) {
				System.out.println(" C ");
			} else if (value >= 50 && value < 70) {
				System.out.println(" D ");
			} else if (value >= 0 ){
				System.out.println("F ");
			}
			else {
				System.out.println("invalid number ");
			}
		} catch (Exception e) {
			System.out.println("Exception: please enter integer ");
		}
	}

		
}


