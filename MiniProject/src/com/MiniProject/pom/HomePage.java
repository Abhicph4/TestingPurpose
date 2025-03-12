package com.MiniProject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logoutBtn;
	@FindBy(xpath = "(//div[@class='label'])[2]")
	private WebElement tasksTab;
	@FindBy(className = "x-btn-text")
	private WebElement dateSelect; 
	@FindBy(xpath = "//span[.='11']")
	private WebElement date11Select;	
	@FindBy(xpath = "//div[@id='gettingStartedShortcutsMenuCloseId']")
	private WebElement close;
	@FindBy(xpath = "(//div[.='workday'])[2]")
	private WebElement workday;
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement radio;
	@FindBy(id = "LeaveTimeSpent")
	private WebElement timeSpent;
	@FindBy(xpath = "//input[@value='OK']")
	private WebElement ok;
	@FindBy(id = "FormModifiedDivButton")
	private WebElement save;
	public WebElement getAddOn() {
		return addOn;
	}

	public WebElement getActiTimeMobileApp() {
		return actiTimeMobileApp;
	}

	public WebElement getContactSales() {
		return contactSales;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getComments() {
		return comments;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	@FindBy(linkText = "View Time-Track")
	private WebElement viewTimeTrack;	
	@FindBy(xpath = "//span[.='Mar 11, Tue']")
	private WebElement Yaxis;	
	@FindBy(xpath = "//span[.='Mar 11, Tue']/../../../../../../..//span[.='Sick Leave:']")
	private WebElement validateTimeTrack;
	@FindBy(xpath = "(//div[@class='popup_menu_label'])[2]")
	private WebElement addOn;
	@FindBy(xpath = "//div[.='actiTIME mobile app']")
	private WebElement actiTimeMobileApp;
	@FindBy(xpath =  "//a[@class='button header__sales-button']")
	private WebElement contactSales;
	@FindBy(id = "first-name")
	private WebElement firstName;
	@FindBy(id = "last-name")
	private WebElement lastName;
	@FindBy(id = "email")
	private WebElement email;
	@FindBy(id = "company-name")
	private WebElement company;
	@FindBy(className =  "form-input")
	private WebElement country;
	@FindBy(id = "question")
	private WebElement comments;
	@FindBy(id = "supportFormSubmit")
	private WebElement submitBtn;
	@FindBy(xpath = "(//div[contains(text(),'Settings')])[2]")
	private WebElement settings;


	public HomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public void setLogout() {
		logoutBtn.click();
	}	
	public WebElement getTaskTab() {
		return tasksTab;
	}
	public WebElement getDateSelect() {
		return dateSelect;
	}
	public WebElement getDate11Select() {
		return date11Select;
	}
	public WebElement getViewTimeTrack() {
		return viewTimeTrack;
	}
	public WebElement getClose() {
		return close;
	}
	public WebElement getWorkday() {
		return workday;
	}
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getTimeSpent() {
		return timeSpent;
	}
	public WebElement getHelpBtn() {
		return helpBtn;
	}

	public WebElement getAbtActime() {
		return abtActime;
	}

	public WebElement getAboutPrdct() {
		return aboutPrdct;
	}

	public WebElement getOk() {
		return ok;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getYaxis() {
		return Yaxis;
	}
	public WebElement getValidateTimeTrack() {
		return validateTimeTrack;
	}
	public WebElement getSettings() {
		return settings;
	}
	
	@FindBy(xpath = "(//div[@class='popup_menu_label'])[3]")
	private WebElement helpBtn;
	@FindBy(xpath = "(//a[@class='item_link'])[10]")
	private WebElement abtActime;
	@FindBy(id = "aboutProductInfoTable")
	private WebElement aboutPrdct;
	@FindBy(id = "aboutPopupCloseButtonId")
	private WebElement closeBtn;
	public WebElement getCloseBtn() {
		return closeBtn;
	}
	
	@FindBy(xpath = "//img[@alt='Sick Leave']")
	private WebElement leaveIcon;
	public WebElement getLeaveIcon() {
		return leaveIcon;
	}
	@FindBy(id = "LeavePopupRadio_NoLeave")
	private WebElement radio1;
	public WebElement getRadio1() {
		return radio1;
	}
	
	
	@FindBy(xpath = "//td[@class='profileCell']")
	private WebElement adminSysBtn;
	@FindBy(id = "userProfilePopup_emailField")
	private WebElement enterEmail;
	public WebElement getAdminSysBtn() {
		return adminSysBtn;
	}

	public WebElement getEnterEmail() {
		return enterEmail;
	}

	public WebElement getSaveChangesBtn() {
		return saveChangesBtn;
	}

	public WebElement getUsers() {
		return users;
	}
	@FindBy(id = "userProfilePopup_commitBtn")
	private WebElement saveChangesBtn;
	
	
	@FindBy(xpath = "//div[.='USERS']")
	private WebElement users;
	
	
	
	
}
