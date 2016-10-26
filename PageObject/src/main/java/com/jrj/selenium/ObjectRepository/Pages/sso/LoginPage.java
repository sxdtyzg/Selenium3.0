package com.jrj.selenium.ObjectRepository.Pages.sso;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.jrj.selenium.ObjectRepository.Pages.Page;

/**
 * @author yzg
 *
 */
public class LoginPage extends Page {
	private final WebDriver driver;
	private final String url;

	public LoginPage(WebDriver driver, String url) {
		super(driver);
		this.driver = driver;
		this.url = super.baseUrl + url;
	}

	// 用户名输入框
	@FindBy(xpath = "//input[@id='txtUsername']")
	@CacheLookup
	private WebElement inputUsernameTextField;

	// 密码输入框
	@FindBy(xpath = "//input[@id='txtPassword']")
	@CacheLookup
	private WebElement inputPasswordTextField;

	// 登录按钮
	@FindBy(xpath = "//a[@class='sso-btn-login']")
	@CacheLookup
	private WebElement loginBtn;

	// 登录
	public void Login(String username, String password) {
		driver.get(this.url);
		this.inputUsernameTextField.sendKeys(username);
		this.inputPasswordTextField.sendKeys(password);
		this.loginBtn.click();
	}
}
