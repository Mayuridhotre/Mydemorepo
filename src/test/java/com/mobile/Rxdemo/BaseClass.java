package com.mobile.Rxdemo;

import java.io.File;



import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidOptions.u
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;


public class BaseClass {
	
	 public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void Basetest() throws MalformedURLException, InterruptedException{
		
			
		
		 service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\DELL\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723)//.withEnvironment(env)//I added this line
				.build();
		
		service.start();
		//DesiredCapabilities cap = new DesiredCapabilities();
	    //cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,30);	
		
		//C:\Users\MayuriDhotre\AppData\Roaming\npm\node_modules\appium\build\lib
		UiAutomator2Options options =  new UiAutomator2Options();
		options.setDeviceName("Redmi7");
		options.setApp("C:\\Users\\DELL\\eclipse-workspace\\Rxdemo\\src\\test\\java\\resources\\Rx App-13.apk");
		
		driver = new  AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(8000);
		
		//driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Account\"]")).click();
		
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Register']")).click();
		//driver.quit();
		//service.stop();
		
		
		
		
		 
		}
		 
		@AfterClass
		public void teadown() {
			driver.quit();
			service.stop();
			
		}
		
		
}
		
		
		
	


