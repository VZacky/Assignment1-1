import java.util.Scanner;

/**
 * Class NumberConverter
 * @autor 2175056 - Sonia Vetra
 * Date: Sept. 14, 2021
 */

public class NumberConverter {

	public static void main(String[] args) {
		
		Scanner myInfo = new Scanner(System.in);
		
		System.out.print("Please enter a 4-digits Octal number: ");
		int octal = myInfo.nextInt();
		int octalHold = octal;
		
		myInfo.close();

        System.out.print("\n");
		
		int dec = 0;
		int u2 = 0;
		
		for (int i = 0; i < Integer.toString(octalHold).length(); i++)
		{
			int u = octal%10;
			u2 = (int) (Math.pow(8,i) * u);
			octal = octal/10;
		
			dec += u2;
		}
		
		System.out.printf("%-15s:%d\n%-15s:%d\n",
				"Octal Number", octalHold,
				"Decimal Number", dec);
		
	}

}