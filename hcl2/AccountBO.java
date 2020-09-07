package com.hcl2;

import java.util.Scanner;

public class AccountBO {
	public FixedAccount getAccountDetail(String details) {
		   FixedAccount facc= new FixedAccount();
		 /*  Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account Detail");*/
		String str[]= details.split(",");
		facc.setAccountNumber(str[0]);
		facc.setBalance(Double.parseDouble(str[1]));
		facc.setAccountHolderName(str[2]);
		facc.setminimumBalance(Double.parseDouble(str[3]));
		facc.setLockingPeriod(Double.parseDouble(str[4])); 
		return facc;
}
}
