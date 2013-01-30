package com.dayok.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CodePage extends BrandPage {

	public WebElement getCodeResult(){
		return driver.findElement(By.cssSelector("#border p:nth-child(1)"));
	}
}
