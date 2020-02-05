package com.class2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;
import utils.Constants;

public class HW2 extends CommonMethods {
	
	@BeforeMethod
	public void openBrowser() {
		setUp("chrome", Constants.HRMS_URL);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test(priority=1)
	public void negativeTest() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("");
		driver.findElement(By.id("btnLogin")).click();
		boolean errorMsg=driver.findElement(By.id("spanMessage")).isDisplayed();
		String actualmsg=driver.findElement(By.id("spanMessage")).getText();
		String expectedmsg="Password cannot be empty";
		Assert.assertTrue(errorMsg,"Error message is displayed");
		Assert.assertEquals(actualmsg, expectedmsg,"correct error message is displayed");
	}

}
