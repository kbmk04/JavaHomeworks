package homeworkfour;

public class exercise3 {

	public static void main(String[] args) {
		// write a java program to find the index of an array element.
		//[4, 6, 7, 9] x=7
		
		int [] myArray = {4, 6, 7, 9};
		int x = 7;
		int index = -1;
		int i =0;
		while (i < myArray.length) {
			if (myArray[i]== x) {
				index =i;
				break;
			}
			i++;
		}
		
System.out.println("locate index  " + x + " is " + index);
	}

}
