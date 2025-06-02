package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_TestCase_001 {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\malabar tech\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		Thread.sleep(2000);
	}

}