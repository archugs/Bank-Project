/**
 * 
 */
package com.mybank.batch;

import com.mybank.domain.Bank;
import com.mybank.domain.SavingsAccount;


public class AccumulateSavingsBatch {

	private Bank bank;
	
	public void doBatch()
	{
		for(int i = 0; i < bank.getNumOfCustomers(); i ++)
		{
			for(int j = 0; j < bank.getCustomer(i).getNumOfAccounts(); j ++)
			{
				if(bank.getCustomer(i).getAccount(j) instanceof SavingsAccount)
				{
					System.out.println("savings");
				}
			}
		}
	}
	
	public void setBank(Bank bank)
	{
		this.bank = bank;
	}
}
