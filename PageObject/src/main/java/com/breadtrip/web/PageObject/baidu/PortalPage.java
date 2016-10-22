package com.breadtrip.web.PageObject.baidu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.breadtrip.web.PageObject.base.Page;

/**
 * @author yzg
 *
 */
public class PortalPage extends Page
{
	private final WebDriver driver;
	private final String url;
	
	public PortalPage(WebDriver driver, String url) {
		super(driver);
		this.driver = driver;
		this.url = super.baseUrl + url;
	}
	

	//输入框
	@FindBy(xpath="//input[@name='wd']")
	@CacheLookup
	private WebElement inputTextField;

	//搜索按钮
	@FindBy(id = "su")
	@CacheLookup
	private WebElement searchBtn;
	
	//搜索关键字
	public void search(String keyword) {
		driver.get(this.url);
		this.inputTextField.sendKeys(keyword);
		this.searchBtn.click();
	}
}
