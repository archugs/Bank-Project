/**
 * 
 */
package com.mybank.report;

import com.mybank.domain.Account;
import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;

public class CustomerReport {

	private Bank bank;
	
	public void generateReport()
	{
		String account_type = "";
		
		for(int cust_idx = 0; cust_idx < Bank.getNumOfCustomers(); cust_idx ++)
		{
			Customer customer = Bank.getCustomer(cust_idx);
			System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
			
			for(int no_of_acc = 0; no_of_acc < customer.getNumOfAccounts(); no_of_acc ++)
			{
				Account account = customer.getAccount(no_of_acc);
				
				if(account instanceof SavingsAccount)
				{
					account_type = "Savings Account";
				}
				
				else if(account instanceof CheckingAccount)
				{
					account_type = "Checking Account";
				}
				
				else
				{
					account_type = "Unknown Account type";
				}
				
				System.out.println(" " + account_type + ": current balance is " + account.getBalance());
			}
		}
	}
		
	
	public void setBank(Bank bank)
	{
		this.bank = bank;
	}
}
