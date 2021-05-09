import java.util.Scanner;

public class Exercise4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(" inter positive integer:");
		int x = input.nextInt();
	
	
		do {
			
			--x;
			
		if ( x % 2 == 0 ) {
			System.out.println(x);
		}
		
		} while(x>0);
		
		
	}

}
