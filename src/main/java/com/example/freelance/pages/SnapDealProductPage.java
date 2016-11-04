package com.example.freelance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.example.freelance.definitions.DriverSession;

public class SnapDealProductPage extends BasePage {
	
	@FindBy(how = How.XPATH, using = "//h1[@itemprop='name']")
    private WebElement productHeading;
	
	@FindBy(how = How.XPATH, using = "//*[@itemprop='price']")
    private WebElement productPrice;
	
	@FindBy(how = How.ID, using = "dd-cart-button-id")
    private WebElement addCartButton;
	
	
	
	public static SnapDealProductPage getInstance() {
		
			
			return PageFactory.initElements(DriverSession.getDriver(),SnapDealProductPage.class);
		
	}

	public WebElement getProductHeading() {
		return productHeading;
	}

	
	public WebElement getProductPrice() {
		return productPrice;
	}

	

	public WebElement getAddCartButton() {
		return addCartButton;
	}

	
	
}
