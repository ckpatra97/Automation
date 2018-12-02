package com.actitime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModifyCustomer {
	@FindBy(name="name")
	WebElement ModifyBtn;
	@FindBy(name="saveChanges")
	WebElement SaveBtn;
	
	public void modifyPage()
	{
		ModifyBtn.clear();
		ModifyBtn.sendKeys("chinmayyyyy");
	}

	public  void save()
	{
		SaveBtn.click();
	}

}
