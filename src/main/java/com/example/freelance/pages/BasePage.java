package com.example.freelance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.freelance.definitions.DriverSession;

public class BasePage {
	
	
	public BasePage() {
		
		
	}
	
	public void waitForElement(WebElement element){
		(new WebDriverWait(DriverSession.getDriver(), 10))
				  .until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	
	

}
