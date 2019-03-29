package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class LoginPage extends Base {
	@FindBy(id="username")
	public WebElement uname;
	
	@FindBy(id="password")
	WebElement pwd;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	

	}
	public void data() {
		uname.sendKeys(prop.getProperty("username"));
	}
	
		
	
	
}
