package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.CommonMethods;
import utils.Constants;

public class Task2 extends CommonMethods {

	@BeforeMethod()
	public void enterName() {
		setUp("chrome", Constants.HRMS_URL);

	}

	@AfterMethod()
	public void navigateBack() {
		driver.close();
	}

	@Test
	public void loginWithPassword() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		// navigate to add employee
		driver.findElement(By.linkText("PIM")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add Employee")));
		driver.findElement(By.linkText("Add Employee"));
		
		//verify labels
		boolean fullName=driver.findElement(By.xpath("//label[@class='hasTopFieldHelp']")).isDisplayed();
		boolean eID=driver.findElement(By.xpath("//label[@for='employeeId']")).isDisplayed();
		boolean photo=driver.findElement(By.xpath("//label[@for='photofile']")).isDisplayed();
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertTrue(fullName,"Full name label was not displayed");
		softAssert.assertTrue(eID,"Employee eid was not displayed");
		softAssert.assertTrue(photo,"Photo was not displayed");
		
		//add first and last name ,upload picture
		driver.findElement(By.id("firstName")).sendKeys("Den");
		driver.findElement(By.id("lastName")).sendKeys("baba");
		driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\deniz\\Pictures\\Saved Pictures\\20180709_164954[514].jpg");
		driver.findElement(By.id("btnSave")).click();
		
		//verify if user added sucesfully
		boolean verification=driver.findElement(By.xpath("//h1[text()='Personal Details']")).isDisplayed();
		softAssert.assertTrue(verification,"Employee was not added");
		softAssert.assertAll();
		
		
		
		

		
		
		

	}
}
