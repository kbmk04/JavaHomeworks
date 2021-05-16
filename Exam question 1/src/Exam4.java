import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
	 int count = 0;
	 
	   System.out.println("Enter a statment :");
	   Scanner input= new Scanner(System.in);
	   
	   String sentence = input.nextLine();
	   for (int i=0 ; i<sentence.length(); i++){
	     char ch = sentence.charAt(i);
	     if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
	      count ++;
	     }
	   }
	   System.out.println("Number of vowels is : "+count);
}
}
