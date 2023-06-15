package com.Pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utilities.WebUtils;
import com.aventstack.extentreports.Status;

public class SearchCheckout extends WebUtils {

	@FindBy(xpath = "(//a[@class='us-link'])[1]")
	WebElement usa;

	@FindBy(xpath = "//input[@id='gh-search-input']")
	WebElement searchbox;

	@FindBy(xpath = "//button[@class='header-search-button']")
	WebElement magnifierbtn;

	@FindBy(linkText = "Sony - 65 Class BRAVIA XR X90K 4K HDR Full Array LED Google TV")
	WebElement SonyTV;

	@FindBy(xpath = "//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button' and @data-sku-id='6499801']")
	WebElement addtocart;

	@FindBy(xpath = "//span[@class='added-to-cart']")
	WebElement Added;

	@FindBy(linkText = "Go to Cart")
	WebElement GotoCart;

	@FindBy(xpath = "//button[@class ='c-close-icon c-modal-close-icon' and @type='button']")
	WebElement closebtn;

	@FindBy(xpath = "//button[@class ='btn btn-lg btn-block btn-primary' and @type='button']")
	WebElement checkout;

	@FindBy(xpath = "//button[@class ='c-button c-button-secondary c-button-lg cia-guest-content__continue guest' and @type='button']")
	WebElement guest;

	@FindBy(xpath = "//input[@id='user.emailAddress']")
	WebElement emailtextbox;

	@FindBy(xpath = "//input[@id='user.phone']")
	WebElement phonetextbox;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement continuepaymentbtn;

	@FindBy(xpath = "//input[@id='first-name']")
	WebElement firstnametextbox;

	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lastnametextbox;

	@FindBy(xpath = "//input[@id='number']")
	WebElement cardtextbox;

	@FindBy(xpath = "//input[@id='address-input']")
	WebElement addressinput;

	@FindBy(xpath = "//input[@id='city']")
	WebElement city;

	@FindBy(xpath = "//input[@id='postalCode']")
	WebElement zipcode;

	@FindBy(xpath = "//select[@id='state']")
	WebElement stateDropdown;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement placeorderbtn;

	public SearchCheckout() {
		PageFactory.initElements(WebUtils.driver, this);
	}

	public void search_AddToCart() {

		try {
			explicitWait(usa, 3);
			clickbutton(usa);
			explicitWait(searchbox, 3);
			sendkey(searchbox, "Sony - 65 Class BRAVIA XR X90K 4K HDR Full Array LED Google TV");
			explicitWait(magnifierbtn, 3);
			clickbutton(magnifierbtn);
			test.log(Status.INFO, "Selected Product Using SearchBox");
			explicitWait(addtocart, 3);
			clickbutton(addtocart);
			test.log(Status.INFO, "Product Added to Cart");
			explicitWait(Added, 3);
			String text = getText(Added);
			Assert.assertEquals("Added to cart", text);
			test.log(Status.PASS, "Shop by SearchBox Validation Succesfull");
		} catch (Exception e) {
			e.printStackTrace();
			test.log(Status.FAIL, "Shop by SearchBox Validation Failed");

		}
	}

	public void checkout_validation() {

		try {
			explicitWait(GotoCart, 3);
			clickbutton(GotoCart);
			explicitWait(closebtn, 3);
			clickbutton(closebtn);
			explicitWait(checkout, 3);
			clickbutton(checkout);
			explicitWait(guest, 3);
			clickbutton(guest);
			explicitWait(emailtextbox, 3);
			sendkey(emailtextbox, "kumar123@gmail.com");
			explicitWait(phonetextbox, 3);
			sendkey(phonetextbox, "9876543210");
			explicitWait(continuepaymentbtn, 3);
			clickbutton(continuepaymentbtn);
			explicitWait(firstnametextbox, 3);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void payment_validation() {

		try {
			explicitWait(firstnametextbox, 3);
			sendkey(firstnametextbox, "mounisha");
			explicitWait(lastnametextbox, 3);
			sendkey(lastnametextbox, "g");
			explicitWait(addressinput, 3);
			sendkey(addressinput, "123 main avenue st");
			explicitWait(city, 3);
			sendkey(city, "California ");
			explicitWait(zipcode, 3);
			sendkey(zipcode, "613501 ");
			selectDownVisible(stateDropdown, "CL");
			explicitWait(cardtextbox, 3);
			sendkey(cardtextbox, "123");
			explicitWait(placeorderbtn, 3);
			clickbutton(placeorderbtn);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
