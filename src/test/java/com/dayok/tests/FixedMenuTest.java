package com.dayok.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dayok.webdriver.Base;

public class FixedMenuTest extends Base{

	@Test
	public void checkUrl(){
		String error = repository.getFixedMenuVerification().verifyThatFixedMenuExists();
		Assert.assertTrue(error.length()==0,error);
		
	}

	@Test
	public void checkLogo(){
		String error = repository.getFixedMenuVerification().verifyNavigationFromLogo();
		Assert.assertTrue(error.length()==0,error);
	}
	
	@Test
	public void checkSeachButton(){
		String error = repository.getFixedMenuVerification().verifyClickOnSeachButton();
		Assert.assertTrue(error.length()==0,error);
	}
	
	@Test
	public void checkSearchBrand(){
		repository.getMainPage().getSearchForm().click();
		repository.getMainPage().getSearchForm().sendKeys("house");
		repository.getMainPage().getSeachButton().click();
		String error = repository.getBrandPageVerification().verifyThatBrandNameIsCorrect();
		Assert.assertTrue(error.length()==0,error);
	}
}
