package com.class1;

import org.testng.annotations.Test;

public class TestNGDemo {

	@Test // Main Annotations
	public void testOne() {
		System.out.println("Hello");
	}
    
	
	// for the execution of this method we have to add @Test annotations
	@Test
	public void testTwo() {
		System.out.println("Hello from test 2");
	}

	@Test
	public void testThree() {
		System.out.println("Hello from test 3");
	}

}
