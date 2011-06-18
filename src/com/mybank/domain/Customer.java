/**
 * 
 */
package com.mybank.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String firstName;
	private String lastName;
	private List<Account> accounts;
	
	public Customer(String f, String l)
	{
		firstName = f;
		lastName = l;
		//initialize accounts instance variable
		accounts = new ArrayList<Account>(10);
		
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public Account getAccount(int account_index)
	{
		return accounts.get(account_index);
	}
	
	public void addAccount(Account acc)
	{
		accounts.add(acc);
	}
	
	public int getNumOfAccounts()
	{
		return accounts.size();
	}
}
