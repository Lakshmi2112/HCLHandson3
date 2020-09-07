package com.hcl2;

public class FixedAccount extends Account {
protected double lockingPeriod;
public FixedAccount() {
	
}

public FixedAccount(String accountNumber, Double balance, String accountHolderName, int lockingPeriod) {
	super(accountNumber, balance, accountHolderName);
	this.lockingPeriod = lockingPeriod;
}

public double getLockingPeriod() {
	return lockingPeriod;
}

public void setLockingPeriod(double d) {
	this.lockingPeriod = d;
}

public Object getMinimumBalance() {
	// TODO Auto-generated method stub
	return null;
}

public void setminimumBalance(double parseDouble) {
	// TODO Auto-generated method stub
	
}

}

