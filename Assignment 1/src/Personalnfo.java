import java.util.Scanner;

/**
 * Class Personalnfo
 * @autor 2175056 - Sonia Vetra
 * Date: Sept. 14, 2021
 */

public class Personalnfo {
	
	public static void main(String[] args) {
		
        Scanner myInfo = new Scanner(System.in);
		      
        System.out.printf("Please enter your name: ");
	    String name = myInfo.nextLine();
		        
	    System.out.printf("Please enter your age: ");
	    int age = myInfo.nextInt();
		        
	    System.out.printf("Please enter your gender: ");
	    String gender = myInfo.next();
		        
        myInfo.nextLine();
		        
	    System.out.printf("Please enter your department: ");
	    String department = myInfo.nextLine();
		                
	    System.out.printf("Please enter the value of PI (3.1415926): ");
	    float PI = myInfo.nextFloat();

	    myInfo.close();
	    
        System.out.printf("\n");
	

	    System.out.printf("%-15s:%s\n%-15s:%d\n%-15s:%s\n%-15s:%s\n%-15s:%.2f\n",
			"Name", name,
			"Age", age,
			"Gender", gender,
			"Department", department,
			"PI", PI);
	
	}

}