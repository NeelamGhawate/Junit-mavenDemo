package com.mockito.example.Mockito_Example;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;




import org.mockito.InOrder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester7 {
	
	private MathApplication mathApplication;
	   private CalculatorService calcService;

	   @Before
	   public void setUp(){
	      mathApplication = new MathApplication();
	      calcService = mock(CalculatorService.class);
	      mathApplication.setCalculatorService(calcService);
	   }

	   @Test
	   public void testAdd(){

	      //add the behavior to add numbers
	      when(calcService.add(20.0,10.0)).thenAnswer(new Answer<Double>() {
	         
	         public Double answer(InvocationOnMock invocation) throws Throwable {
	            //get the arguments passed to mock
	            Object[] args = invocation.getArguments();
				
	            //get the mock 
	            Object mock = invocation.getMock();	
				
	            //return the result
	            return 30.0;
	         }
	      });

	      //test the add functionality
	      Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);
	   }
}