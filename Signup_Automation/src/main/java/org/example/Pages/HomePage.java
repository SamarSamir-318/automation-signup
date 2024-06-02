package org.example.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase
{
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="li:nth-child(4) > a")
	WebElement registerLink ; 

	public void openRegistrationPage() 
	{
		clickButton(registerLink);
	}


}
