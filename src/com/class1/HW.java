package com.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;
import utils.Constants;

//  TC 1: HRMS Application Login: 
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Enter valid username and password
//Click on login button
//Then verify Syntax Logo is displayed
//Close the browser
//
//TC 2: HRMS Application Negative Login: 
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Enter valid username
//Leave password field empty
//Verify error message with text “Password cannot be empty” is displayed.

public class HW extends CommonMethods {

	@BeforeMethod
	public void openBrowser() {
		setUp("chrome", Constants.HRMS_URL);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test(priority = 2, dependsOnMethods = { "validationOfmessage" }, enabled = true)
	public void verifyLogo() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		boolean isDisplayed = driver.findElement(By.xpath("//img[contains(@src,'syntax.png')]")).isDisplayed();
		Assert.assertTrue(isDisplayed, "Syntax logo is displayed");
		takeScreenshot("homeWork");
//	if(isDisplayed) {
//		System.out.println("Test Pass");
//	}else {
//		System.out.println("Test Fail");
//	}

	}

	@Test(priority = 1)
	public void validationOfmessage() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("");
		driver.findElement(By.id("btnLogin")).click();
		WebElement error = driver.findElement(By.id("spanMessage"));
		String expectedmessage = error.getText();

		String actualmessage = "Password cannot be empty";
		Assert.assertEquals(actualmessage, expectedmessage, "Message is matched");
//		if(error.isDisplayed()) {
//			System.out.println("error is displayed");
//			if(error.getText().equals(expectedmessage)) {
//				System.out.println("Errror message is correct.Test pass");
//			}else {
//				System.out.println("error message is not correct .Test Fail");
//			}
//		}else {
//			System.out.println("Error message is not displayed");
//		}

	}

}
