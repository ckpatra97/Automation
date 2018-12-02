package com.actitime.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lipu {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='nav-input'and @type='submit'and@value='Go']")).click();
	}

	}



