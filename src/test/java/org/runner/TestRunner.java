package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue="org.step",dryRun=false,monochrome=true,strict=true,tags="@sanity",plugin={"pretty",
"html:C:\\Users\\Sabarish\\eclipse-workspace\\CucumberFramework\\Reports\\HTMLReport",
"json:C:\\Users\\Sabarish\\eclipse-workspace\\CucumberFramework\\Reports\\JSONReport\\jsonreport.json",
"junit:C:\\Users\\Sabarish\\eclipse-workspace\\CucumberFramework\\Reports\\JUNITReport\\junitreport.xml",
"rerun:C:\\Users\\Sabarish\\eclipse-workspace\\CucumberFramework\\FailureScenarios\\failures.txt"})
public class TestRunner {
	@AfterClass
	public static void jvm() {
		JvmReport.jvmReportGenerator("C:\\\\Users\\\\Sabarish\\\\eclipse-workspace\\\\CucumberFramework\\\\Reports\\\\JSONReport\\\\jsonreport.json");
	}
	

}
