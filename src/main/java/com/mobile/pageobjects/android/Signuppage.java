package com.mobile.pageobjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Signuppage {
	
	AndroidDriver driver;
	
	public Signuppage(AndroidDriver driver)
	{
		//super(driver);
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	
	@AndroidFindBy(xpath ="//android.widget.FrameLayout[@content-desc=\"Account\"]")
	public WebElement accountbutton;
	
	@AndroidFindBy(id ="com.rx.latestrxapp:id/tvSignUp")
	public WebElement signupbutton;
	
	@AndroidFindBy(id ="com.rx.latestrxapp:id/edFName")
	private WebElement firstname;
	
	public void setfirstname(String Fname)
	
	{
		accountbutton.click();
		signupbutton.click();
		firstname.sendKeys(Fname);
		
		
	}
	
	
		
		
	

}
