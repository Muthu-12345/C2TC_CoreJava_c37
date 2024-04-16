package com.tnsif.StudentDetails;
import java.util.Scanner;

public class StudentDetails 
{
	public static void main(String[]args) 
	{
		Scanner scr=new Scanner(System.in);
		String name;
		char initial;
		char grade;
		long rollnumber;
		float percentage;
		
		
		System.out.println("Enter your Name:");
		name=scr.nextLine();
		
		
		System.out.println("Enter your Initial:");
		initial=scr.next().charAt(0);
		
		
		
		System.out.println("Enter your Rollnumber:");
		rollnumber=scr.nextInt();
		
        System.out.println("Enter your Grade:");
		grade=scr.next().charAt(0);
		
		System.out.println("Enter your Percentage:");
		percentage=scr.nextFloat();
		
		System.out.println("Initial:"+initial);
		System.out.println("Grade:"+grade);
		System.out.println("Name:"+name);
		System.out.println("Rollnumber:"+rollnumber);
		System.out.println("Percentage:"+percentage);
		scr.close();
	}
}
		
		
	