import java.util.Scanner;
	
	
public class DemoSentinelLoop {
	
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		x = scan.nextInt();
		
		while (x >= 0){
			
			System.out.println("READ: " + x);
			x = scan.nextInt();
			
		}
	}

}
