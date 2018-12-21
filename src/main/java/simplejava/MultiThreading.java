package simplejava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

//implementing Runnable interface
public class MultiThreading extends Thread {

	WebDriver driver;
	String appUrl;

	public MultiThreading(String appUrl) {
		this.appUrl = appUrl;
	}

	public static void main(String[] args) {
		MultiThreading mt1 = new MultiThreading("yahoo");
		mt1.start();

		MultiThreading mt2 = new MultiThreading("google");
		mt2.start();
	}

	public void run() {
		System.out.println("Starting browser chrome " + appUrl);
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
				"d:\\Userfiles\\sbollina\\Desktop\\SeleniumIDE\\chrome\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("disable-infobars");
		chromeOptions.addArguments("--start-maximized");

		driver = new ChromeDriver(chromeOptions);
		String baseURL = "https://www." + appUrl + ".com/";
		System.out.println("URL " + baseURL);
		driver.get(baseURL);
		System.out.println("Title " + driver.getCurrentUrl());
		driver.quit();
	}

}
