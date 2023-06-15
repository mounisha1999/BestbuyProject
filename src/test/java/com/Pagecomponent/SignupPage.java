package com.Pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.WebUtils;

public class SignupPage extends WebUtils {

	@FindBy(xpath = "(//a[@class='us-link'])[1]")
	WebElement usa;

	@FindBy(linkText = "Create Account")
	WebElement createaccount;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastname;

	@FindBy(xpath = "//input[@id='email']")
	WebElement Emailaddress;

	@FindBy(xpath = "//input[@id='fld-p1']")
	WebElement Createaccountpassword;

	@FindBy(xpath = "//input[@id='reenterPassword']")
	WebElement confirmpassword;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement createphonenumber;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement createaccountsubmit;

	@FindBy(xpath = "//span[@class='welcome-banner__user-name']")
	WebElement Welcomebanner;

	public SignupPage() {
		PageFactory.initElements(WebUtils.driver, this);
	}

	public void create_Account(String first, String last, String email, String password, String conformpassword,
			String phone) {

		try {
			explicitWait(usa, 3);
			clickbutton(usa);
			explicitWait(createaccount, 3);
			clickbutton(createaccount);
			explicitWait(firstname, 3);
			sendkey(firstname, first);
			explicitWait(lastname, 3);
			sendkey(lastname, last);
			explicitWait(Emailaddress, 3);
			sendkey(Emailaddress, email);
			explicitWait(Createaccountpassword, 3);
			sendkey(Createaccountpassword, password);
			explicitWait(confirmpassword, 3);
			sendkey(confirmpassword, conformpassword);
			explicitWait(createphonenumber, 3);
			sendkey(createaccountsubmit, phone);
			clickbutton(createaccountsubmit);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
