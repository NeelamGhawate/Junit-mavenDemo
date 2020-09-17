package com.ngtech.SingletonPattern;

public class MySingleton 
{
	//private static MySingleton obj=nul;
   private static MySingleton obj=new  MySingleton();
   
   private MySingleton()
   {}
   
	public static MySingleton getInstance()
	{
		/*
		 * if(obj==null) { obj=new MySingleton(); }
		 */

		return obj;
	}
	
}
