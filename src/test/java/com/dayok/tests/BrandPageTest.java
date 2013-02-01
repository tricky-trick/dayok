package com.dayok.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dayok.webdriver.Base;

public class BrandPageTest extends Base{

	@Test
	public void checkBrandName(){
		repository.getMainPage().getServicesMenu().click();
		repository.getListPage().getBrandName("HOUSE").click();
		String error = repository.getBrandPageVerification().verifyThatBrandNameIsCorrect();
		Assert.assertTrue(error.length()==0,error);
		
	}
	
	@Test
	public void checkAmountOfBrands(){
		repository.getMainPage().getServicesMenu().click();
		String error = repository.getBrandPageVerification().verifyThatBrandsListIsNotEmpty();
		Assert.assertTrue(error.length()==0,error);
		
	}
}
