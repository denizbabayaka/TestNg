package com.class1;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;
import utils.Constants;

public class TitleLogoAndLoginVerification extends CommonMethods {
	// This method will get execute before @Test and browser will open
	 @BeforeMethod(alwaysRun=true)
	//@BeforeClass
	public void openAndNavigate() {
		setUp("chrome", Constants.HRMS_URL);
	}

	@Test(priority = 1,groups= {"smoke","login"})
	public void validLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test(priority = 3,groups= {"regression","sprint1"})
	public void titleValidation() {
		String expectedTitle = "Human Management System";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fails");
		}
	}

	@Test(priority = 2)
	public void logovalidation() {
		boolean isDisplayed = driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
		if (isDisplayed) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
	}

	 @AfterMethod(alwaysRun=true)
	//@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
