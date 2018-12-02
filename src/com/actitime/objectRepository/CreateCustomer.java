package com.actitime.objectRepository;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericLib.FileLib;

public class CreateCustomer extends FileLib {
	@FindBy(name="name")
	WebElement cName;
	@FindBy(name="createCustomerSubmit")
	WebElement createcustomerbtn;
	
	public void customerName() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileLib fLib=new FileLib();
		String customerName=fLib.getExcelData("Sheet1", 1, 2);
		
		cName.sendKeys(customerName);
	}

	public void CreateCustomerBtn()
	{
		createcustomerbtn.click();
	}
}
