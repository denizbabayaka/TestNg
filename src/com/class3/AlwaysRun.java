package com.class3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlwaysRun {
	
	@BeforeSuite(alwaysRun=true)
	public void beforeSuite() {
		System.out.println("I am before suite");
	}
	@BeforeTest(alwaysRun=true)
	public void beforeTest() {
		System.out.println("I am before Test");
	}
	
	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		System.out.println("I am before class");
	}
	
	
     // this method will run on top of every test
	@BeforeMethod(alwaysRun=true)
	public void beforemethod() {
		System.out.println("I am before method");
	}
      
	@AfterMethod(alwaysRun=true)
	public void aftermethod() {
		System.out.println("I am after method");
	}
	
	@AfterClass(alwaysRun=true)
	public void afterclass() {
		System.out.println("I am after class");
	}
	@AfterTest(alwaysRun=true)
	public void aftertest() {
		System.out.println("I am after test");
	}
	@AfterSuite(alwaysRun=true)
	public void aftersuite() {
		System.out.println("I am after suite");
	}
	
	@Test
	public void testMethod() {
		System.out.println("I am test");
	}
	@Test
	public void testMethod1() {
		System.out.println("I am test1");
	}
	
}
