import java.util.Scanner;

/**
 * Class PriceCalculator
 * @autor 2175056 - Sonia Vetra
 * Date: Sept. 14, 2021
 */

public class PriceCalculator {
	
	public static void main(String[] args) {
			
		Scanner myInfo = new Scanner(System.in);
		
		System.out.printf("Please enter the item price: ");
		double price = myInfo.nextDouble();
		
		System.out.printf("Please enter the discount ratio: ");
		double ratio = myInfo.nextDouble();
		
		myInfo.close();
		
        System.out.printf("\n");
		
		double ratioPerc = ratio/100d;
		double fedTaxOrig = 5/100d;
		double provTaxOrig = 9.975/100d;
		
		double noTax = price - (price * ratioPerc);
		
		double fedTax = noTax * fedTaxOrig;
		double provTax = noTax * provTaxOrig;
		
		double finalPrice = noTax + fedTax + provTax;
		
		System.out.printf("%-20s:%.2f\n%-20s:%.2f%%\n%-20s:%.2f\n%s\n%-20s:%.2f\n%-20s:%.2f\n%-20s:%.2f\n",
				  "Original Price", price,
				  "Discount Ratio", ratio,
				  "Price Before Tax", noTax,
				  "--------------------------------",
				  "Federal Tax", fedTax,
				  "Provincial Tax", provTax,
				  "Final Price", finalPrice);
		
    }
	
}