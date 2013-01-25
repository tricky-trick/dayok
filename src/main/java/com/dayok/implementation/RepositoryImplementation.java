package com.dayok.implementation;

import com.dayok.concepts.Repository;
import com.dayok.pages.MainPage;
import com.dayok.verifications.FixedMenuAndLogoVerification;
import com.dayok.webdriver.PropertiesData;

public class RepositoryImplementation implements Repository {

	public PropertiesData getPropertiesData() {
		return new PropertiesData();
	}

	public MainPage getMainPage() {
		return new MainPage();
	}

	public FixedMenuAndLogoVerification getFixedMenuVerification() {
		return new FixedMenuAndLogoVerification();
	}

	
}
