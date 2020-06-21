
//author: Bishal


package com.nesfb.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nesfb.qa.util.Util;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	 public static void initialisation() throws IOException  {
		
		prop = new Properties();
				
	    FileInputStream Fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\NESFBTest\\src\\main\\java\\com\\nesfb\\qa\\config\\config.properties");
	    
	     prop.load(Fis);
		    
		String browserName = prop.getProperty("browser");
	  	  
	  if(browserName.equals("chrome"))
	  {
	
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\geckodriver\\Chromedriver.exe");
		 driver = new ChromeDriver(); 
		
	  }
	  
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(Util.page_load_timeout,TimeUnit.SECONDS);
	  
	  driver.get(prop.getProperty("url"));
	  
	  } 
	  
	 }

	  	  
	 
	
		
		
	

