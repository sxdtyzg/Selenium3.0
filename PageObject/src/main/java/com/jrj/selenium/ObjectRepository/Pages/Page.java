package com.jrj.selenium.ObjectRepository.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {
	protected final WebDriver driver;
	protected String baseUrl = "https://sso.jrj.com.cn/sso/ssopassportlogin";
	
	public Page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void goTo(){
		this.driver.get(this.baseUrl);
	}
	
	//验证正确打开页面
	//public abstract boolean sync();

}
