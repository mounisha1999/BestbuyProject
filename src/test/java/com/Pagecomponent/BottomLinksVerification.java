package com.Pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utilities.WebUtils;

public class BottomLinksVerification extends WebUtils {

	@FindBy(xpath = "(//a[@class='us-link'])[1]")
	WebElement usa;

	@FindBy(linkText = "Accessibility")
	WebElement Accessibility;

	@FindBy(linkText = "Terms & Conditions")
	WebElement TermsConditions;

	@FindBy(linkText = "Privacy")
	WebElement Privacy;

	@FindBy(linkText = "Interest-Based Ads")
	WebElement InterestBasedAds;

	@FindBy(linkText = "State Privacy Rights")
	WebElement StatePrivacyRights;

	@FindBy(linkText = "CA Do Not Sell/Share My Personal Information")
	WebElement MyPersonalInformation;

	@FindBy(linkText = "Limit Use of My Sensitive Personal Information")
	WebElement MySensitivePersonalInformation;

	@FindBy(linkText = "Targeted Advertising Opt Out")
	WebElement Advertising;

	@FindBy(linkText = "CA Supply Chain Transparency Act")
	WebElement Transparency;

	public BottomLinksVerification() {
		PageFactory.initElements(WebUtils.driver, this);
	}

	public void Accessibility_Bottom_Link() {
		try {
			explicitWait(usa, 3);
			clickbutton(usa);
			explicitWait(Accessibility, 3);
			clickbutton(Accessibility);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Accessibility - Best Buy", title);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void Terms_Conditions_Bottom_Link() {
		try {
			explicitWait(TermsConditions, 3);
			clickbutton(TermsConditions);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("BestBuy.com Terms and Conditions", title);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void Privacy_Bottom_Link() {
		try {
			explicitWait(Privacy, 3);
			clickbutton(Privacy);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Privacy Policy Hub - Best Buy", title);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void Interest_Based_Ads_Bottom_Link() {
		try {
			explicitWait(InterestBasedAds, 3);
			clickbutton(InterestBasedAds);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Interest-Based Ads - Best Buy", title);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void State_Privacy_Rights_Bottom_Link() {
		try {
			explicitWait(StatePrivacyRights, 3);
			clickbutton(StatePrivacyRights);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("State Privacy Rights - Best Buy", title);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void Transparency_Bottom_Link() {
		try {
			explicitWait(Transparency, 3);
			clickbutton(Transparency);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("California Supply Chain Transparency Act - Best Buy", title);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void My_PersonalInformation_Bottom_Link() {
		try {
			explicitWait(MyPersonalInformation, 3);
			clickbutton(MyPersonalInformation);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Start Request - Best Buy", title);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void My_SensitiveInformation_Bottom_Link() {
		try {
			implicitWait(3);
			navigateBackward();
			explicitWait(MySensitivePersonalInformation, 3);
			clickbutton(MySensitivePersonalInformation);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Best Buy", title);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void Advertising_Bottom_Link() {
		try {
			implicitWait(3);
			navigateBackward();
			explicitWait(Advertising, 3);
			clickbutton(Advertising);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Start Request - Best Buy", title);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
