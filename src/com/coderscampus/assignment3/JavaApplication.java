package com.coderscampus.assignment3;

import java.util.Scanner;

public class JavaApplication {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);;
		try {
			int counter=0;
			for(int i=0; i < 5; i++) {
				UserService service = new UserService();
				service.createUser();
				System.out.println("Enter username");
				String inputName = scanner.nextLine();
				System.out.println("Enter Password");
				String inputPassword = scanner.nextLine();
				if(service.validateUser(inputName, inputPassword)) {
						break;				
				}else{
					System.out.println("Invalid login, please try again.");
				}
				counter++;
			}
			if(counter == 5) {
				System.out.println("\nToo many failed login attempts, you are now locked out.");
			}
		}finally {
			scanner.close();
		}
	
	}
}
