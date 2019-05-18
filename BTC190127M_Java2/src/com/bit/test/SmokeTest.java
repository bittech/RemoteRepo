package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmokeTest {

	public static void main(String[] args) throws InterruptedException {
		
		BaseTest bt = new BaseTest();
		WebDriver pr = bt.getDriver();
		Shared s = new Shared();
		s.gotoUrl(pr, "http://www.facebook.com");
		s.verifyTitle(pr);
		s.verifyUrl(pr);
		s.verifyElementDisplay(pr, By.xpath("//h2[text()='Sign Up']"));
		s.myClick(pr, By.xpath("//a[text()='Forgot account?']"));
		pr.navigate().back();
		Thread.sleep(3000);
		s.myType(pr, By.id("u_0_c"), "bittech");
		
		bt.closeBrowser();
	}

}
