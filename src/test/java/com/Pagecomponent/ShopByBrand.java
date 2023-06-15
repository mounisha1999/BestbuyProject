package com.Pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.WebUtils;

public class ShopByBrand extends WebUtils {

	@FindBy(xpath = "(//a[@class='us-link'])[1]")
	WebElement usa;

	@FindBy(xpath = "//button[@data-t='hamburger-navigation-button']")
	WebElement hamburgerbtn;

	@FindBy(xpath = "//button[@data-id='node-87']")
	WebElement brand;

	@FindBy(linkText = "Sony")
	WebElement sony;

	@FindBy(linkText = "Sony cameras")
	WebElement sonycamera;

	@FindBy(linkText = "Sony - ZV-1F Vlog Camera for Content Creators and Vloggers - Black")
	WebElement camera;

	@FindBy(xpath = "//button[@data-sku-id='6522416']")
	WebElement brandadd2cart;

	public ShopByBrand() {
		PageFactory.initElements(WebUtils.driver, this);
	}

	public void shop_by_brand() {

		try {
			explicitWait(usa, 3);
			clickbutton(usa);
			explicitWait(hamburgerbtn, 3);
			clickbutton(hamburgerbtn);
			explicitWait(brand, 3);
			clickbutton(brand);
			explicitWait(sony, 3);
			clickbutton(sony);
			explicitWait(sonycamera, 3);
			clickbutton(sonycamera);
			explicitWait(camera, 3);
			clickbutton(camera);
			explicitWait(brandadd2cart, 3);
			clickbutton(brandadd2cart);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
