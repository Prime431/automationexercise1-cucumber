package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Women > Tops']")
    WebElement blueTop;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men Tshirt']")
    WebElement menTshirts;
    @CacheLookup
    @FindBy(css = "tr[id='product-1'] td[class='cart_price'] p")
    WebElement price;
    @CacheLookup
    @FindBy(css = "tr[id='product-1'] button[class='disabled']")
    WebElement quantity;
    @CacheLookup
    @FindBy(css = "tr[id='product-1'] p[class='cart_total_price']")
    WebElement blueTopTotal;

    public String getTheBlueTopPrice() {

        String actualPrice = getTextFromElement(price);
        return actualPrice;
    }

    public void verifyBlueTopAvailableInCart() {
        verifyThatElementIsDisplayed(blueTop);
    }

    public String verifyBlueTopQuantity() {
        String actualQuantity = getTextFromElement(quantity);
        return actualQuantity;

    }

    public String getBlueTopTotal() {
        String actualTotal = getTextFromElement(blueTopTotal);
        return actualTotal;
    }

    public void verifySecondProductMenTshirtAvailableOrNot() {
        verifyThatElementIsDisplayed(menTshirts);
    }
}
