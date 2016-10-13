package com.breadtrip.web.selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Test
 *
 */
public class Login {
	@FindBy(id = "label_user")
	private WebElement username;

	@FindBy(id = "txtPass")
	private WebElement password;

	@FindBy(id = "loginBtn")
	private WebElement loginBtn;

	public void login(WebDriver dr, String username, String password) {
		dr.get("http://mail.10086.cn/");
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		loginBtn.click();
	}
}
