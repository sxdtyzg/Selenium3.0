package com.breadtrip.web.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.breadtrip.web.PageObject.baidu.PortalPage;

public class NewTest {
	
	
	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(enabled = true, priority = 6)
	@Parameters({"keyword"})
	public void f(String keyword) {

		System.setProperty("webdriver.chrome.driver", "BrowserDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// PortalPage lg = PageFactory.initElements(driver,PortalPage.class);
		PortalPage lg = new PortalPage(driver, "");
		lg.search(keyword);
		
	}

}
