package com.dayok.concepts;

import com.dayok.pages.CodePage;
import com.dayok.pages.ListPage;
import com.dayok.pages.MainPage;
import com.dayok.verifications.BrandPageVerification;
import com.dayok.verifications.BrandsNameVerification;
import com.dayok.verifications.CodePageVerification;
import com.dayok.verifications.FixedMenuAndLogoVerification;
import com.dayok.pages.BrandPage;

public interface Repository {

	MainPage getMainPage();
	FixedMenuAndLogoVerification getFixedMenuVerification();
	BrandPage getBrandPage();
	BrandPageVerification getBrandPageVerification();
	ListPage getListPage();
	CodePage getCodePage();
	CodePageVerification getCodePageVerification();
	BrandsNameVerification getBrandsNameVerification();
	
}