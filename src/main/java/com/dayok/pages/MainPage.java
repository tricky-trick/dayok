package com.dayok.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.dayok.webdriver.FirefoxWebDriver;

public class MainPage  extends FirefoxWebDriver{
	
	public String getBaseUrl(){
		return "http://test-2012.zayco.com.ua";
	}
	
	public WebElement getHeader(){
		return driver.findElement(By.id("header"));
	}
	
	public WebElement getFixedMenu(){
		return driver.findElement(By.id("floatingbar"));
	}
	
	public WebElement getSeachButton(){
		return driver.findElement(By.id("searchButton"));
	}
	
	public WebElement getServicesMenu(){
		return driver.findElement(By.xpath("//*[@id='nav']//a[contains(@href,'services.php')]"));
	}
	
	public WebElement getSearchForm(){
		return driver.findElement(By.id("brand"));
	}

}
