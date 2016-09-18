/*
nextInt - int
nextDouble - double
nextLine - entire line as a string
next - read one word as a string


 */
import java.util.*;


public class ScannerDemo {
	
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("This small utility will average three numbers");
		System.out.println("Please enter your first number:");
		double num1 = scan.nextDouble();
		System.out.println("Please enter your second number:");
		double num2 = scan.nextDouble();
		System.out.println("Please enter your third number:");
		double num3 = scan.nextDouble();
		double num4 = num1+num2+num3;
		double num5 = num4/3;
		System.out.println("Total:" + num4);
		System.out.println("Average:" + num5);
		
	}

}
