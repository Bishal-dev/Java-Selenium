
//author: Bishal


package com.nesfb.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.nesfb.qa.util.Testutil;
import com.nesfb.qa.util.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	 public static void initialisation() throws IOException  {
		
		prop = new Properties();
		EventFiringWebDriver e_driver;
		WebEventListener eventListener;
				
	    FileInputStream Fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\NESFBTest\\src\\main\\java\\com\\nesfb\\qa\\config\\config.properties");
	    
	     prop.load(Fis);
		    
		String browserName = prop.getProperty("browser");
	  	  
	  if(browserName.equals("chrome"))
	  {
	
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\geckodriver\\Chromedriver.exe");
		 driver = new ChromeDriver(); 
		
	  }
	  
	  else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\eclipse\\SeleniumServer\\geckodriver");	
			driver = new FirefoxDriver(); 
		}
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
	  
		
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	  
	  driver.get(prop.getProperty("url"));
	  
	  } 
	  
	 }

	  	  
	 
	
		
		
	

