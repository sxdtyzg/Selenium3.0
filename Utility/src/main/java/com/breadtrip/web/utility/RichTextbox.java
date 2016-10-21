package com.breadtrip.web.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * @author yzg
 * 富文本框输入内容
 */

public class RichTextbox {
	public static void inputText(WebDriver driver, String frameId, String content){
		String script = "document.getElementById('" + frameId + "').contentWindow.document.body.innerHTML='" + content + "'";
		((JavascriptExecutor)driver).executeScript(script);
	}
}
