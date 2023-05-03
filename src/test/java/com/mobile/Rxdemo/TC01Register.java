package com.mobile.Rxdemo;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
//import Cobloc.delaplex.AndroidElement;
import io.appium.java_client.android.AndroidDriver;

public class TC01Register extends BaseClass {
	public AndroidDriver driver;
	
	@Test
	public void Register() throws MalformedURLException {
		
		
		//AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Account\"]")).click();
		
		//Basetest();
		
		//driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Account\"]")).click();
		
	}
	

}
