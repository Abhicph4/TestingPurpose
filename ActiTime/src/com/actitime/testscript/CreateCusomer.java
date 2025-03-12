package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TasksPage;

import dev.failsafe.internal.util.Assert;

public class CreateCusomer extends BaseClass {

	@Test
	public void createNewCust() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		h.getTask().click();		
		TasksPage t=new TasksPage(driver);
		t.getAdnewbtn().click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

	@Test
	public void searchCust() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		HomePage h=new HomePage(driver);
		h.getTask().click();
		TasksPage t=new TasksPage(driver);		
		FileLib f=new FileLib();		
		t.getSearchField().sendKeys(f.getExceldata("CreateCustomer", 5, 2));
		Thread.sleep(5000);
		driver.navigate().refresh();
		
	}
}
