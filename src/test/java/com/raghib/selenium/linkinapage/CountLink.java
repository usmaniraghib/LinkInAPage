package com.raghib.selenium.linkinapage;

/**
 * Reference:-
 * https://www.youtube.com/watch?v=FMkFWGhDM5c
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.raghib.selenium.BaseClass;

public class CountLink extends BaseClass {
	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";
	public static String url = "https://www.youtube.com/";
	
	public static void main(String[] args) {
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.get(url);
		countLink();
		printLinkDetails();
	}
	
	public static void countLink() {
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		int linkCount = elements.size();
		System.out.println("Total Link Count : "+linkCount);
	}
	
	public static void printLinkDetails() {
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		int linkCount = elements.size();
		System.out.println("Total Link Count : "+linkCount);
		
		for(int i=0; i<linkCount; i++) {
			System.out.println("Link Detail : "+elements.get(i).getText());
		}		
	}
}