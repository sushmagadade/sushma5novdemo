package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_4 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
        Thread.sleep(3000);
        
        driver.close();
		
		
		
		
		
		
		
	}

}
