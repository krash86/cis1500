import java.util.Scanner;


public class RandomDay {
	
	public static void main(String [] args){
		
		//Ask user for input
		
		System.out.println("Please enter a number 1-7 for day of the week:");
		
		Scanner scan = new Scanner(System.in);
		
		int day = scan.nextInt();
		
		/* Check input and print proper response.
		 * 
		 * In class the teacher showed us how to do this using
		 * cascading "if else" statements for each valid
		 * input. I came up with this before the other example
		 * was demonstrated.
		 */
		
		if (day >=1 && day <=5)
			System.out.println("That is a weekday");
		else if (day >=6 && day <=7)
			System.out.println("That is a weekend");
		else if (day <1 || day >7)
			System.out.println("Invalid input");
	}

}
