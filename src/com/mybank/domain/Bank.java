package com.mybank.domain;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private static List<Customer> customers;
	
	static
	{
		customers = new ArrayList<Customer>(10);
	}
	private Bank()
	{
		//this constructor should never be called
	}
	
	public static void addCustomer(String f, String l)
	{
		 customers.add(new Customer(f,l));
	}
	
	public static int getNumOfCustomers()
	{
		return customers.size();
	}
	
	public static Customer getCustomer(int customer_index)
	{
		return customers.get(customer_index);
	}
	
}
