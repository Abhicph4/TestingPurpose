package com.actitime.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.FileLib;

public class TasksPage {
	
	String data;
	
	@FindBy(xpath  ="//div[text()='Add New']")
	private WebElement adnewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newCust;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement searchField;
	
	public TasksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdnewbtn() {
		return adnewbtn;
	}
	
	public WebElement getSearchField() {
		return searchField;
	}
	
	

}
