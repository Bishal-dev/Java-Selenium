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
	
	@FindBy(xpath="//button[contains(@class,'show-signout')]")
	
	WebElement Logo;
	
	
	public boolean Banksymbol() {
		
	return Logo.isDisplayed();
		

		
	}
	
	
	
}
