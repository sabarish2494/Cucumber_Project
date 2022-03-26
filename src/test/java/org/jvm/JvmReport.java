package org.jvm;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void jvmReportGenerator(String json) 
	{
		File f=new File("C:\\Users\\Sabarish\\eclipse-workspace\\CucumberFramework\\Reports\\JVMReport");
		Configuration c=new Configuration(f,"E commerce Application");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Browser","Chrome");
		c.addClassifications("Tool", "Selenium");
		c.addClassifications("Framework","Cucumber");
		List<String>l=new LinkedList<String>();
		l.add(json);
		ReportBuilder r=new ReportBuilder(l,c);
		r.generateReports();
	}
}