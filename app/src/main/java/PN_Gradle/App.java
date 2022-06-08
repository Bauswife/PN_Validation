package PN_Gradle;

import java.util.HashMap;
import java.util.Scanner;

import validators.CoordinationNumberValidator;
import validators.OrganizationNumberValidator;
import validators.PersonNumberValidator;
import validators.Validator;
import validityChecks.ValidityCheck;

public class App {
	public static void main(String[] args) {
		
		HashMap<String, Validator> validatorMap = new HashMap<String, Validator>();
		validatorMap.put("1", new PersonNumberValidator());
		validatorMap.put("2", new CoordinationNumberValidator());
		validatorMap.put("3", new OrganizationNumberValidator());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the number validation program!");
		while (true) {
			String selection = menu(sc);
			
			Validator validator = validatorMap.get(selection);
			
			if (validator == null) break;
			
			System.out.print("Please enter your number: ");
			
			String number = sc.next();
			
			boolean passed = true;
			
			for (ValidityCheck v : validator.getChecks()) {
				String grade = "passed";
				if (!v.check(number)) {
					passed = false;
					grade = "failed";
				}
				System.out.println(number + " " + grade + " " + v.name);
			}
			
			System.out.print(number + " is ");
			if (!passed) System.out.print("not ");
			System.out.println("valid");
		}
		
		System.out.println("Thank you for using the number validation program!\nHave a nice day!");
		
		sc.close();
	}
	
	private static String menu(Scanner sc) {
		System.out.print("\n\nWhat would you like to do?\n" + 
						 "1. Validate person number\n" +
						 "2. Validate coordination number\n" +
						 "3. Validate organization number\n" + 
						 "4. Exit program\n\n" + 
						 "Please make your selection: "
		);
		return sc.next();
	}
}
