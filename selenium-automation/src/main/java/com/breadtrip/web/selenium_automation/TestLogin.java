package com.breadtrip.web.selenium_automation;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestLogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/yzg/Downloads/chromedriver");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		Login lg = PageFactory.initElements(driver, Login.class);
		lg.login(driver,"sxdtyzg", "158943YANGzg");
	}
}