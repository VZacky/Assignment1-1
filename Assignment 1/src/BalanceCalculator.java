import java.util.Scanner;

/**
 * Class BalanceCalculator
 * @autor 2175056 - Sonia Vetra
 * Date: Sept. 14, 2021
 */

public class BalanceCalculator {
	
	public static void main(String [] args) {
		
		Scanner myInfo = new Scanner(System.in);
		
		System.out.printf("Please enter the inital balance:");
		float initialBalance = myInfo.nextFloat();
		float initialBalanceHold = initialBalance;
		
		System.out.printf("Please enter the annual interest rate (2 for 2%%):");
		float annualInterest = myInfo.nextFloat();
		float annualInterestHold = annualInterest;
		
		System.out.printf("Please enter the number of years the client wants to save money in the bank:");
		int nbYears = myInfo.nextInt();
		
		myInfo.close();
		
		System.out.printf("\n");
		
		float annualInterestPerc = annualInterest/100;
		float yearRate = 0;
		
		for (int i = 0; i < nbYears; i++) 
		{
			yearRate = initialBalance * annualInterestPerc;
			initialBalance = initialBalance + yearRate; 
		}
		
		System.out.printf("%-25s:%10.2f\n%-25s:%9.2f%%\n%-25s:%10d\n%s\n%-25s:%10.2f",
				"Initial Balance", initialBalanceHold,
				"Annual Interest Rate", annualInterestHold,
				"Saving Years", nbYears,
				"-------------------------------------",
				"Balance After 5 Years", initialBalance);
		
		
	}
	
	

}