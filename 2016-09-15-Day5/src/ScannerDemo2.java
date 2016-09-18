/*
nextInt - int
nextDouble - double
nextLine - entire line as a string
next - read one word as a string


 */
import java.util.*;


public class ScannerDemo2 {
	
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		// The cat ran down the road.
		
		String word1 = scan.next();
		System.out.println(word1);
		String word2 = scan.next();
		String word3 = scan.next();
		String word4 = scan.next();
		String word5 = scan.next();
		String word6 = scan.next();
		String word7 = (word1+word2+word3+word4+word5+word6);
		System.out.println(word7);
		
		
		
	}

}
