package com.breadtrip.web.PageObject.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	protected WebDriver dirver = null;
	protected WebDriverWait wait = null;
	
	public Page(WebDriver driver){
		this.dirver = driver;
		this.wait = new WebDriverWait(this.dirver, 6);
	}
	

}
