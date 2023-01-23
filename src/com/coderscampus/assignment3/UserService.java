package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
	
	public 	User[] user = new User[4];
	int i =0;

	public  void createUser() {
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("data.txt"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}	
		String line;
		
		try {
			while (( line=reader.readLine() ) != null) {
				
				String[] fileInput = line.split(",");
				user[i].setUserName(fileInput[0]);
				user[i].setPassword(fileInput[1]);
				user[i].setName(fileInput[2]);
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
	public int validateUser (String inputUser, String InputPassword) {
		int match=0;
		for (int i=0; i<5; i++) {
			

			if (	(user[i].getUserName().equalsIgnoreCase(inputUser)) && (user[i].getPassword().equals(InputPassword))) {
				System.out.println("Welcome " + user[i].getName());
				match = 1;
				break;
			} else {
				System.out.println("Invalid login, please try again.");
				match = 0;
			}

		}

		return match;
		
	}
}

		
		


