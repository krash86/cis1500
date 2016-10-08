import java.util.Scanner;


public class BoolDemo {
	
	public static void main(String [] args){
		
		System.out.println("What is your year at college?");
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		
		if (year == 1)
		System.out.println("You are a Freshmen in college."); 
			else if (year == 2)
		System.out.println("Sophmore");
			else if (year == 3)
		System.out.println("Junior");
			else if (year == 4)
		System.out.println("Senior");
		else
			System.out.println("Invalid entry");
			
	}

}
