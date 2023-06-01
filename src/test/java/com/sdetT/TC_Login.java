package com.sdetT;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login {

	@Test
	
	public void login_Test() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		Thread.sleep(3000);
		
		
		System.out.println(driver.getTitle());
		
		//Assert.assertEquals(driver.getTitle(),"Logged In Successfully | Practice Test Automation");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	
}
