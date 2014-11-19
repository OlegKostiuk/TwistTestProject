package com.epam.kostiuk.wiki.test;

import static junit.framework.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtworks.twist.core.execution.TwistScenarioDataStore;

public class AtWiki {

	private WebDriver browser;

	@Autowired
	private TwistScenarioDataStore scenarioStore;

	public AtWiki(WebDriver browser) {
		this.browser = browser;
	}

	public void searchFor(String searchString) throws Exception {
		browser.get("http://www.en.wikipedia.org");
		System.out.println("Open main page");
		browser.findElement(By.name("search")).sendKeys(searchString);
		System.out.println("Send keys");
		browser.findElement(By.id("searchButton")).click();
		System.out.println("Click search");
	}

	public void verifyEntryPageForAppears(String link) throws Exception {
		assertTrue("Text doesnt appear", browser.getCurrentUrl().contains(link));
	}

}
