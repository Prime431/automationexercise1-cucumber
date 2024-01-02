package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Women - Dress Products')]")
    WebElement womenDressProductsText;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='title text-center']")
    WebElement menShirtsProducts;

    public String getWomenDressProductsText() {
        String at = getTextFromElement(womenDressProductsText);
        return at;
    }

    public String getMenThsirtsProductText() {
        String at = getTextFromElement(menShirtsProducts);
        return at;
    }
}