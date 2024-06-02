package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserSignupPage extends PageBase
{
	public UserSignupPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath="//*[@id='form']/div/div/div[3]/div/form/input[2]")
	WebElement nameTxtBox ;

	@FindBy(xpath="//*[@id='form']/div/div/div[3]/div/form/input[3]")
	WebElement emailTxtBox ;

	@FindBy(xpath="//*[@id='form']/div/div/div[3]/div/form/button")
	WebElement registerBtn ;

	@FindBy(name="password")
	public WebElement passwordTxtBox ;
	@FindBy(id="address1")
	public WebElement addressTxtBox1 ;

	@FindBy(id="address2")
	public WebElement addressTxtBox2 ;

	@FindBy(id="state")
	public WebElement stateTxtBox ;

	@FindBy(id="city")
	public WebElement cityTxtBox ;

	@FindBy(id="zipcode")
	public WebElement zipcodeTxtBox ;

	@FindBy(id="mobile_number")
	public WebElement mobile_numberTxtBox ;

	@FindBy(css="input#first_name")
	public WebElement firstnameTxtBox;

	@FindBy(css="input#last_name")
	public WebElement lasttnameTxtBox;
	@FindBy(xpath="//button[1]")
	WebElement createAccount;
	@FindBy(xpath="//*[@id='form']/div/div/div/div/a")
	WebElement cont;

	public void userRegistration(String name ,  String email , String password,String fname,String lname,String address,String state,String city,String zipcode,String mobile) throws InterruptedException {
		setTextElementText(nameTxtBox, name);
		setTextElementText(emailTxtBox, email);
		clickButton(registerBtn);
		setTextElementText(passwordTxtBox, password);
		setTextElementText(firstnameTxtBox, fname);
		setTextElementText(lasttnameTxtBox, lname);
		setTextElementText(addressTxtBox1, address);
		setTextElementText(addressTxtBox2, address);
		setTextElementText(zipcodeTxtBox, zipcode);
		setTextElementText(cityTxtBox, city);
		setTextElementText(stateTxtBox, state);
		setTextElementText(mobile_numberTxtBox, mobile);
		Thread.sleep(4000);
		clickButton(createAccount);
		clickButton(cont);
		Thread.sleep(1000);
	}


}
