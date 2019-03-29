package com.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Base()
	{	
		try {
			prop=new Properties();
			FileInputStream f=new FileInputStream("C:\\Users\\005951\\Desktop\\Test\\Sample\\src\\main\\java\\com\\config\\Config.properties");
			prop.load(f);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void intlize() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\005951\\Desktop\\Test\\Sample\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
	}

}
