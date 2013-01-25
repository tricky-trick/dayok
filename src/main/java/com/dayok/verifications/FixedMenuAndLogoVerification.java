package com.dayok.verifications;

public class FixedMenuAndLogoVerification extends Base {

	public String verifyThatFixedMenuExists(){
		String outResults="";
		if(!repository.getMainPage().getFixedMenu().isDisplayed())
			outResults+="Fixed menu is absent \n";
		return outResults;
	}
	
	public String verifyNavigationFromLogo(){
		String outResults="";
		repository.getMainPage().getHeader().click();
		if(!driver.getCurrentUrl().contains(repository.getMainPage().getBaseUrl()))
			outResults+="Navigation is failed \n";
		return outResults;
	}
	
	public String verifyClickOnSeachButton(){
		String outResults="";
		repository.getMainPage().getSeachButton().click();
		if(!driver.getCurrentUrl().contains("shop.php"))
			outResults+="Searching is failed \n";
		return outResults;
	}
}
