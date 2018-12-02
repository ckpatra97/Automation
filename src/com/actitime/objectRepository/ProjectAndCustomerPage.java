package com.actitime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectAndCustomerPage {
	@FindBy(xpath="//input[@value='Create New Customer']")
	WebElement CreatCustomerBtn;
	@FindBy(xpath="//input[@value='Create New Project']")
	WebElement CreateProjectBtn;
	@FindBy(xpath="//a[text()=\"CHINMAY\"]")
	WebElement CustomerName;
	
	
	public void navegateToCustomerPage()
	{
		CreatCustomerBtn.click();
	}
	
	public void navegateToProjectPage()
	{
		CreateProjectBtn.click();
	}
	
	public void navegateToEditCustomerInformation()
	{
		CustomerName.click();
	}
	
}
