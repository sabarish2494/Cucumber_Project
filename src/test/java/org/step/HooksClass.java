package org.step;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	@Before(order=1)
	public void openBrowser() {
System.out.println("browser launch");
	}
	@Before(order=3)
	public void login() {
		System.out.println("login clicked");
	}
	@Before(order=2)
	public void text() {
System.out.println("text value passed");
	}
	@After(order=2)
	public void screen() {
System.out.println("screenshot taken");
	}
	@After(order=1)
	public void close() {
System.out.println("browser closed");
	}
	@After(order=3)
	public void window() {
		System.out.println("Another window opened");

	}

}
