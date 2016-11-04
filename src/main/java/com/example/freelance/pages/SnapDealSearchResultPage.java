package com.example.freelance.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.example.freelance.definitions.DriverSession;

public class SnapDealSearchResultPage extends BasePage{
	
	
    
    @FindAll(@FindBy(how = How.XPATH, using = "//div[@id='products']/section | //div[@id='products']/section//div[@class='product-desc-rating ']/a"))
	private List<WebElement> products;
	
    public static SnapDealSearchResultPage getInstance() {
		
		
		return PageFactory.initElements(DriverSession.getDriver(),SnapDealSearchResultPage.class);
	
    }
	
	
	
	public int getSizeProducts(){
		
		return products.size();
		
	}
	
    public List<WebElement> getProducts(){
		
		return products;
		
	}
	
	
	
	
	
	
	

}
