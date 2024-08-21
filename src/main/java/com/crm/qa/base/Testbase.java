package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.Testutil;
import com.crm.qa.util.WebEventListener;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	// Constructor to load properties file
	public Testbase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\hinai\\New workspace\\freeCRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
			
			// Manually set properties if not using a file
			prop.setProperty("url", "https://ui.cogmento.com/");
			prop.setProperty("username", "hinainamdar678@gmail.com");
			prop.setProperty("password", "Arsalan@786");
			prop.setProperty("browser", "chrome");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Method to initialize WebDriver and browser settings
	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		
		
		
		// Additional check to ensure driver is initialized
		if (driver != null) {
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		} else {
			throw new RuntimeException("Driver not initialized. Check browser setup.");
		}
	}
}
