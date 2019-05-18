package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver dr;
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return dr;
	}
	
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		dr.quit();
	}

}
