package com.mockito.example.Mockito_Example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
	  
	   
	   //adding behaviour
	   Result result = JUnitCore.runClasses(MathApplicationTester0.class); 
      
	   //verifying behaviour
	   //Result result = JUnitCore.runClasses(MathApplicationTester1.class);
	   
	   //Expecting Calls
	   //Result result = JUnitCore.runClasses(MathApplicationTester2.class);
	   
	   //Varying Calls
	   //Result result = JUnitCore.runClasses(MathApplicationTester3.class);
	   
	   //Exception Handling
	   //Result result = JUnitCore.runClasses(MathApplicationTester4.class);
	   
	   //Mock Method
	   //Result result = JUnitCore.runClasses(MathApplicationTester5.class);
	   
	   //Inorder - Ordered verification
	   //Result result = JUnitCore.runClasses(MathApplicationTester6.class);
	   
	   //Answer Interface
	   //Result result = JUnitCore.runClasses(MathApplicationTester7.class);
	   
	   //Spy Interface
	   //Result result = JUnitCore.runClasses(MathApplicationTester8.class);
	   
	   //Resetting Mock
	   //Result result = JUnitCore.runClasses(MathApplicationTester9.class);
	   
	   //BDD - Given When then
	   //Result result = JUnitCore.runClasses(MathApplicationTesterA10.class);
	   	       
	   
      
	   for (Failure failure : result.getFailures()) {
		   System.out.println(failure.toString());
	   }
      
	   System.out.println(result.wasSuccessful());
   }
}  