package com.project.features;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class operations {
	static Set<String> hs=new HashSet<>();
	static Scanner sc=new Scanner(System.in);
	public static void addfile() {
		
		
		
		System.out.println();
		System.out.println("Enter the file name: ");
		String name=sc.nextLine();
		if(hs.contains(name))
		{
			System.out.println("File Already Present");
		}
		else {
			hs.add(name);
			System.out.println("File added successfully");
		}
		
		
		
	}
	public static void display1()
	{
		TreeSet<String> ts=new TreeSet<>(hs);
		if(ts.isEmpty())
		{
			System.out.println("No Files are stored");
		}
		else {
			System.out.println("Files Added are: ");
			for(String arr:ts)
			{
				System.out.println(arr);
			}
		}
		
		
	}
	
	public static void delete()
	{
		System.out.println("Enter the File Name that needed to be deleted: ");
		String s=sc.nextLine();
		if(hs.contains(s)) {
			hs.remove(s);
			System.out.println("File Removed Successfully");
		}
		else {
			System.out.println("File Not Found");
		}
	}
	public static void search()
	{
		System.out.println("Enter the File Name to Search: ");
		String str=sc.nextLine();
		if(hs.contains(str)) {
			System.out.println("File Found in the Directory");
			System.out.println(str.toString());
		}
		else {
			System.out.println("File Not Found");
		}
	}
	

}
