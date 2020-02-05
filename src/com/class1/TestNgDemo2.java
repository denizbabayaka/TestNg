package com.class1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Task 1: Executing different test based TestNG annotations

//Create class that will have:
//Before and After Class annotation
//Before and After Method annotation
//2 methods with Test annotation

public class TestNgDemo2 {
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before class");
	}
     	
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}
	@Test
	public void ActualTest() {
		System.out.println("I am actual Test");
	}
}
