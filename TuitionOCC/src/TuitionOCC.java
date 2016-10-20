
/*
 * This is a simple GUI based calculator to find out 
 * tuition cost at OCC.
 * 
 * @author David Kataja
 * @version 2016-10-16 CIS 1500
 * 
 */

import javax.swing.JOptionPane;

public class TuitionOCC {

	// Set variables that will not change

	public static final double IN_DISTRICT = 88.00;
	public static final double OUT_DISTRICT = 171.00;
	public static final double INTERNATIONAL = 240.00;

	public static void main(String[] args) {

		// call JOptionPane to welcome the user

		JOptionPane.showMessageDialog(null, "Calculate your tuition!", "Tuition at OCC",
				JOptionPane.INFORMATION_MESSAGE);

		// show the input dialog to find out what type of student the user is

		String studentTypeString = JOptionPane.showInputDialog(
				"Are you a:\n" + "1 - College District resident\n" + "2 - Non-Resident of College District\n"
						+ "3 - Out-of-State or International Student\n" + "\nPlease enter a 1, 2, or 3:");

		// added last minute to handle the cancel button

		if (studentTypeString == null) {
			System.exit(0);
		}

		// error message on invalid selection

		if (studentTypeString.length() == 0) {
			JOptionPane.showMessageDialog(null, "You must enter a 1, 2, or 3!\n" + "Please run the program again.",
					"No input", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}

		// change the string to an int for later

		int studentTypeNum = Integer.parseInt(studentTypeString);

		// if the student type is invalid show an error message
		// we can use the same message from above ^

		if (studentTypeNum < 1 || studentTypeNum > 3) {
			JOptionPane.showMessageDialog(null, "You must enter a 1, 2, or 3." + "\nPlease run the program again.",
					"Invalid Input", JOptionPane.ERROR_MESSAGE);
			System.exit(0);

		}

		// if everything went well up to this point,
		// we can now ask for the amount of credit hours

		String creditHoursString = JOptionPane.showInputDialog(null, "How many credit hours are you taking?");

		// again, handle the cancel button

		if (creditHoursString == null) {
			System.exit(0);
		}

		// check for valid input
		// we want to keep the student limited to "real" values

		if (creditHoursString.length() == 0 || creditHoursString.length() >= 3) {
			JOptionPane.showMessageDialog(null,
					"You have either entered too few or too many credit hours."
							+ "\nPlease run the program again, and enter a number between 1 and 99",
					"invalid Amount", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}

		// change the string to an int for later

		int creditHoursNum = Integer.parseInt(creditHoursString);

		// check for valid input, you can't have 0 or a negative amount of
		// credit hours

		if (creditHoursNum <= 0) {
			JOptionPane.showMessageDialog(null, "Please enter a positive number greater than zero!", "Invalid input",
					JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}

		// things are going well if you made it to this point

		// calculate tuition for an in-district student

		if (studentTypeNum == 1) {
			JOptionPane.showMessageDialog(null,
					creditHoursNum + " credit hours at " + String.format("$%,.2f", IN_DISTRICT)
							+ " per hour yields a tuition of " + String.format("$%,.2f", IN_DISTRICT * creditHoursNum),
					"In District Tuition", JOptionPane.INFORMATION_MESSAGE);
		}

		// calculate tuition for an out-of-district student

		else if (studentTypeNum == 2) {
			JOptionPane.showMessageDialog(null,
					creditHoursNum + " credit hours at " + String.format("$%.2f", OUT_DISTRICT)
							+ " per hour yields a tuition of " + String.format("$%,.2f", OUT_DISTRICT * creditHoursNum),
					"Out of District Tuition", JOptionPane.INFORMATION_MESSAGE);
		}

		// calculate tuition for an out-of-state or international student

		else if (studentTypeNum == 3) {
			JOptionPane.showMessageDialog(null,
					creditHoursNum + " credit hours at " + String.format("$%,.2f", INTERNATIONAL)
							+ " per hour yields a tuition of "
							+ String.format("$%,.2f", INTERNATIONAL * creditHoursNum),
					"Out of State or International Tuition", JOptionPane.INFORMATION_MESSAGE);
		}

		// exit gracefully

		System.exit(0);

	}

}