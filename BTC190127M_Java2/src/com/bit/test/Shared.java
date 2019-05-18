package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shared {
	
	public void gotoUrl(WebDriver dr, String url) {
		dr.get(url);
	}
	
	public void myClick(WebDriver dr, By by ) {
		dr.findElement(by).click();
	}
	
	public void click(WebElement element) {
		//WebElement element = dr.findElement();
		//String element = "jkgsdvckjshdbjf";
		element.click();
	}
	
	public void myType(WebDriver dr, By by, String value) {
		dr.findElement(by).sendKeys(value);
	}
	
	public void verifyattribute(WebDriver dr, By by, String attributeName) {
		String w = dr.findElement(by).getAttribute(attributeName);
		System.out.println("Attribute value for " + attributeName + " : " + w);
	}
	
	public void verifyText(WebDriver dr, By by) {
		String r = dr.findElement(by).getText();
		System.out.println(r);
	}
	
	public void verifyUrl(WebDriver dr) {
		String e = dr.getCurrentUrl();
		System.out.println(e);
	}
	
	public void verifyTitle(WebDriver dr) {
		System.out.println(dr.getTitle());
	}
	
	public void verifyElementDisplay(WebDriver dr, By by) {
		boolean e = dr.findElement(by).isDisplayed();
		System.out.println("Is Elemnt diplayed ? " + e);
	}
	
}
