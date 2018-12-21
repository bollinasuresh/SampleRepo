package com.src.testng.TestNGParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Internet {
	WebDriver driver;

	@Test()
	public void startBrowser() {
		System.out.println("Starting browser chrome ");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
				"d:\\Userfiles\\sbollina\\Desktop\\SeleniumIDE\\chrome\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("disable-infobars");
		chromeOptions.addArguments("--start-maximized");

		driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.myntra.com/");
		System.out.println("Title " + driver.getCurrentUrl());
		driver.quit();
	}

}
