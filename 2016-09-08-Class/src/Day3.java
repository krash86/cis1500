/**
 * 
 * @author David Kataja
 * @version 2016 Sep 08 CIS 1500
 *
 */
public class Day3 {

	// ******* information (data) *******

	/*
	 * Built-in types of data
	 * 
	 * integers 35 (byte, short, int, long) floating point numbers 12.1 (float,
	 * double) characters Y (char) boolean true/false (boolean)
	 * 
	 */

	// Object data

	// ******* Instructions *******
	public static void main(String[] args) {

		byte age = 17;
		age++;

		System.out.println(age);

		System.out.println("abc\ndef");
		System.out.println("we \"love\" java");
		System.out.println("My fav character is \\");

		double rate = 16.50;
		byte hr = 32;

		// A-Z a-z 0-9 _ $
		double totalPay = rate * hr;
		System.out.println("Total Pay: " + totalPay);

	}

}