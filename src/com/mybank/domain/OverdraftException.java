/**
 * 
 */
package com.mybank.domain;

public class OverdraftException extends Exception {

	private double deficit;
	
	public OverdraftException(String msg, double deficit)
	{
		super(msg);
		this.deficit = deficit;
	}
	
	public double getDeficit()
	{
		return deficit;
	}
}
