package com.actitime.ModifyCustomer;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseClass;
import com.actitime.objectRepository.Home;
import com.actitime.objectRepository.ModifyCustomer;
import com.actitime.objectRepository.OpenTask;
import com.actitime.objectRepository.ProjectAndCustomerPage;

public class ModifycustomerTest extends BaseClass {
	@Test(priority=2)
	public void modifyCustomerPage()
	{
		Home hp=PageFactory.initElements(driver,Home.class);
		hp.navegateToTaskPage();
		
		OpenTask op=PageFactory.initElements(driver,OpenTask.class);
		op.navegateToProjectAndCustomer();
		
		ProjectAndCustomerPage pc=PageFactory.initElements(driver,ProjectAndCustomerPage.class);
		pc.navegateToEditCustomerInformation();
		
		ModifyCustomer mdc=PageFactory.initElements(driver,ModifyCustomer.class);
		mdc.modifyPage();
		mdc.save();
	}

}
