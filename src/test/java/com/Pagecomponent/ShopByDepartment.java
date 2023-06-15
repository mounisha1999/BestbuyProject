package com.Pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.Utilities.WebUtils;
import com.aventstack.extentreports.Status;

public class ShopByDepartment extends WebUtils {

    @FindBy(xpath = "(//a[@class='us-link'])[1]")
    WebElement usa;

    @FindBy(xpath = "//button[@data-t='hamburger-navigation-button']")
    WebElement hamburgerbtn;

    @FindBy(xpath = "//button[@data-id='node-532']")
    WebElement audio;
    
    @FindBy(xpath = "//button[@data-id='node-501']")
    WebElement headphones;

    @FindBy(linkText = "AirPods")
    WebElement airPods;

    @FindBy(xpath = "//button[@type='button' and @data-sku-id='4900964']")
    WebElement depAddToCart;

    @FindBy(xpath = "//span[@class='added-to-cart']")
    WebElement addedToCart;

    public ShopByDepartment() {
        PageFactory.initElements(WebUtils.driver, this);
    }

    public void shopByDepartmentOtherItem() {

        try {
            explicitWait(usa, 2);
            clickbutton(usa);
            explicitWait(hamburgerbtn, 3);
            clickbutton(hamburgerbtn);
            test.log(Status.INFO, "Navigated to Menu");
            explicitWait(audio, 2);
            clickbutton(audio);
            test.log(Status.INFO, "Selected Audio department");
            explicitWait(headphones, 2);
            clickbutton(headphones);
            explicitWait(airPods, 3);
            clickbutton(airPods);
            explicitWait(depAddToCart, 3);
            clickbutton(depAddToCart);
            test.log(Status.INFO, "Product added to cart");
            explicitWait(addedToCart, 3);
            String text = getText(addedToCart);
            Assert.assertEquals("Added to cart", text);
            test.log(Status.PASS, "Shop by Department Validation Successful");

        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Shop by Department Validation Failed");
        }
}

}
