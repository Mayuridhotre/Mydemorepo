package com.mobile.Rxdemo;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;
//import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Service;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void Appiumtest() throws MalformedURLException {
		
		 service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\DELL\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723)//.withEnvironment(env)//I added this line
				.build();
		
		service.start();
		UiAutomator2Options options =  new UiAutomator2Options();
		options.setDeviceName("Redmi7");
		options.setApp("C:\\Users\\DELL\\eclipse-workspace\\Rxdemo\\src\\test\\java\\resources\\Rx App-13.apk");
		options.setCapability("appPackage", "com.rx.latestrxapp");
		options.setCapability("locationContextEnabled", true );
		//appium:appPackage: com.rx.latestrxapp
		
	    driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		//iver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
		//driver.findElement(By.xpath("//android.widget.Button[@text='Allow']")).click();
		
	}

	public void teardown() {
		
		driver.close();
		service.stop();
		
	}
}
