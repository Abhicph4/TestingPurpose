package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class BaseClass {
	public static WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@BeforeMethod
	public void login() throws IOException {
		FileLib f= new FileLib();
		LoginPage l=new LoginPage(driver);
		String url = f.getPropertydata("url");
		String un = f.getPropertydata("username");
		String pw = f.getPropertydata("password");		
		driver.get(url);
		l.setLogin(un, pw);
	}

	@AfterMethod
	public void logout() {
		HomePage h= new HomePage(driver);
		h.setLogout();
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
