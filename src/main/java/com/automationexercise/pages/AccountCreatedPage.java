package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountCreatedPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountCreatedPage.class.getName());
    @CacheLookup
    @FindBy(css = "h2[class='title text-center'] b")
    WebElement accountCreatedText;

    @CacheLookup
    @FindBy(css = ".btn.btn-primary")
    WebElement continue1;

    public void verifyAccountCreatedTextIsVisble() {
        log.info("verifyAccountCreatedTextIsVisble: " + accountCreatedText.toString());
        verifyThatElementIsDisplayed(accountCreatedText);
    }

    public void clickOnContinue() {
        log.info("clickOnContinue: " + continue1.toString());
        clickOnElement(continue1);
    }

}
