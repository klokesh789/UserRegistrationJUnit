package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) {
		UserRegistration registration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstName = sc.next();
		registration.validateFirstName(firstName);
		System.out.println("Enter Last Name: ");
		String lastName = sc.next();
		registration.validateLastName(lastName);
		
	}

}
