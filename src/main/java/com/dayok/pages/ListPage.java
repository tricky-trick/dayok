package com.dayok.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ListPage extends MainPage {

	public WebElement getBrandName(String brandName){
		return driver.findElement(By.xpath(String.format("//button/img[@alt='%s']",brandName)));
	}
	
	public List<WebElement> getAmountOfBrands() {
		   return driver.findElements(By.cssSelector(".catalog img"));
	}

}
