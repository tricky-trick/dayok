package com.dayok.verifications;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.dayok.webdriver.FirefoxWebDriver;

public class Base extends FirefoxWebDriver {
	

 @BeforeClass
  public void init() throws Exception {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterClass
  public void tearDown() throws Exception {
	  driver.quit();
  }
  
  @BeforeMethod
  public void navigateToBaseUrl(){
	  driver.get(repository.getMainPage().getBaseUrl());
  }
  
}
