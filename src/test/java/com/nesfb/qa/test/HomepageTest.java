
//author : Bishal

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
	public Loginpage ln;
	
	public Homepage home;
	
	
	
	@BeforeMethod
	public void setup() throws IOException {
	
	     initialisation();  
	     
	     ln =new Loginpage();
	     
	     ln.login(prop.getProperty("username"));
	     
	     ln.loginwithpw(prop.getProperty("password"));
	
}
	@Test
	public void banklogotest() throws InterruptedException
	
	{
		home = new Homepage();
		
		Thread.sleep(2000);
		
		boolean flag = home.Banksymbol();
		
		Assert.assertTrue(flag);
		
	}
	@AfterMethod
	public void teardown()
	
	{
	
		driver.quit();
		
	}
	}


	
	