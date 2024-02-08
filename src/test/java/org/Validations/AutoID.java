package org.Validations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoID {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("‪‪‪‪‪‪C:\\Users\\user\\Documents\\AutoIt2.exe");
		
	}

}
