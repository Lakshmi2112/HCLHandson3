package com.hcl2;

public class Account {
	protected String accountNumber;
	protected Double balance;
	protected String accountHolderName;
	public Account(String accountNumber, Double balance, String accountHolderName) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
	}
	public Account() {
		
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public FixedAccount getAccountDetails(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}