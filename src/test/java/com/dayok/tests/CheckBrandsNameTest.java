package com.dayok.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dayok.webdriver.Base;

public class CheckBrandsNameTest extends Base{

	@Test
	public void checkBrandsName(){
		repository.getMainPage().getServicesMenu().click();
		String error = repository.getBrandsNameVerification().verifyThatBrandsNameIsCorrect();
		Assert.assertTrue(error.length()==0,error);
		
	}

}
