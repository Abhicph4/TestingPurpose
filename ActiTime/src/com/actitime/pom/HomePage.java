package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(id= "logoutLink")
	private WebElement lgOut;
	
	@FindBy(xpath = "(//div[@class='img'])[2]")
	private WebElement tasks;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLogout() {
		lgOut.click();
	}
	
	public WebElement getTask() {
		return tasks;
	}
}
