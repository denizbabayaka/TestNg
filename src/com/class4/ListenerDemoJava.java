package com.class4;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class ListenerDemoJava extends CommonMethods{

	
	//@Test(groups="regression")
	public void test1() {
		System.out.println("I am test 1");
		Assert.assertTrue(true);
	}
	
	//@Test(groups="regression")
	public void test2() {
		System.out.println("I am test 2");
	}
	
	//@Test(groups="regression")
	public void test3() {
		System.out.println("I am test 3");
		Assert.assertTrue(true);
	}
	

}
