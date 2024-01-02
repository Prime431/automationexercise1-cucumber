package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage extends Utility {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    @CacheLookup
    @FindBy(id = "susbscribe_email")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement subscribeSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//button[@id='subscribe']")
    WebElement arrowButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='disabled']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Proceed To Checkout')]")
    WebElement proceedToCheckout;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Cart is empty!']")
    WebElement emptyCart;

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public String verifySubscribeSuccessMessage() {
        return getTextFromElement(subscribeSuccessMessage);
    }
    public void clickOnArrowButton() {
        clickOnElement(arrowButton);
    }
    public String getActualQuantity() {
        String actualQuantity = getTextFromElement(quantity);
        return actualQuantity;
    }
    public String verifyCardPageIsDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        String actualUrl = getCurrentUrl();
        return actualUrl;
    }
    public void clickOnProceedToCheckout() {
        js.executeScript("arguments[0].click();", proceedToCheckout);
    }
    public void checkTheCartIsEmpty() {
        verifyThatElementIsDisplayed(emptyCart);
    }
}
