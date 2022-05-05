package com.BaseLayer;

import java.io.FileInputStream;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
public static Properties prop;
	
public BaseClass(){
	

		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Pramod\\eclipse-workspace\\OrangeHRMHybrid\\src\\main\\java\\com\\ConfigLayer\\config.properties");
			prop.load(fis);
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
}
		public static void initialisation()
		{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver101\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));

	}

}
