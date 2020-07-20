package com.nesfb.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nesfb.qa.base.TestBase;
import com.nesfb.qa.pages.Homepage;
import com.nesfb.qa.pages.Loginpage;

public class HomepageTest extends TestBase{
	
	Homepage homepage;
	Loginpage login;
	
	public HomepageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		
		initialisation();
		
	 homepage = new Homepage();	
	 login = new Loginpage();
	 
	 login.login(prop.getProperty("username"));
	 login.loginwithpw(prop.getProperty("password"));
	 		
	}
	
	@Test(priority = 2)
	public void VerifyTitleTest() throws InterruptedException {
		
		Thread.sleep(5000);
		
		String Title = homepage.verifytitle();
		
	Assert.assertEquals(Title, "NESFB","Home page title not matched");	
	}
	
	/*@Test(priority = 3)
	public void validateuser() {
	Assert.assertTrue(homepage.Accountuser());
		
	}*/
	
	@AfterMethod
    public void teardown() throws InterruptedException

    {
		driver.quit();	
    }
}
	

