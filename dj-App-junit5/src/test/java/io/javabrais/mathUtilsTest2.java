package io.javabrais;

import static org.junit.Assert.*;

import org.junit.Test;

public class mathUtilsTest2 {

	@Test
	public final void test() {
		mathUtils m=new mathUtils();
		long result=m.sum(15,50);
	   assertEquals(65,result);
		System.out.println("This testcase run"+result);
	}

}
