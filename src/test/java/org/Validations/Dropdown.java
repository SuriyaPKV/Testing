package org.Validations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	
	public static void main(String[] args) throws Throwable {
		
		String dropdown = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(dropdown);
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//select[@id='first']"));
		
		Select s = new Select(element);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("Yahoo");
		Thread.sleep(4000);
		s.selectByValue("Apple");
		
		WebElement element1 = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s1 = new Select(element1);
		s1.selectByValue("cat");
		Thread.sleep(5000);
		s1.selectByValue("avatar");
		
		WebElement element2 = driver.findElement(By.xpath("//select[@id='second']"));
		
		Select s2 = new Select(element2);
		s2.selectByIndex(1);
		s2.selectByIndex(2);
		s2.selectByIndex(3);
		s2.deselectByIndex(2);
		
		List<WebElement> allSelect = s2.getAllSelectedOptions();
		
		for (int i=0; i<allSelect.size(); i++) {

			WebElement webElement = allSelect.get(i);
			String text = webElement.getText();
			System.out.println(text);
	}
			
		WebElement s3 = s2.getFirstSelectedOption();
			String text1=s3.getText();
			System.out.println(text1);
			
			
			
			
		}
		
		
		
		
		
		
	}


