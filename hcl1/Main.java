package com.hcl1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args)throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Account acc=new Account();
		
		System.out.println("Choose the account type as 1 or 2");
		int accountType =Integer.parseInt(br.readLine());
		 System.out.println("Enter the account details in comma separated");
	
		 if(accountType==2) {
			 CurrentAccount currentAcount = new CurrentAccount();
			 String[] accountDetails = ((br.readLine()).split(","));
			 currentAcount.setAccName(accountDetails[0]);
			 currentAcount.setAccNo(accountDetails[1]);
			 currentAcount.setBankName(accountDetails[2]);
			 currentAcount.setTinNumber(accountDetails[3]);		
			 currentAcount.display();
		 }
		 else {
			 SavingAccount savingAcnt = new SavingAccount();
			 String[] accountDetails = ((br.readLine()).split(","));
			 savingAcnt.setAccName(accountDetails[0]);
			 savingAcnt.setAccNo(accountDetails[1]);
			 savingAcnt.setBankName(accountDetails[2]);
			 savingAcnt.setOrgName(accountDetails[3]);	
			 savingAcnt.display();
		 }
		 
		 //to display
		 
	}	  

}
