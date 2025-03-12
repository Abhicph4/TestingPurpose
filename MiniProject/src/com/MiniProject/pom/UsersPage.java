package com.MiniProject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	@FindBy(xpath = "//span[.='System, Administrator']")
	private WebElement selctSysAdminOption;
	@FindBy(id = "userDataLightBox_emailField")
	private WebElement verifyEmail;
	public WebElement getSelctSysAdminOption() {
		return selctSysAdminOption;
	}


	public WebElement getVerifyEmail() {
		return verifyEmail;
	}


	public WebElement getClosePopup() {
		return closePopup;
	}


	@FindBy(id = "closeUserDataLightBoxBtn")
	private WebElement closePopup;
	
	
	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
