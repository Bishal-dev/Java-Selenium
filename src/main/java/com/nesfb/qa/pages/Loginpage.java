package com.nesfb.qa.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nesfb.qa.base.TestBase;

public class Loginpage extends TestBase {

	public Loginpage() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@FindBy(name="username")
	
	WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Enter Password']")
			
     WebElement password;
	
		
	@FindBy(xpath="//button[@type='submit']")
	
	WebElement submitbtn1;
	
    @FindBy(xpath="(//span[@class='ng-scope'])[1]")
	
	WebElement submitbtn2;
    
    @FindBy(xpath="//span[contains(text(),'Transfers')]")
	
	WebElement Transfer;
    
    
    public void login(String un) {
    	
    	username.sendKeys(un);
    	
      	submitbtn1.click();
        }

    	
    public Homepage loginwithpw(String pwd) {
	   
	   password.sendKeys(pwd);
	   
	  js.executeScript("arguments[0].click();", submitbtn2);	   
	   
	  return new Homepage();
    }
   		
	public void OwnAccount() {
			
		js.executeScript("arguments[0].click();", Transfer);
			
	  
	  
    }
   
   
   
   
    
    
}










