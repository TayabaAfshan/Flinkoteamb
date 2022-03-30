package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("iphone");
		driver.findElement(By.cssSelector("#gh-btn")).click();
        js.executeScript("window.scrollBy(0,300)");
	}
  
}
