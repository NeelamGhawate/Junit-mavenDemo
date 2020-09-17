package com.ngtech.AbstractFactPattern;

public class HotDrinksFactory implements DrinkFactory
{
	
	

	public  Drinks getDrink(String ch) {
		// TODO Auto-generated method stub
		 if (ch.equalsIgnoreCase("tea"))
			{
				return new Tea();
			}
			else
			{
				return new Coffee();
			}
	}
}