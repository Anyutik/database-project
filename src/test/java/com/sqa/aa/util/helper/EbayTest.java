package com.sqa.aa.util.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sqa.aa.util.helper.SetUtil.STRATEGY;

public class EbayTest {
	final static String BASE_URL = "http://ebay.com";
	private String baseUrl = "http://ebay.com";

	private WebDriver driver;

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@Test
	public void ebayTest() {
		WebDriver driver = new FirefoxDriver();
		this.driver.get(BASE_URL + "/");
		this.driver.findElement(By.linkText("Sign in")).click();
		this.driver.findElement(By.id("userid")).clear();
		this.driver.findElement(By.id("userid")).sendKeys("mallaprechristian@gmail.com");
		this.driver.findElement(By.id("pass")).clear();
		this.driver.findElement(By.id("pass")).sendKeys("dummy123");
		SetUtil.gotoAndClick(driver, "csi");
		SetUtil.superClick(driver,
				"csi:sgnBt:gh-cart-i:Fossil Dean Chronograph Black Dial Men's Brown Leather Watch FS4828:gh-eb:My eBay:a.vip.item-title:gh-eb:My eBay:Wish list:ttl_172102243053:html"
						.split(":"),
				new SetUtil.STRATEGY[] { STRATEGY.ID, STRATEGY.ID, STRATEGY.ID, STRATEGY.TEXT, STRATEGY.ID,
						STRATEGY.TEXT, STRATEGY.CSS, STRATEGY.ID, STRATEGY.TEXT, STRATEGY.TEXT, STRATEGY.ID,
						STRATEGY.CSS });
	}
}