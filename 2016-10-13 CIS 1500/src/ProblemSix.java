
/*
 * In-class looping problem CIS1500
 * Problem Six from Kiowok
 * 
 * @author David Kataja
 * @version 10-13-2016 CIS 1500
 */

import java.util.Scanner;

public class ProblemSix {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int count = 0;

		while (num >= 0) {

			if (num >= 0)
				count++;

			num = scan.nextInt();

		}

		System.out.println("There were " + count + " numbers entered");
	}

}
