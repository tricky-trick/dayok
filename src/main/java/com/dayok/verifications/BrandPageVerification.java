package com.dayok.verifications;

import com.dayok.webdriver.Base;

public class BrandPageVerification extends Base {

	public String verifyThatBrandNameIsCorrect() {
		
		String outResults="";
		String brandTitle=repository.getBrandPage().getBrandName().getText().trim();
		if(!brandTitle.equals("HOUSE"))
		outResults+="Title is incorrect. Actual title is "+brandTitle+"\n";
		return outResults;
	}
	
	public String verifyThatBrandsListIsNotEmpty() {
	String outResults="";
	int count = repository.getListPage().getAmountOfBrands().size();
	 if(count<0)
		 outResults+="Brands list is empty \n";
	System.out.println(count);
	return outResults;
	}
}
