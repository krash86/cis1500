import java.util.Scanner;
import java.io.File;

	
public class SumFromFilePromptUser {
	
	public static void main(String [] args){
				
		try{			

			System.out.println("Please enter a filename: ");
			Scanner keyboard = new Scanner(System.in);
			String userinput = keyboard.next();
			
			Scanner scan1 = new Scanner(new File(userinput));
			int num1 = scan1.nextInt();
			int num2 = scan1.nextInt();
			int sum = num1 + num2;


			System.out.println("SUM: " + sum);
		}
		
		catch(Exception exc){
			
			System.out.println("Problem finding file!");

		}
		
	}

}
