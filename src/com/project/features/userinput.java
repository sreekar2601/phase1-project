package com.project.features;

import java.util.Scanner;

public class userinput extends operations{
	static Scanner sc=new Scanner(System.in);
	
public static void welcomescreen() {
		
		//Scanner sc=new Scanner(System.in);
		
		System.out.println("VIRTUAL KEY FOR REPOSITORIES  ");
		System.out.println();
		System.out.println("Welcome to LockedMe.com");
		System.out.println();
		System.out.println("Developed By Sreekar P");
		System.out.println();
		System.out.println("Please Select one of the Options Listed: ");
		System.out.println();
		System.out.println("1. Enter into the Application");
		System.out.println("2. Close the Application");
		
	}
	
	

	
	public static void display() {
		
		
		System.out.println("Enter the input to perform the below operations: ");
		System.out.println("1. Add a File");
		System.out.println("2. Delete a File");
		System.out.println("3. Search a File");
		System.out.println("4. Display Files");
		System.out.println("5. Main Menu");
		//System.out.println("6. Quit");
		
		
	}
	public static void userip()
	{
		
		
		System.out.println();
		System.out.print("Enter the input: ");
		
		System.out.println();
		int x=sc.nextInt();
	

			switch(x) {
			case 1:
					display();
					operations();
					break;
			case 2:
				
				System.out.println("Application Closed");
				break;
				
			default:
				//quit1=true;
			    	System.out.println("Error You have Entered Wrong Option");
			    	
			    	userip();
			    	break;
				
			}
		
		
	
			
			
	
			
		
		
		//System.out.println();
	}
	
		public static void operations() {
			
			boolean quit=false;
		do {
			switch(sc.nextInt()) {
			case 1:
				addfile();
				System.out.print("Enter input: ");
				break;
				
			case 2:
				delete();
				System.out.print("Enter input: ");
				break;
			case 3:
				search();
				System.out.print("Enter input: ");
				break;
			case 4:
				display1();
				System.out.print("Enter input: ");
				break;
				
				
			case 5:
				quit=true;
				System.out.println("1. Enter into the Application");
				System.out.println("2. Close the Application");
				//System.out.println("Enter input: ");
				System.out.println();
				userip();
				break;
				
			
			
			default:
				System.out.println("Error you have entered incorrect option");
				System.out.println("Enter correct input: ");
		
		
	}
		}while(!quit);
			
		
	
		
		
	}
	

}
