package ClassP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nevigate {

	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver = new ChromeDriver();
	   driver.navigate().to("https://www.flipkart.com/");
	   Thread.sleep(2000);
	   driver.navigate().back();
	   Thread.sleep(2000);
	   driver.navigate().forward();
	   https://www.flipkart.com/
	   driver.navigate().refresh();
	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	   

	}

}
