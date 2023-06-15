package com.Pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Utilities.WebUtils;

public class HomeMenu extends WebUtils {

	@FindBy(xpath = "(//a[@class='us-link'])[1]")
	WebElement usa;

	@FindBy(linkText = "Top Deals")
	WebElement TopDeals;

	@FindBy(linkText = "Deal of the Day")
	WebElement DealoftheDay;

	@FindBy(linkText = "Totaltech Membership")
	WebElement TotaltechMembership;

	@FindBy(linkText = "Credit Cards")
	WebElement CreditCards;

	@FindBy(linkText = "Gift Cards")
	WebElement GiftCards;

	@FindBy(xpath = "//button[@data-lid='hdr_utility_more']")
	WebElement more;

	@FindBy(linkText = "Gift Ideas")
	WebElement GiftIdeas;

	@FindBy(linkText = "Health & Wellness")
	WebElement HealthWellness;

	@FindBy(linkText = "Best Buy Outlet")
	WebElement BestBuyOutlet;

	@FindBy(linkText = "Best Buy Business")
	WebElement BestBuyBusiness;

	public HomeMenu() {
		PageFactory.initElements(WebUtils.driver, this);
	}

	public void TopDeals() {
		try {
			explicitWait(usa, 3);
			clickbutton(usa);
			explicitWait(TopDeals, 3);
			clickbutton(TopDeals);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Top Deals and Featured Offers on Electronics - Best Buy", title);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void DealoftheDay() {
		try {
			explicitWait(DealoftheDay, 3);
			clickbutton(DealoftheDay);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Deal of the Day: Electronics Deals - Best Buy", title);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void TotaltechMembership() {
		try {

			explicitWait(TotaltechMembership, 3);
			clickbutton(TotaltechMembership);
			implicitWait(3);
			String title = getTitle();
			Assert.assertTrue(title.contains("Best Buy Totaltech"));
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void CreditCards() {
		try {

			explicitWait(CreditCards, 3);
			clickbutton(CreditCards);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Best Buy Credit Card: Rewards & Financing", title);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void BestBuyOutlet() {
		try {
			explicitWait(BestBuyOutlet, 3);
			clickbutton(BestBuyOutlet);
			implicitWait(3);
			String title = getTitle();
			Assert.assertTrue(title.contains("Best Buy Outlet: Clearance Electronics Outlet"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void GiftCards() {
		try {

			explicitWait(GiftCards, 3);
			clickbutton(GiftCards);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Gifts Cards and E-Gift Cards - Best Buy", title);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void GiftIdeas() {
		try {
			explicitWait(more, 3);
			clickbutton(more);
			explicitWait(GiftIdeas, 3);
			clickbutton(GiftIdeas);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy", title);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void HealthWellness() {
		try {

			explicitWait(more, 3);
			clickbutton(more);
			explicitWait(HealthWellness, 3);
			clickbutton(HealthWellness);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Health & Wellness Solutions & Technology - Best Buy", title);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void BestBuyBusiness() {
		try {

			explicitWait(more, 3);
			clickbutton(more);
			explicitWait(BestBuyBusiness, 3);
			clickbutton(BestBuyBusiness);
			implicitWait(3);
			String title = getTitle();
			Assert.assertEquals("Best Buy for Business - Best Buy", title);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
