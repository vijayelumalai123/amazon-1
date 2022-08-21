package com.amazon.project.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCart {
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\OneDrive\\Pictures\\vj\\amazon\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input [contains(@type,'text')]")).sendKeys("dell laptop vostro");
		WebElement Productsearch = driver.findElement(By.xpath("//input[@type='submit']"));
		Productsearch.click();
	//	WebElement click=driver.findElement(By.linkText("HP 15s, 11th Gen Intel Core i3, 8GB RAM/512GB SSD 15.6inch(39.6cm) FHD, Micro-Edge, Anti-Glare Display/Alexa Built-in/Windows 11 Home/UHD Graphics/Dual Speakers/ Ms Office, 15s- Fq2627TU"));
	//click.click();
//	Thread.sleep(2000);
//		WebElement scroll=driver.findElement(By.linkText("(//span[text()='41,190'])[2]"));	
//		Thread.sleep(2000);
//	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",scroll);
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
		//scroll.click();
		
		WebElement scrolls = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[21]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",scrolls);
		WebElement click=driver.findElement(By.linkText("HP 15s, 11th Gen Intel Core i3, 8GB RAM/512GB SSD 15.6inch(39.6cm) FHD, Micro-Edge, Anti-Glare Display/Alexa Built-in/Windows 11 Home/UHD Graphics/Dual Speakers/ Ms Office, 15s- Fq2627TU"));
		click.click();
Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
	}
}
