package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Tayaba");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Afshan");
	     driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("1234567");
	     driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Password");
//	     WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
//	     Select dropDown1 = new Select(date);
//	     Thread.sleep(2000);
//	     dropDown1.selectByVisibleText("18");
//	     
//	     WebElement month =driver.findElement(By.id("month"));
//	     Select dropDown2 = new Select(month);
//	     Thread.sleep(2000);
//	     dropDown2.selectByVisibleText("Apr");
//		
//	     WebElement year =driver.findElement(By.id("year"));
//	     Select dropDown3 = new Select(year);
//	     Thread.sleep(2000);
//	     dropDown3.selectByVisibleText("1997");
	     
//	     WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
//         Select dropDown1 = new Select(date);
//	     Thread.sleep(2000);
//	     dropDown1.selectByIndex(17);//indexing always starts from 0
//	     
//	     WebElement month =driver.findElement(By.id("month"));
//	     Select dropDown2 = new Select(month);
//	     Thread.sleep(2000);
//	     dropDown2.selectByIndex(3);
//	     
//	     WebElement year =driver.findElement(By.id("year"));
//	     Select dropDown3 = new Select(year);
//	     Thread.sleep(2000);
//	     dropDown3.selectByIndex(25);
	     
	     WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
         Select dropDown1 = new Select(date);
	     Thread.sleep(2000);
	     dropDown1.selectByValue("18");
	     
	     WebElement month =driver.findElement(By.id("month"));
	     Select dropDown2 = new Select(month);
	     Thread.sleep(2000);
	     dropDown2.selectByValue("4");
	     
	     WebElement year =driver.findElement(By.id("year"));
	     Select dropDown3 = new Select(year);
	     Thread.sleep(2000);
	     dropDown3.selectByValue("1997");
	     

	}

}
