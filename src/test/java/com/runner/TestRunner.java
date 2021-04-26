package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue= {"com.stepdefinition"},dryRun=true,monochrome=true,snippets=SnippetType.CAMELCASE,plugin= {"pretty","json:src\\test\\resources\\JvmReports\\cucumber.json"})
public class TestRunner {
//	@AfterClass
//	public static void a1() {
//         JvmReporter.generateJVMReport(System.getProperty("user.dir")+"json:src\\test\\resources\\JvmReports\\cucumber.json");
//	}
//	

}

