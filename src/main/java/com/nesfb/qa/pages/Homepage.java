package com.nesfb.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nesfb.qa.base.TestBase;

public class Homepage extends TestBase{
		
	public Homepage() {
		
		PageFactory.initElements(driver,this);
	}

	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@FindBy(xpath="//strong[contains(text(),'Mr. RANJAN SINGH')]")
	
	WebElement user;
	
	
	public boolean Accountuser() {
		
	return user.isDisplayed();
	}
	
	public String verifytitle() {
				
		return driver.getTitle();
	} 
			
	}
	
	
	
