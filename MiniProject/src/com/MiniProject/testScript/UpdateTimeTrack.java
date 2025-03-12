package com.MiniProject.testScript;

import static org.testng.Assert.assertEquals;

import java.awt.Window;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.helpers.Reporter;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.MiniProject.generic.BaseClass;
import com.MiniProject.generic.FileLib;
import com.MiniProject.pom.HomePage;
import com.MiniProject.pom.TasksPage;
import com.MiniProject.pom.UsersPage;

public class UpdateTimeTrack extends BaseClass {
	@Test (priority = 1)
	public void EnterTimeTrack() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.getClose().click();
		h.getDateSelect().click();
		h.getDate11Select().click();
		h.getWorkday().click();
		h.getRadio().click();
		h.getTimeSpent().sendKeys("7");
		h.getOk().click();
		h.getSave().click();
		driver.navigate().refresh();
	}
	@Test (priority = 2)
	public void ValidateTimeTrack() throws InterruptedException	{
		HomePage h= new HomePage(driver);		
		h.getViewTimeTrack().click();
		Thread.sleep(1000);
		//		JavascriptExecutor js=(JavascriptExecutor) driver;
		//		js.executeScript("Window.scrollTo(0,1200)");
		String estatus= "Sick Leave:";
		String astatus = h.getValidateTimeTrack().getText();
		Assert.assertEquals(estatus, astatus);

	}
	@Test (priority = 3)
	public void ModifyTimeTrack() throws InterruptedException	{
		HomePage h= new HomePage(driver);
		//		h.getDateSelect().click();
		//		Thread.sleep(1500);
		//		h.getDate11Select().click();
		//		Thread.sleep(1500);
		h.getLeaveIcon().click();		
		h.getRadio1().click();
		Thread.sleep(1000);
		h.getOk().click();
		h.getSave().click();
	}
	//	@Test (priority = 5)
	//	public void CreateProject() throws EncryptedDocumentException, IOException, InterruptedException {
	//		HomePage h= new HomePage(driver);
	//		h.getClose().click();
	//		h.getTaskTab().click();
	//		Thread.sleep(2500);
	//		TasksPage t=new TasksPage(driver);
	//		t.getAddNewBtn().click();
	//		Thread.sleep(2500);
	//		t.getNwProjBtn().click();
	//		Thread.sleep(2500);
	//		FileLib f=new FileLib();
	//		t.getProjName().sendKeys(f.getExcelData("TestData", 1, 1));
	//		t.getCustName().sendKeys(f.getExcelData("TestData", 1, 2));
	//		t.getProjDscrpton().sendKeys(f.getExcelData("TestData", 1, 3));
	//		Thread.sleep(2500);
	//		t.getCreatProjBtn().click();
	//		driver.navigate().back();
	//		Thread.sleep(2500);
	//	}
	//	@Test (priority = 4)
	//	public void addOns() throws InterruptedException {
	//		HomePage h= new HomePage(driver);
	//		h.getClose().click();
	//		h.getAddOn().click();
	//		h.getActiTimeMobileApp().click();
	//		String pw = driver.getWindowHandle();
	//		Set<String> allwh = driver.getWindowHandles();
	//		for (String wh:allwh) {
	//			driver.switchTo().window(pw);
	//			System.out.println(wh);
	//			if (pw.equals(wh)) {				
	//			}
	//			else {				
	//				Thread.sleep(2500);
	//				
	//////				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	//////				wait.until(ExpectedConditions.visibilityOf(h.getContactSales()));
	//				
	//				h.getContactSales().click();
	//				h.getFirstName().sendKeys("Abhishek");
	//				h.getLastName().sendKeys("Sajjan");
	//				h.getEmail().sendKeys("abc123@gmail.com");
	//				h.getCompany().sendKeys("EmbedSense");
	//				h.getCountry().sendKeys("India");
	//				h.getComments().sendKeys("Software Development");
	//				h.getSubmitBtn().click();
	//			}
	//			
	//		}
	//		
	//	}
	@Test (priority = 4)
	public void helpIcon() {
		HomePage h= new HomePage(driver);
		//h.getClose().click();
		h.getHelpBtn().click();
		h.getAbtActime().click();
		String text = h.getAboutPrdct().getText();
		org.testng.Reporter.log(text, true);
		h.getCloseBtn().click();
	}
	@Test (priority = 5)
	public void validateSystemAdmin() throws InterruptedException {
		HomePage h= new HomePage(driver);
		//h.getClose().click();
		h.getAdminSysBtn().click();

		h.getEnterEmail().clear();

		h.getEnterEmail().sendKeys("abcd2650@gmail.com");
		//Thread.sleep(1000);
		h.getSaveChangesBtn().click();
		//Thread.sleep(1000);
		h.getUsers().click();
		//Thread.sleep(1000);
		UsersPage u=new UsersPage(driver);
		u.getSelctSysAdminOption().click();		
		String email= "abcd2650@gmail.com";
		String aemail = u.getVerifyEmail().getText();
		System.out.println("text is: "+aemail);
		Thread.sleep(1000);
		//		Assert.assertEquals(aemail, email);
		//		Thread.sleep(1000);
		u.getClosePopup().click();
	}

}
