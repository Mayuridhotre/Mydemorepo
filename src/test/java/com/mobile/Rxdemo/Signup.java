package com.mobile.Rxdemo;

import java.time.Duration;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mobile.pageobjects.android.Signuppage;

import io.appium.java_client.android.AndroidDriver;

public class Signup extends BaseTest {
	
	
	@Test
	public  void Signup() {
		
		//Android App Package-com.rx.latestrxapp 
		//Android App Activity:com.rx.latestrxapp.view.activity.MainActivity
		
		//this.driver = driver;
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Signuppage signup = new Signuppage(driver);
		signup.setfirstname("Mayuri");
		
		
		//driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Account\"]")).click();
		//driver.findElement(By.id("com.rx.latestrxapp:id/tvSignUp")).click();
		//driver.findElement(By.id("com.rx.latestrxapp:id/edFName")).sendKeys("Mayuri");
		driver.findElement(By.id("com.rx.latestrxapp:id/edLName")).sendKeys("Dhotre");
		driver.findElement(By.id("com.rx.latestrxapp:id/edEmail")).sendKeys("mayuri.d.dhotre@gmail.com");
		driver.findElement(By.id("com.rx.latestrxapp:id/edMobile")).sendKeys("8080494307");
		driver.findElement(By.id("com.rx.latestrxapp:id/edPassword")).sendKeys("Test@123");
		driver.findElement(By.id("com.rx.latestrxapp:id/spCountry")).click();
		driver.findElement(By.id("com.rx.latestrxapp:id/search_field")).sendKeys("india");
		driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
		driver.findElement(By.id("com.rx.latestrxapp:id/spStates")).click();
		
		
		driver.findElement(By.id("com.rx.latestrxapp:id/spCity")).click();
	
	}

	
	
}
