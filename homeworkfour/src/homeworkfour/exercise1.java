package homeworkfour;

public class exercise1 {

	public static void main(String[] args) {
		// write a java program to calculate the average value of array integer
		
		int[] num =new int [] {8, 10, 14, 16};
		
		int Sum = 0;
		for (int i = 0; i < num.length; i++) {
			Sum = Sum + num[i];
		}
		
		double average = Sum / num.length;
		
		System.out.println("The average value is: "+ average);
	}

}
