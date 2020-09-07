package com.hcl3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		double cost = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the stall:");
		String name = sc.nextLine();
		System.out.println("Enter the details of the stall:");
		String details = sc.nextLine();
		System.out.println("Enter the owner name of the stall:");
		String owner = sc.nextLine();
		System.out.println("Enter the type of the stall:");
		String type = sc.nextLine();
		Stall stall = new Stall(name, details, owner);
		System.out.println("Enter the size of the stall in square feet:");
		int size = sc.nextInt();
		sc.nextLine();
		System.out.println("Does the hall have TV?(y/n)");
		char choice = sc.nextLine().charAt(0);
		if(choice == 'y')
		{
			System.out.println("Enter the number of TV:");
			int noOFTV = sc.nextInt();
			cost = stall.computeCost(type, size, noOFTV);
		}
		else
		{
			cost = stall.computeCost(type, size);
		}
		System.out.println("The cost of the stall is " + cost);
	}

	
}
