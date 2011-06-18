/**
 * 
 */
package com.mybank.data;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;


public class DataSource {

	private File dataFile;
	
	public DataSource(String dataFilePath)
	{
		dataFile = new File(dataFilePath);
	}
	
	
	public void loadData() throws IOException
	{
		//Data Source variables
		Scanner input = new Scanner(dataFile);
		
		//Domain variables
		Customer customer;
		int numOfCustomers = input.nextInt();
		
		for(int idx = 0; idx < numOfCustomers; idx ++)
		{
			//Create customer object
			String firstName = input.next();
			String lastName = input.next();
			Bank.addCustomer(firstName, lastName);
			customer = Bank.getCustomer(idx);
			
			//Create customer accounts
			int numOfAccounts = input.nextInt();
			while(numOfAccounts-- > 0)
			{
				//Create a specific type of account
				char accountType = input.next().charAt(0);
				
				switch(accountType)
				{
				//Savings account
				case 'S':
				{
					float initBalance = input.nextFloat();
					float interestRate = input.nextFloat();
					customer.addAccount(new SavingsAccount(initBalance, interestRate));
					break;
				}
				
				//Checking account
				case 'C':
				{
					float initBalance = input.nextFloat();
					float overdraftProtection = input.nextFloat();
					customer.addAccount(new CheckingAccount(initBalance, overdraftProtection));
					break;
				}
				
			   }//END of switch
			}//END of create accounts loop
		}//END of create customers loop
	}
}
