package com.nesfb.qa.test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.nesfb.qa.base.TestBase;
import com.nesfb.qa.pages.Loginpage;
import com.nesfb.qa.pages.Ownaccounttransfer;

public class OwnAccountTransferTest extends TestBase{
	
	
	 public static Logger log =LogManager.getLogger(TestBase.class.getName());

	
	    Ownaccounttransfer acc;
	    Loginpage login;
		
		public OwnAccountTransferTest() {
		
		super();
		
		}
		@Test(priority = 1)
		public void setup() throws IOException{
			
			initialisation();
			log.info("driver is initialized");
		
		acc  = new Ownaccounttransfer();
		
		login = new Loginpage();
		
		login.login(prop.getProperty("username"));
		
		login.loginwithpw(prop.getProperty("password"));
		
		log.info("successfully logged in");
			
		}
		@Test(priority = 2)
		public void AccountTest() throws InterruptedException {
	    
		Thread.sleep(3000);	
			
	    acc.AccountTransfer();
	    log.info("clicked on transfer page");
		
		}
		
		@Test(priority = 3)
		public void OwnAccountTest() throws InterruptedException
		{
						
			acc.OwnAccountTransfer();
			Thread.sleep(5000);
			log.info("clicked on Own Account Transfer");
		}
		
		@Test(priority = 4)
		public void FromAccountfieldTest() {
		
			acc.FromAccountfield();
			log.info("selected the from account");
			
			log.warn("To Account field left blank");
			
		}
		
		@Test(priority = 5)
		public void AmountfieldTest() {
			
			acc.Amountfield();
			log.info("input the amount");
			
		}
		
		@Test(priority = 6)
		public void NarrationfieldTest() {
			
			acc.Narrationfield();
			log.info("input the narration");
		}
		
		@Test(priority = 7)
		public void submitbtnTest() {
			
			acc.SubmitBtn();
			log.info("clicked on submit button");
			log.warn("display the error msg");
		}
		   
	}
		



