package com.dayok.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrandPage extends MainPage {

	public WebElement getBrandName(){
		return driver.findElement(By.xpath("//*[@id='main']//h2[@name='title']"));
	}
	
	public WebElement getReceiveCodeButton(){
		return driver.findElement(By.cssSelector("#modalCode span"));
	}
	
	public WebElement getSendCodeButton(){
		return driver.findElement(By.cssSelector(".sendBtn"));
	}
}
