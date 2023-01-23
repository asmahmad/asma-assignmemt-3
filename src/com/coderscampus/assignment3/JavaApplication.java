package com.coderscampus.assignment3;

import java.util.Scanner;

public class JavaApplication {

	public static void main(String[] args) {
		int counter;
		for (int i=0; i < 5; i++) {
				Scanner scanner = new Scanner(System.in);
				UserService service = new UserService();
				service.createUser();
				System.out.println("Enter username");
				String inputName = scanner.nextLine();
				System.out.println("Enter Password");
				String inputPassword = scanner.nextLine();
				counter = service.validateUser(inputName, inputPassword);
				
					if  (counter == 1) {
						break;				
					}
				
		}

	}

}
