package com.guru99.live.pages;

import org.openqa.selenium.WebDriver;

public class OrderInformationPage extends BasePage{

	public OrderInformationPage(WebDriver driver) {
		super(driver);
	}

	public boolean validateStatus() {
		boolean ans = driver.getPageSource().contains("Pending");
		return ans; 
	}
	
	

}
