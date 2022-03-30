package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facbook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ajay");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("raj");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8769054246");
		driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("Password");
		
//		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
//		Select dropdown1 = new Select(date);
//		dropdown1.selectByVisibleText("18");
//		
//		WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
//		Select dropdown2= new Select (month);
//		dropdown2.selectByVisibleText("Apr");
//		
//		WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
//		Select dropdown3 = new Select (year);
//		dropdown3.selectByVisibleText("2018");
		
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
     	Select dropdown1 = new Select(date);
     	dropdown1.selectByIndex(22);//Indexing starts from 0
     	
     	WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
		Select dropdown2= new Select (month);
		dropdown2.selectByIndex(9);
		
		WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
		Select dropdown3 = new Select (year);
		dropdown3.selectByIndex(7);
		
//		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
//     	Select dropdown1 = new Select(date);
//     	dropdown1.selectByValue("8");
//     	
//     	WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
//		Select dropdown2= new Select (month);
//		dropdown2.selectByValue("4");
//		
//		WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
//		Select dropdown3 = new Select (year);
//		dropdown3.selectByValue("2015");
	}
}
