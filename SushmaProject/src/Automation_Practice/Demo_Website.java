package Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Website {

	public static void main(String[] args) {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/links");
	    driver.manage().window().maximize();

	}

}
