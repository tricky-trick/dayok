package com.dayok.implementation;

import com.dayok.concepts.Repository;
import com.dayok.pages.CodePage;
import com.dayok.pages.ListPage;
import com.dayok.pages.MainPage;
import com.dayok.pages.BrandPage;
import com.dayok.verifications.BrandsNameVerification;
import com.dayok.verifications.CodePageVerification;
import com.dayok.verifications.FixedMenuAndLogoVerification;
import com.dayok.verifications.BrandPageVerification;

public class RepositoryImplementation implements Repository {

	public MainPage getMainPage() {
		return new MainPage();
	}

	public FixedMenuAndLogoVerification getFixedMenuVerification() {
		return new FixedMenuAndLogoVerification();
	}

	public BrandPage getBrandPage() {
		return new BrandPage();
	}
	
	public BrandPageVerification getBrandPageVerification() {
		return new BrandPageVerification();
	}

	public ListPage getListPage() {
		return new ListPage();
	}
	
	public CodePage getCodePage() {
		return new CodePage();
	}

	public CodePageVerification getCodePageVerification() {
		return new CodePageVerification();
	}

	public BrandsNameVerification getBrandsNameVerification() {
		return new BrandsNameVerification();
	}
}
