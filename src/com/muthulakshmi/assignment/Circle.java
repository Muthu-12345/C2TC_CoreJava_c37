package com.muthulakshmi.assignment;
import java.util.Scanner;

public class Circle 
{
	public double radius;
	public String color;
	  
	public void getInput()
	{
		Scanner s=new Scanner(System.in);
		    System.out.print("Enter the Radius of the circle:");
		    radius=s.nextDouble();
		    System.out.print("Enter the Color of the circle:");
		    color=s.next();
	}
	double calcarea()
	{
		double area=Math.PI*radius*radius;
		System.out.println("Area of the circle with radius"+radius+"and color"+color+"is:"+area);
		return area;
	}
	public static void main(String args[])
	{
		Circle circle=new Circle();
		circle.getInput();
		double area=circle.calcarea();
		System.out.println("Area of the cicle:"+area);
	}
}
	
	
	
	
	
		
		    
		    
		    
	
	
	

	
	

	

