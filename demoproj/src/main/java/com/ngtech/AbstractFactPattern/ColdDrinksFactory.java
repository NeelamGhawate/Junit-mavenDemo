package com.ngtech.AbstractFactPattern;

public class ColdDrinksFactory implements DrinkFactory
{
	
	
	public Drinks getDrink(String ch) {
		
		 if (ch.equalsIgnoreCase("coke"))
			{
				return new Coke();
			}
			else
			{
				return new Pepsi();
			}
	}
}