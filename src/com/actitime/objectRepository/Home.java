package com.actitime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	@FindBy(xpath="//div[text()=\"Tasks\"]/..")
	WebElement taskImg;
	@FindBy(linkText="Logout")
	WebElement logoutlnk;
	
	public void navegateToTaskPage()
	{
		taskImg.click();
	}
	
	public void logout()
	{
		logoutlnk.click();
	}

}
