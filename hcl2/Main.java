package com.hcl2;

import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		AccountBO acc=new AccountBO();
		System.out.println("Enter the details");
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		FixedAccount fa= acc.getAccountDetail(s);
		System.out.println(String.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance",
		"Account holder name","Minimum balance","Locking period"));
		System.out.println(String.format("%-20s %-10s %-20s %-20s %s\n",fa.getAccountNumber(),
				fa.getBalance(),fa.getAccountHolderName(),fa.getMinimumBalance(),
				fa.getLockingPeriod()));



	}
}
