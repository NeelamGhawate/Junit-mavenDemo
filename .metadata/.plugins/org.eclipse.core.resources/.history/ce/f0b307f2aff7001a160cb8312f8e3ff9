package com.mockito.example.Mockito_Example;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.reset;
import static org.mockito.BDDMockito.*;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTesterA10 {
	
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
	   
		/*
		 * Sometimes we want to mock the behavior for any argument of the given type, in
		 * that case, we can use Mockito argument matchers. Mockito argument methods are
		 * defined in org.mockito.ArgumentMatchers class as static methods.
		 */
	   
	   when(calcService.add(anyDouble(),anyDouble())).thenReturn(30.00);
	   Assert.assertEquals(mathApplication.add(20.0, 10.0),30.0,0);
	   
   }
   
   @Test
   public void testAdd2(){
	   
		/*
		 *If we want to use a specific value for an argument, then we can use eq() method.
		 */
	   
	   when(calcService.add(eq(10.0),anyDouble())).thenReturn(30.00);
	   Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
       
   }
}