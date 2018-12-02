package com.actitime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask {
	@FindBy(xpath="//a[text()=\"Projects & Customers\"]")
	WebElement ProjectandCustomerBtn;

	public void navegateToProjectAndCustomer()
	{
		ProjectandCustomerBtn.click();
	}
}
