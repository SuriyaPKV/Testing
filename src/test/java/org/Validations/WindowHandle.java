package org.Validations;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandle {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Samsung Mobiles", Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		List<String> child1 = new ArrayList<>(child);
		driver.switchTo().window(child1.get(3));
//		
//		for(String x: child) {
//			if(parent.equals(x));
//			driver.switchTo().window(x);
			
		WebElement element = driver.findElement(By.xpath("//span[@class'B NuCI']"));
		element.getText();
		System.out.println(element);
			
			
		
	}

}
