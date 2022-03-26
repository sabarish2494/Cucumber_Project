package org.step;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass2 extends BaseClass{
	@Before
	public void launchBrowser() {
		chromeBrowser();

	}
	@After
	public void leaveBrowser(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot tk=(TakesScreenshot)driver;
			byte[] ss = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(ss,"image/png");
			
		}
		
		
		driver.quit();
	}


}
