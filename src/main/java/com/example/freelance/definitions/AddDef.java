package com.example.freelance.definitions;

import java.util.List;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.formatter.model.DataTableRow;

public class AddDef {
	
	private int n1;
	private int n2;
	private int result;
	
	@Given("^two numbers (\\d+)  and (\\d+)$")
	public void two_numbers_and(int arg1, int arg2) throws Throwable {
	    
		n1 = arg1;
		n2 = arg2;
		
	}

	@Then("^add them$")
	public void add_them() throws Throwable {
	    result = n1+ n2;
	}

	@Then("^verify result is (\\d+)$")
	public void verify_result_is(int arg1) throws Throwable {
	    Assert.assertEquals(result, arg1);
	}
	
	
	@Given("^two numbers add and verify$")
	public void two_numbers_add_and_verify(DataTable arg1) throws Throwable {
		
		List<DataTableRow> rows = arg1.getGherkinRows();
		for(DataTableRow row : rows){
	    two_numbers_and(Integer.parseInt(row.getCells().get(0)),Integer.parseInt(row.getCells().get(1)));
		add_them();
		verify_result_is(Integer.parseInt(row.getCells().get(2)));
		}
	}

}
