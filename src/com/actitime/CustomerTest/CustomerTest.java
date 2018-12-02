package com.actitime.CustomerTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseClass;
import com.actitime.genericLib.FileLib;
import com.actitime.objectRepository.CreateCustomer;
import com.actitime.objectRepository.Home;
import com.actitime.objectRepository.OpenTask;
import com.actitime.objectRepository.ProjectAndCustomerPage;

public class CustomerTest extends BaseClass {
	@Test(priority=1)
	public void creatCustomer() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		Home hp=PageFactory.initElements(driver,Home.class);
		hp.navegateToTaskPage();
		
		OpenTask op=PageFactory.initElements(driver,OpenTask.class);
		op.navegateToProjectAndCustomer();
		
		ProjectAndCustomerPage pc=PageFactory.initElements(driver,ProjectAndCustomerPage.class);
		pc.navegateToCustomerPage();
		
		CreateCustomer cc=PageFactory.initElements(driver,CreateCustomer.class);
		cc.customerName();
		cc.CreateCustomerBtn();
	}

}
