package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
	
  public 	User[] users = new User[4];
	
  public  void createUser() {	
	BufferedReader reader = null;
      try {
		reader = new BufferedReader(new FileReader("data.txt"));
	  } catch (FileNotFoundException e1) {
		e1.printStackTrace();
	  }	
	  String line;
	  try {
	    int i =0;	
		while (( line=reader.readLine() ) != null) {
		  String[] fileInput = line.split(",");
		  User newUser = new User(fileInput[0],fileInput[1],fileInput[2]);
		  users[i]  = new User(newUser);
		  i++;
	    }
	  }catch (IOException e) {
	     e.printStackTrace();
	  }
	}
  public boolean validateUser (String inputUser, String InputPassword) {
	boolean matchCheck= false;
	for (int i= 0; i< 4; i++) {
	  if ((users[i].getUserName().equalsIgnoreCase(inputUser)) && (users[i].getPassword().equals(InputPassword))) {
		System.out.println("Welcome: " + users[i].getName());
		matchCheck = true;
		break;
	   }else {
		matchCheck = false;	
	   }
    }
   return matchCheck;
  }
}

		
		


