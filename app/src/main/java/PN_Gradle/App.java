package PN_Gradle;

import java.util.Scanner;

import validators.PersonNumberValidator;
import validators.Validator;
import validityChecks.ValidityCheck;

public class App {
public static void main(String[] args) {
		
		Validator validator = new PersonNumberValidator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a person number: ");
		
		String number = sc.next();
		
		for (ValidityCheck v : validator.getChecks()) {
			String grade = "passed";
			if (!v.check(number)) {
				grade = "failed";
			}
			System.out.println(number + " " + grade + " " + v.name);
		}
		
		sc.close();
	}
}
