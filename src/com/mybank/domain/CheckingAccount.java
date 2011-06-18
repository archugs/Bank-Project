/**
 * 
 */
package com.mybank.domain;


public class CheckingAccount extends Account {

	private double overdraftAmount;
	
	public CheckingAccount(double initBalance, double overdraftAmount)
	{
		super(initBalance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public CheckingAccount(double initBalance)
	{
		this(initBalance, 0.0);
	}
	
	public void withdraw(double amount) throws OverdraftException
	{
		if(balance < amount)
		{
			double overdraftNeeded = amount - balance;
			if(overdraftAmount < overdraftNeeded)
			{
				throw new OverdraftException("Insufficient funds for overdraft protection", overdraftNeeded);
			}
			
			else
			{
				balance = 0;
				overdraftAmount -= overdraftNeeded;
			}
		}
		else
		{
			balance -= amount;
		}
	
	
	}
}
