package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public  static WebDriver driver;
	
	
@BeforeClass
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(option);
		
		
		
		
	}
	
	@AfterClass
	public void tearDown() {
		
	//driver.quit();	
	}
	
	
	
}
