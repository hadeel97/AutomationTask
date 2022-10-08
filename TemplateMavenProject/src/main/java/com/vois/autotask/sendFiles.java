package com.vois.autotask;

import java.awt.AWTException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class sendFiles {

	static ChromeOptions options = new ChromeOptions();
	static WebDriver driver;
	static String email = "hadilemahh@aol.com";
	static String password = "Hadmahh123";
	static String email1 = "mohamed.almokadem@vodafone.com";

	
	public static void setUp() {

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "/Users/hadilekhalifa/desktop/sikuli/chromedriver");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

	}

	public static void login() throws InterruptedException, AWTException, FindFailed {
		setUp();
		driver.get(
				"https://login.aol.com/?src=mail&client_id=dj0yJmk9VlN3cDhpNm1Id0szJmQ9WVdrOVdtRm1aMVU1Tm1zbWNHbzlNQS0tJnM9Y29uc3VtZXJzZWNyZXQmeD1mYQ--&crumb=mpxx06OiXaM&lang=en-gb&redirect_uri=https%3A%2F%2Foidc.mail.aol.com%2Fcallback&pspid=1197803637&activity=default&done=https%3A%2F%2Fapi.login.aol.com%2Foauth2%2Fauthorize%3Fclient_id%3Ddj0yJmk9VlN3cDhpNm1Id0szJmQ9WVdrOVdtRm1aMVU1Tm1zbWNHbzlNQS0tJnM9Y29uc3VtZXJzZWNyZXQmeD1mYQ--%26language%3Den-gb%26nonce%3DNoQBlvx3QoSzE2z18SejbsssUmsA4SCu%26redirect_uri%3Dhttps%253A%252F%252Foidc.mail.aol.com%252Fcallback%26response_type%3Dcode%26scope%3Dmail-r%2Bycal-w%2Bopenid%2Bopenid2%2Bmail-w%2Bmail-x%2Bsdps-r%2Bmsgr-w%26src%3Dmail%26state%3DeyJhbGciOiJSUzI1NiIsImtpZCI6IjZmZjk0Y2RhZDExZTdjM2FjMDhkYzllYzNjNDQ4NDRiODdlMzY0ZjcifQ.eyJyZWRpcmVjdFVyaSI6Imh0dHBzOi8vbWFpbC5hb2wuY29tL3dlYm1haWwtc3RkL2VuLWdiL3N1aXRlIn0.nkTU1vV3-0n1qy3WwdQ09vxF8Pxc1JFn5BsQQ4pDXu99jPrHVX1mfvaa-XB6kyEAM77xomPvx7YVGdXqvKFENmsn_rEEjaRny4CwbQ3SRevck_up3nupPQQKpNRagE1RqLz9tbAWMx3gu6yvL_fnxv11mDPZhE8DWzX2g5VMQus");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"login-passwd\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		
	}
	
	public static void upload() throws FindFailed, InterruptedException, AWTException {
		login();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"dijit__Widget_0\"]/div")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"toInputField\"]")).sendKeys(email1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"dijit__Widget_27\"]/div/div[5]/div[2]/input")).sendKeys("First automation task");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"uniqName_4_7\"]")).click();	
		Thread.sleep(3000);
		
		getFile();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"uniqName_4_4\"]")).click();
		Thread.sleep(3000);
		tearDown();
		
	}
	
	public static void getFile() throws FindFailed {
		Screen s = new Screen();
		s.find("/Users/hadilekhalifa/desktop/e.sikuli/desktop.png");
		s.doubleClick();
		s.find("/Users/hadilekhalifa/desktop/e.sikuli/datafile.png");
		s.doubleClick();
		
	}

	public static void tearDown() {
		driver.close();
	}

}
