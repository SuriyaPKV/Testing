package org.Validations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		List<WebElement> iTable = driver.findElements(By.tagName("table"));
		for(int i=0; i<iTable.size(); i++) {
			WebElement table = iTable.get(i);
			WebElement tbody = table.findElement(By.tagName("tbody"));
			
			List<WebElement> iRow = tbody.findElements(By.tagName("tr"));
			for(int j=0; j<iRow.size(); j++) {
				WebElement Row = iRow.get(j);
				
				List<WebElement> iData = Row.findElements(By.tagName("td"));
				for(int k=0; k<iData.size(); k++) {
					WebElement Data = iData.get(k);
					
					String text = Data.getText();	
					System.out.println(text);	

					
					
					
				}
			}
			
		
			
			
			
		}
	}

}
