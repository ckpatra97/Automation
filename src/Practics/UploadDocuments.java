package Practics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadDocuments {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("input_resumeParser")).sendKeys("C:\\Users\\Chinmay\\Desktop\\CV\\AutamationResume.docx");
		Thread.sleep(2000);
		driver.quit();
	}
	

}
