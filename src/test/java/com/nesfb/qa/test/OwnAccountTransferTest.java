package com.nesfb.qa.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nesfb.qa.base.TestBase;
import com.nesfb.qa.pages.Loginpage;
import com.nesfb.qa.pages.Ownaccounttransfer;

public class OwnAccountTransferTest extends TestBase{
	
	    Ownaccounttransfer acc;
	    Loginpage login;
		
		public OwnAccountTransferTest() {
		
		super();
		
		}
		@Test(priority = 1)
		public void setup() throws IOException{
			
			initialisation();
		
		acc  = new Ownaccounttransfer();
		
		login = new Loginpage();
		
		login.login(prop.getProperty("username"));
		
		login.loginwithpw(prop.getProperty("password"));
			
		}
		@Test(priority = 2)
		public void AccountTest() throws InterruptedException {
	    
		Thread.sleep(3000);	
			
	    acc.AccountTransfer();
		
		}
		
		@Test(priority = 3)
		public void OwnAccountTest() throws InterruptedException
		{
						
			acc.OwnAccountTransfer();
			Thread.sleep(5000);
		}
		
		@Test(priority = 4)
		public void FromAccountfieldTest() {
		
			acc.FromAccountfield();
			
		}
		
		@Test(priority = 5)
		public void AmountfieldTest() {
			
			acc.Amountfield();
		}
		
		@Test(priority = 6)
		public void NarrationfieldTest() {
			
			acc.Narrationfield();
		}
		
		@Test(priority = 7)
		public void submitbtnTest() {
			
			acc.SubmitBtn();
				
		}
		   
	}
		



