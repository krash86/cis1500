import java.util.Scanner;
import java.io.File;

	
public class SumFromFile {
	
	public static void main(String [] args){
				
		try{
			Scanner scan = new Scanner(new File("nums.txt"));
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int sum = num1 + num2;


			System.out.println("SUM: " + sum);
		}
		
		catch(Exception exc){
			
			System.out.println("Problem finding file!");

		}
		
	}

}
