package org.Validations;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static void main(String[] args) throws Throwable {
		
		String fb = "https://www.facebook.com/";
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(fb);
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("email"));
		
		Actions a = new Actions(driver);
		a.click(element).perform();
		a.sendKeys(element, "Suriya2121").perform();
		a.doubleClick().perform();
		a.contextClick().perform();
		
		Robot r = new Robot();
		
		for(int i = 0; i<2; i++) {
			r.keyPress(KeyEvent. VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
	      
	      r.keyPress(KeyEvent.VK_TAB);
	      r.keyRelease(KeyEvent.VK_TAB);
	      
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	      
	      TakesScreenshot scr = (TakesScreenshot)driver;
	      File source = scr.getScreenshotAs(OutputType.FILE);
	      File fi = new File("C:\\Users\\user\\eclipse-workspace\\New\\target\\Takes");
	      FileUtils.copyFile(source, fi);    	
		
	}

}
