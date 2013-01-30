package com.dayok.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ListPage extends MainPage {

	public WebElement getBrandName(){
		return driver.findElement(By.xpath("//button/img[@alt='HOUSE']"));
	}
	
	public List<WebElement> getAmountOfBrands() {
		   return driver.findElements(By.cssSelector(".catalog"));
		}
}
