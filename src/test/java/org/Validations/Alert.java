package org.Validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Duplication;

public class Alert {
	
	
	public static void main(String[] args)throws Throwable {
		
		String Alert = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
		String site = "https://www.facebook.com/";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(site);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		driver.manage().window().maximize();
		driver.findElement(By.name("emai")).sendKeys("Selenium");;
		
		
		
	}

}
  