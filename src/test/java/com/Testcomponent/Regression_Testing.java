package com.Testcomponent;

import org.testng.annotations.Test;

import com.Basecomponent.BaseClass;
import com.Pagecomponent.BottomLinksVerification;
import com.Pagecomponent.HomeMenu;
import com.Pagecomponent.LoginCredentials;
import com.Pagecomponent.SearchCheckout;
import com.Pagecomponent.ShopByBrand;
import com.Pagecomponent.ShopByDepartment;
import com.Pagecomponent.SignupPage;

public class Regression_Testing extends BaseClass {

//Check if the user is able to login with valid User name and Password
	@Test
	public void valid_username_Password() {
		try {
			LoginCredentials log = new LoginCredentials();
			log.Sing_In(readProperty("ValidUsername"), readProperty("Validpassword"));
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

	// User will not be able to login with Invalid Username and Password
	@Test
	public void inValidUsername_InvalidPassword() {
		try {
			LoginCredentials log = new LoginCredentials();
			log.Sing_In(readProperty("InvalidUsername"), readProperty("Invalidpassword"));
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	// User will not be able to login with Invalid Username and Password
	@Test
	public void validUsername_InvalidPassword() {
		try {
			LoginCredentials log = new LoginCredentials();
			log.Sing_In(readProperty("ValidUsername"), readProperty("Invalidpassword"));
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	// User will not be able to login with Invalid Username and ValidPassword
	@Test
	public void inValidUsername_validPassword() {
		try {
			LoginCredentials log = new LoginCredentials();
			log.Sing_In(readProperty("InvalidUsername"), readProperty("Validpassword"));
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Test
	public void blank_Username_Password() {
		try {
			LoginCredentials log = new LoginCredentials();
			log.Sing_In(readProperty(" "), readProperty(" "));
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

	// Signing with valid credentials
	@Test
	public void valid_Login_Credentials_To_Signup() {
		SignupPage sign = new SignupPage();
		sign.create_Account(readProperty("first"), readProperty("last"), readProperty("email"),
				readProperty("password"), readProperty("password"), readProperty("phone"));
	}

	// Signing with invalid credentials
	@Test
	public void invalid_Login_Credentials_To_Signup() {
		SignupPage sign = new SignupPage();
		sign.create_Account(readProperty("phone"), readProperty("email"), readProperty("password"),
				readProperty("email"), readProperty("last"), readProperty("password"));
	}

	@Test
	public void All_Menu_validation() {
		try {
			HomeMenu obj1 = new HomeMenu();
			obj1.TopDeals();
			obj1.DealoftheDay();
			obj1.TotaltechMembership();
			obj1.CreditCards();
			obj1.GiftCards();
			obj1.GiftIdeas();
			obj1.HealthWellness();
			obj1.BestBuyOutlet();
			obj1.BestBuyBusiness();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void shop_by_Department() {
		try {
			ShopByDepartment department = new ShopByDepartment();
			department.shopByDepartmentOtherItem();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void shop_by_Brand() {
		try {
			ShopByBrand brand = new ShopByBrand();
			brand.shop_by_brand();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void bottom_Links_Validation() {
		try {
			BottomLinksVerification linkverification = new BottomLinksVerification();
			linkverification.Accessibility_Bottom_Link();
			linkverification.Terms_Conditions_Bottom_Link();
			linkverification.Privacy_Bottom_Link();
			linkverification.Interest_Based_Ads_Bottom_Link();
			linkverification.State_Privacy_Rights_Bottom_Link();
			linkverification.Transparency_Bottom_Link();
			linkverification.My_PersonalInformation_Bottom_Link();
			linkverification.My_SensitiveInformation_Bottom_Link();
			linkverification.Advertising_Bottom_Link();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void search_Box_Validation() {
		try {
			SearchCheckout searchcheck = new SearchCheckout();
			searchcheck.search_AddToCart();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void searchpaymentValidation() {

		try {
			SearchCheckout obj2 = new SearchCheckout();
			obj2.search_AddToCart();
			obj2.checkout_validation();
			obj2.payment_validation();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
