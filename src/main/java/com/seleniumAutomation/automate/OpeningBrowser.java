package com.seleniumAutomation.automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpeningBrowser {
	
	WebDriver driver;

	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.amazon.in/");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OpeningBrowser openbrowser = new OpeningBrowser();
		
		openbrowser.launchBrowser();
	}

}
