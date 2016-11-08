package com.example.freelance.definitions;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(format = {"pretty", "html:build/cucumber-html-report"}/*tags={"@smoke"}*/)
	public class BddTest {
		
		
	}


