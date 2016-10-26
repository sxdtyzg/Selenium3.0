package com.jrj.selenium.test;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.jrj.selenium.ObjectRepository.Pages.sso.LoginPage;

/**
 * 
 * @author yzg
 *
 */

public class NewTest {
	WebDriver driver = null;

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(enabled = true, priority = 1)
	@Parameters({ "username", "password" })
	public void f(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "BrowserDriver/chromedriver.exe");
		driver = new ChromeDriver();
		// PortalPage lg = PageFactory.initElements(driver,PortalPage.class);
		LoginPage lg = new LoginPage(driver, "");
		lg.Login(username, password);
		assertTrue(true);
	}
}
