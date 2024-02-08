package org.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropdown {
	
	public static void main(String[] args) throws Throwable {
		
		String dad = "https://demo.guru99.com/test/drag_drop.html";
		WebDriver driver = new EdgeDriver();
		driver.get(dad);
		driver.manage().window().maximize();
		WebElement drag = driver.findElement (By.xpath("//a[contains(text(),'SALES')]"));
		WebElement drop = driver.findElement(By.xpath("(//li[@ class='placeholder'])[3]"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
	}


}
