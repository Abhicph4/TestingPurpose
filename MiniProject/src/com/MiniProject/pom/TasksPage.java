package com.MiniProject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addNewBtn;
	@FindBy(xpath = "//div[.='+ New Project']")
	private WebElement nwProjBtn;
	@FindBy(id = "projectPopup_projectNameField")
	private WebElement projName;
	@FindBy(id = "projectPopup_newCustomerNameField")
	private WebElement custName;
	@FindBy(id = "projectPopup_projectDescriptionField")
	private WebElement projDscrpton;
	@FindBy(xpath = "//span[.='Create Project']")
	private WebElement creatProjBtn;
	public TasksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getNwProjBtn() {
		return nwProjBtn;
	}
	public WebElement getProjName() {
		return projName;
	}
	public WebElement getCustName() {
		return custName;
	}
	public WebElement getProjDscrpton() {
		return projDscrpton;
	}
	public WebElement getCreatProjBtn() {
		return creatProjBtn;
	}
	

}
