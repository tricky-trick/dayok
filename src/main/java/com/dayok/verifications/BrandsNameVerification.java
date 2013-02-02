package com.dayok.verifications;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.dayok.webdriver.Base;

public class BrandsNameVerification extends Base {

	public String verifyThatBrandsNameIsCorrect() {
		String outResults="";
		getAltImgs();
		for(String brand: getAltImgs())
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("$('#floatingbar').css('display','none')");
			repository.getListPage().getBrandName(brand).click();
			String brandTitle = repository.getBrandPage().getBrandName().getText();
			if(!brandTitle.equals(brand))
				outResults+="Brand name from catalog is " + brand + ". Brand title is " + brandTitle + "\n";
			driver.navigate().back();
		}
		
		return outResults;
	}
	
	private List<String> getAltImgs(){
		List<WebElement> elements = repository.getListPage().getAmountOfBrands();
		List<String> alts = new ArrayList<String>();
		for(WebElement element: elements)
		{
			alts.add(element.getAttribute("alt"));
		}
		return alts;
	}
}
