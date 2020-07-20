package com.nesfb.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nesfb.qa.base.TestBase;

public class Ownaccounttransfer extends TestBase{

		    
		public Ownaccounttransfer() throws IOException {
			
			PageFactory.initElements(driver, this);
			
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
			
		@FindBy(xpath="//span[contains(text(),'Transfers')]")
		
		WebElement Transfer;
		
		@FindBy(xpath = "//a[text()='Own Account']")
		
	     WebElement OwnAccount;
		
		@FindBy(xpath = "//select[@name='fromAccount']")
		
		 WebElement FromAccount;
		
		@FindBy(xpath = "//input[@name='amount']")
		
		 WebElement Amount;
		
		@FindBy(xpath = "//input[@placeholder='Enter Narration']")
		
		 WebElement Narration;
		
		@FindBy(xpath = "//button[text()='Submit']")
		
		 WebElement Submitbtn;
	
		public void AccountTransfer() {
			
	     js.executeScript("arguments[0].click();", Transfer);
			  
		}
		
		public void OwnAccountTransfer() {
			
		 js.executeScript("arguments[0].click();", OwnAccount);
			
		}
		
		public void FromAccountfield() {
			
		Select select = new Select(FromAccount);
			
		select.selectByVisibleText("50180000000326 - NESFB - SB Regular");
			
		}
		
		public void Amountfield() {
			
		Amount.sendKeys("1000");
			
		}
		
		public void Narrationfield() {
		
		Narration.sendKeys("Automation");	
			
		}
		
		public void SubmitBtn() {
			
			Submitbtn.click();
		}
		
}
	

