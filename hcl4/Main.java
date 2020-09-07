package com.hcl4;

import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape\n1.Circle\n2.Rectangle\n3.Triangle");
		int choice = sc.nextInt();
		double area;
		if(choice == 1)
		{
			System.out.println("Enter the radius:");
			Double radius = sc.nextDouble();
			Circle cr = new Circle(radius);
		
			cr.computeArea();
			System.out.println("Area of circle is " + cr.getArea());
		}
		else if(choice == 2)
		{
			System.out.println("Enter the length and breadth:");
			Double length = sc.nextDouble();
			Double breadth = sc.nextDouble();
			Rectangle rc = new Rectangle(length, breadth);
			rc.computeArea();
			System.out.println("Area of rectangle is "+ rc.getArea());
		}
		else if (choice == 3)
		{
			System.out.println("Enter the base and height:");
			Double base = sc.nextDouble();
			Double height = sc.nextDouble();
			Triangle tr = new Triangle(base, height);
			tr.computeArea();
			System.out.println("Area of triangle is " + tr.getArea());
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}
