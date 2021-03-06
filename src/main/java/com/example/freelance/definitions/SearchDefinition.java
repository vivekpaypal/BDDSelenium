package com.example.freelance.definitions;



import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.example.freelance.pages.SnapDealHomePage;
import com.example.freelance.pages.SnapDealProductPage;
import com.example.freelance.pages.SnapDealSearchResultPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchDefinition{
	
	private SnapDealHomePage snapDealHomepage;
	private SnapDealSearchResultPage snapDealSearchResultPage;
	private SnapDealProductPage snapDealProductPage;
	
	
	@When("you search for (.+)")
	public void you_search_for(String term){
		
		snapDealHomepage = SnapDealHomePage.getInstance();
		snapDealHomepage.searchForItem(term);
		
	}
	
	
	@Then("number of products listed should be (\\d+)$")
	public void you_search_for(int prodcutIndex){
		
		
		snapDealSearchResultPage = SnapDealSearchResultPage.getInstance();
		Assert.assertTrue(prodcutIndex ==snapDealSearchResultPage.getSizeProducts(),"product listed is equal");
		
		
	}
	
	@Then("click on product number (\\d+)$")
	public void click_on_one_product_number(int  index){
		
		String productDescription;
		snapDealSearchResultPage = SnapDealSearchResultPage.getInstance();
		
		if( index < snapDealSearchResultPage.getSizeProducts()){
			WebElement productLink = snapDealSearchResultPage.getProducts().get(index);
			productDescription  = productLink.getText();
			productLink.click();
			snapDealProductPage = SnapDealProductPage.getInstance();
			//snapDealProductPage.waitForElement(snapDealProductPage.getProductPrice());
			
			
			System.out.println(productDescription);
			System.out.println(snapDealProductPage.getProductHeading().getText());
			Assert.assertTrue(productDescription.contains(snapDealProductPage.getProductHeading().getText()));
		}
		
	
	}
	
	
   
	

}
