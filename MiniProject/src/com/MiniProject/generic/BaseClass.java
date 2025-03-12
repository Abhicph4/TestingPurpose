package com.MiniProject.generic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.MiniProject.pom.HomePage;
import com.MiniProject.pom.LoginPage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Listeners(com.MiniProject.generic.ListenerImplimentation.class)
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
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(un,pwd);
	}
	@AfterMethod
	public void logout(){
		HomePage h=new HomePage(driver);
		h.setLogout();
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}	
}
