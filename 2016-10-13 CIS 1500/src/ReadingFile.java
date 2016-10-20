import java.util.Scanner;
import java.io.File;

	
public class ReadingFile {
	
	public static void main(String [] args){
		

		
		try{
			Scanner scan = new Scanner(new File("nums.txt"));
			int num1 = scan.nextInt();
			
			System.out.println("READ: " + num1);
		}
		
		catch(Exception exc){
			
			System.out.println("Problem finding file!");

		}
		
	}

}
