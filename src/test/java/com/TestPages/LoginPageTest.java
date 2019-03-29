package com.TestPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.LoginPage;

public class LoginPageTest extends Base {
	LoginPage loginpage=new LoginPage();
	public LoginPageTest()
	{
		super();
	}
	
	
	
	@BeforeMethod
	public void launch()
	{
		
		intlize();
		
		
	}
	@Test
	public void login()
	{	
		String s=prop.getProperty("username");
		System.out.println(s);
		
		
	}
	
	@AfterMethod
	public void end() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
	
	

}
