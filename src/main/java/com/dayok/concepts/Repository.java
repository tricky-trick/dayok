package com.dayok.concepts;

import com.dayok.pages.MainPage;
import com.dayok.verifications.FixedMenuAndLogoVerification;
import com.dayok.webdriver.PropertiesData;

public interface Repository {

	PropertiesData getPropertiesData();
	MainPage getMainPage();
	FixedMenuAndLogoVerification getFixedMenuVerification();
}
