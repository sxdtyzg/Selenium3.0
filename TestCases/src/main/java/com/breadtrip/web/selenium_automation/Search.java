package com.breadtrip.web.selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Test
 *
 */
public class Search {
	//输入框
//	@FindBy(id = "kw")
	@FindBy(xpath="//input[@name='wd']")
	private WebElement inputDia;

	//搜索按钮
	@FindBy(id = "su")
	private WebElement searchBtn;
	
	//搜索关键字
	public void search(WebDriver dr, String keyword) {
		dr.get("http://www.baidu.com");
		this.inputDia.sendKeys(keyword);
		this.searchBtn.click();
		
	}
}
