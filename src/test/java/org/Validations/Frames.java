package org.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	
	public static void main(String[] args) {
		
		String frame = "https://chercher.tech/practice/frames-example-selenium-webdriver";
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(frame);
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		element.sendKeys("Suriya");
		
		driver.switchTo().frame("frame3");
		WebElement element1 = driver.findElement(By.xpath("//input[@id=\'a\']"));
		element1.click();
	
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"animals\"]"));
		Select dropdown = new Select(element2);
		dropdown.selectByIndex(3);
		
		
		
	}

}
