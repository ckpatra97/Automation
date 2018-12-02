package com.actitime.genericLib;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectRepository.Home;
import com.actitime.objectRepository.Login;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void configBC()
	{
		System.out.println("===============lunch Browser=============");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chinmay\\Desktop\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void configBM() throws IOException
	{
		FileLib flib=new FileLib();
		Properties pObj=flib.getPropertyObj();
		String URL=pObj.getProperty("url");
		String Uname=pObj.getProperty("user");
		String PWD=pObj.getProperty("pwd");
		
		System.out.println("===================login==================");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
		
		Login lp=PageFactory.initElements(driver,Login.class);
		lp.loginToApp(Uname,PWD);
	}
	
	@AfterMethod
	public void configAM()
	{
		System.out.println("==================logout=================");
		Home hp=PageFactory.initElements(driver,Home.class);
		hp.logout();
	}
	
	@AfterClass
	public void configAC()
	{
		System.out.println("=================close browser==========");
		driver.close();
	}

}


















