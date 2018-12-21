package com.src.testng.TestNGParallel.grids;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridExample {
	WebDriver driver;

	@Test
	public void initGoogle() throws MalformedURLException {
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL("http://172.22.197.76:4444/wd/hub"), ds);
		driver.get("https://google.com");
	}

	@Test
	public void initYahoo() throws MalformedURLException {
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL("http://172.22.197.76:4444/wd/hub"), ds);
		driver.get("https://yahoo.com");
	}

}
