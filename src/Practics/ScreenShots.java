package Practics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ScreenShots {
	@Test
	public static void screenShotTest() throws InterruptedException, IOException
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chinmay\\Desktop\\Chrome\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://desktop-0usrvcn/login.do");
		
		//EventFiringWebDriver t=new EventFiringWebDriver(driver);
		
		TakesScreenshot t=(TakesScreenshot) driver;
		
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ss.png");
		
		FileUtils.copyFile(src, dest);
		driver.close();
	}

}
