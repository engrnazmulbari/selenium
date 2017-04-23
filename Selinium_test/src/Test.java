import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {

	public static void main(String[] args) {
		
		/**
		 * Using firefox web browser
		 * */
		System.setProperty("webdriver.gecko.driver","G:\\JARS\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver foxDriver = new FirefoxDriver();
		foxDriver.get("https://www.facebook.com");
		System.out.println("Title: "+foxDriver.getTitle());
		//System.out.println("Source code: "+foxDriver.getPageSource());
		System.out.println("Current url: "+foxDriver.getCurrentUrl());
		foxDriver.findElement(By.id("email")).sendKeys("wiki");
		foxDriver.findElement(By.name("pass")).sendKeys("wiki");
		//foxDriver.findElement(By.id("u_0_q")).click();
		//foxDriver.close();
		
		/**
		 * Using Chrome driver
		 * */
	/*	System.setProperty("webdriver.chrome.driver","G:\\JARS\\chromedriver_win32\\chromedriver.exe");
		WebDriver cromeDriver = new ChromeDriver();*/
		
		/**
		 * Using Internet Explorer
		 * */
	/*	System.setProperty("webdriver.ie.driver","G:\\JARS\\IEDriverServer_x64_2.51.0\\IEDriverServer.exe");
		WebDriver ieDriver = new InternetExplorerDriver();*/
		
	}

}
