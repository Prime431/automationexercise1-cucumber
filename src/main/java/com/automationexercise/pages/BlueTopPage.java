package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class BlueTopPage extends Utility {
    @CacheLookup
    @FindBy(css = "div[class='product-information'] h2")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    WebElement category;

    @CacheLookup
    @FindBy(css = "div[class='product-information'] span span")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'Availability:')]")
    WebElement availability;

    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'Condition:')]")
    WebElement condition;

    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'Brand:')]")
    WebElement brand;
@CacheLookup
@FindBy(id = "quantity")
WebElement quantity;

@CacheLookup
@FindBy(xpath = "//button[@type='button']")
WebElement addToCart;

    public void verifyProductNameText() throws InterruptedException {
        Thread.sleep(20);
        verifyThatElementIsDisplayed(productName);
    }

    public void verifyProductCategoryText() {
        verifyThatElementIsDisplayed(category);
    }

    public void verifyProductPriceText() {
        verifyThatElementIsDisplayed(price);
    }

    public void verifyavailabilityText() {
        verifyThatElementIsDisplayed(availability);
    }

    public void verifyProductConditionText() {
        verifyThatElementIsDisplayed(condition);
    }

    public void verifyProductBrandText() {
        verifyThatElementIsDisplayed(brand);
    }

    public String getBlueTopPageUrl() {
        waitUntilVisibilityOfElementLocated(By.cssSelector("div[class='product-information'] h2"), 10);
        String topPageUrl = getCurrentUrl();
        return topPageUrl;
    }
    public void selectQuantity(String qty){
        sendTextToElement(quantity,qty);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
}
