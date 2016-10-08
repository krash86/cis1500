
/*
 * This is a simple sales tax calculator for programming class.
 * We were asked to write this with the ability to take an income
 * input from the user and an estimated portion spent on taxable items.
 * We are then supposed to calculate the tax at one rate and again at 
 * another "proposed" rate. The third step is to calculate the difference
 * of the two rates.
 * 
 * I've taken some liberty with how I interpret this project. 
 * I hope that this will show that I am aware of the details and not paint me as a show-off.
 * The core requirements are included, though they may vary from the rubric.
 * 
 * Things that I hope this assignment interpretation will highlight:
 *	1. That I can "think outside the box" (a drab and too often used statement in my opinion)
 *	2. That it does not negatively impact my grade
 *	3. That I like a challenge, I thought the original requirements were easy, so I spiced it up
 *
 *
 * @author David Kataja
 * @version 2016-10-01 CIS 1500 - OCC
 */

import java.util.*;

public class SalesTax {

	public static final double TAX_SIX = .06;
	public static final double TAX_SEVEN = .07;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Welcome the user, please be kind.
		System.out.println("Welcome to the Michigan sales tax calculator!");

		// Make the flow more elegant
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			assert false;
		}

		// Explain what we are doing
		System.out.println("\nWe are going to calculate the current amount of your income spent on sales tax,");
		System.out.println("the amount spent if the sales tax is increased by 1%, and the difference.");

		// Elegant flow
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			assert false;
		}

		// Alert the user that we are starting...NOW!
		System.out.println("\nLet's begin!");

		// More elegant timing
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			assert false;
		}

		// Ask for the user's income
		System.out.println("\nPlease enter your yearly income: ");
		double income = scan.nextDouble();

		// Ask user for the percentage of income that is spent on taxable goods
		System.out.println("Please enter the percentage of your income that is spent on taxable goods (0 to 100): ");
		double taxIncomePercent = scan.nextDouble() / 100;

		// Store taxable portion of income
		double taxableIncome = income * taxIncomePercent;

		// Print taxable income amount in human readable format
		System.out.printf("Taxable income: $%,.2f", taxableIncome);

		// Set variables for 6%, 7&, and the difference
		double sixPT = taxableIncome * TAX_SIX;
		double sevenPT = taxableIncome * TAX_SEVEN;
		double diffTax = sevenPT - sixPT;

		// Print amount of tax at 6%, 7%, and difference in human readable
		// format
		System.out.printf("\nAt current 6%% tax rate: $%,.2f", sixPT);
		System.out.printf("\nAt proposed 7%% tax rate: $%,.2f", sevenPT);
		System.out.printf("\nDifference: $%,.2f", diffTax);

		// More elegant timing
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			assert false;
		}

		// Thank you user
		System.out.println("\n\nThank you for using the Michigan sales tax calculator!");

		// Make a graceful exit
		System.exit(0);

	}

}
