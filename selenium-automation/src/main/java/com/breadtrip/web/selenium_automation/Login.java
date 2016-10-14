package com.breadtrip.web.selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Test
 *
 */
public class Login {
	//用户名
	@FindBy(id = "txtUser")
	private WebElement username;

	//密码
	@FindBy(id = "txtPass")
	private WebElement password;
	
	//登录按钮
	@FindBy(id = "loginBtn")
	private WebElement loginBtn;

	//登录
	public void login(WebDriver dr, String username, String password) {
		dr.get("http://mail.10086.cn/");
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		loginBtn.click();
	}
}
