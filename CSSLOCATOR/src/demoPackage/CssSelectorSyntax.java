package demoPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorSyntax {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("computer");
//		driver.findElement(By.cssSelector("input[type='submit']")).click();
//		//driver.findElement(By.cssSelector("a[class='ico-register']")).click();
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)");
//driver.findElement(By.cssSelector("a.ico-register")).click();
//		driver.findElement(By.cssSelector("input#gender-female")).click();
//		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Tayaba");
//		
		//driver.findElement(By.xpath("(//input[@name='Gender'])[2]")).click();
		
//		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
//		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		
		List<WebElement> buttons=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		for(int i=0;i<buttons.size();i++) {
			buttons.get(i).click();
			System.out.println(buttons.get(i).getAttribute("text"));
		}
			

	}

}
