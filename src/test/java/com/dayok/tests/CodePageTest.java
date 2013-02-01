package com.dayok.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dayok.webdriver.Base;

public class CodePageTest extends Base{

	@Test
	public void checkCodeSendMsg(){
		repository.getMainPage().getServicesMenu().click();
		repository.getListPage().getBrandName("HOUSE").click();
		repository.getBrandPage().getReceiveCodeButton().click();
		repository.getBrandPage().getSendCodeButton().click();
		String error = repository.getCodePageVerification().verifySendCodeMsg();
		Assert.assertTrue(error.length()==0,error);
		
	}
}
