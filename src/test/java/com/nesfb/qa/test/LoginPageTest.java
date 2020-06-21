package com.nesfb.qa.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nesfb.qa.base.TestBase;
import com.nesfb.qa.pages.Loginpage;

public class LoginPageTest extends TestBase {
	
	public Loginpage ln;
	
	public LoginPageTest() throws IOException {
		
		super();
	}
	
	@Test(priority = 1)
	public void setup() throws IOException{
		
		initialisation();
		 ln =new Loginpage();
	
	}
		
	
	@Test(priority = 3)
	public void Loginwithpw()
	
	{
		
		ln.loginwithpw(prop.getProperty("password"));
	
	}
	
	@Test(priority = 2)
	public void LoginTest()
	
	{
		
		ln.login(prop.getProperty("username"));
	}
		
 
	
	@Test(priority = 4)
    public void teardown() throws InterruptedException

    {
		Thread.sleep(200);
         driver.quit();	
    }
}

