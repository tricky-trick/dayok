package com.dayok.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dayok.webdriver.Base;

public class Git_check extends Base{

	@Test
	public void checkUrl(){
		String error = repository.getFixedMenuVerification().verifyThatFixedMenuExists();
		Assert.assertTrue(error.length()==0,error);
		
	}
	
}