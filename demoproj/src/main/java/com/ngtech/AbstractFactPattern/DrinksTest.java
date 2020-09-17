package com.ngtech.AbstractFactPattern;

public class DrinksTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrinkAbstarctFactory daf=new DrinkAbstarctFactory();
		
		DrinkFactory coldf=daf.getDrinksFactory("coldFact");
		Drinks d1=coldf.getDrink("pepsi");
 		
		DrinkFactory hotf=daf.getDrinksFactory("hotFact");
		Drinks d2=hotf.getDrink("tea");
 		
	
		d1.drink();
		d2.drink();

	}

}
