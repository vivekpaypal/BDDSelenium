package com.example.freelance.pages;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.example.freelance.definitions.DriverSession;


public class SnapDealHomePage extends BasePage {
	
	@FindBy(how = How.ID, using = "inputValEnter")
    private WebElement searchBox;
	@FindBy(how = How.CLASS_NAME, using = "searchformButton")
	private WebElement searchButton;
	@FindBy(how = How.CLASS_NAME, using = "search-result-text")
	private WebElement resultText;
	
	
	
	public static SnapDealHomePage getInstance(){
		
		return PageFactory.initElements(DriverSession.getDriver(),SnapDealHomePage.class);
	}
	
	public void searchForItem(String searchterm){
		
		searchBox.sendKeys(searchterm);
		searchButton.click();
		Asserts.check(resultText.getText().contains(searchterm),"Verify the search term in result page");
	}

}
