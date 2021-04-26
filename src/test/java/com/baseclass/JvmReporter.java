package com.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReporter {
public static void generateJVMReport(String jsonFile) {
	File reportDirectory = new File(System.getProperty("user.dir")+("src\\test\\resources\\JvmReports"));
	Configuration configuration=new Configuration(reportDirectory, "AdactinHotel");
	configuration.addClassifications("Browser Name", "chrome");
	configuration.addClassifications("Browser version", "86");
	configuration.addClassifications("Testing", "SmokeTesting");
	configuration.addClassifications("Sprint", "12");
	configuration.addClassifications("OS", "Windows");
	List<String>jsonFiles=new ArrayList<String>();
	jsonFiles.add(jsonFile);
	ReportBuilder reportBuilder=new ReportBuilder(jsonFiles, configuration);
	reportBuilder.generateReports();
}

}
