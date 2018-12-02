package com.actitime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(name="username")
	WebElement usernameEdt;
	@FindBy(name="pwd")
	WebElement passwordEdt;
	@FindBy(id="loginButton")
	WebElement loginBtn;
	
	public void loginToApp(String Username,String Password)
	{
		usernameEdt.sendKeys(Username);
		passwordEdt.sendKeys(Password);
		loginBtn.click();
	}

}
