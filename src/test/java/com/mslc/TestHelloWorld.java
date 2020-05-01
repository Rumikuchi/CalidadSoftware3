package com.mslc;
 
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld {

	private HelloWorld h;
	
	   @Before
	   public void setUp() throws Exception 
	   {
	      h = new HelloWorld();
	   }

	   @Test
	   public void testHelloEmpty() 
	   {
	      assertEquals("",h.getName());
	      assertEquals("Hello!",h.getMessage());
	   }
		
	   @Test
	   public void testHelloWorld() 
	   {
	      h.setName("World");
	      assertEquals("World",h.getName());
	      assertEquals("Hello World!",h.getMessage());
	   }
}
