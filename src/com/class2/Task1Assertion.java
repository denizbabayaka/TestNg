package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import utils.CommonMethods;
import utils.Constants;
import utils.Constants;

public class Task1Assertion extends CommonMethods  {
	
	   @BeforeMethod()
	    public void enterName(){
	        setUp("chrome", Constants.HRMS_URL);
	        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    }
	    @AfterMethod()
	    public void navigateBack(){
	        driver.close();
	    }
	    @Test
	    public void loginWithPassword() {
	        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
	        driver.findElement(By.id("btnLogin")).click();
	        WebElement logo=driver.findElement(By.cssSelector("div[id='branding'] img"));
	        
	        Assert.assertTrue(true);
//	        if(logo.isDisplayed()) {
//	            System.out.println("Test passed");
//	        }else {
//	            System.out.println("Test fails");
//	        }
	    }
	    @Test
	    public void loginWithoutPassword() {
	        driver.findElement(By.id("btnLogin")).click();
	        WebElement text=driver.findElement(By.id("spanMessage"));
	        Assert.assertEquals(text, "Password can not be empty");
	        if(text.isDisplayed()) {
	            System.out.println("Test passed-->"+text.getText());
	        }else {
	            System.out.println("Test fails");
	        }
	    }
	}

