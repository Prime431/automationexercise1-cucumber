package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoggedInPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoggedInPage.class.getName());
    @CacheLookup
    @FindBy(css = "div.header-middle div.container div.row div.col-sm-8 div.shop-menu.pull-right ul.nav.navbar-nav li:nth-child(5) > a:nth-child(1)")
    WebElement deleteAccount;

    @CacheLookup
    @FindBy(css = "li:nth-child(10) a:nth-child(1)")
    WebElement loggedInText;

    @CacheLookup
    @FindBy(css = ".btn.btn-primary")
    WebElement continue2;

    @CacheLookup
    @FindBy(css = "a[href='/logout']")
    WebElement logOut;


    public void clickONDeleteAccount() {
        log.info("clickONDeleteAccount: " + deleteAccount.toString());
        clickOnElement(deleteAccount);
    }

    public void verifyLoggedInAsUserIsVisible() {
        log.info("verifyLoggedInAsUserIsVisible: " + loggedInText.toString());
        verifyThatElementIsDisplayed(loggedInText);
    }

    public void verifyDeleteAccountButtonIsVisible() {
        log.info("verifyDeleteAccountButtonIsVisible: " + deleteAccount.toString());
        verifyThatElementIsDisplayed(deleteAccount);
    }

    public void clickOnContinueDeleteButton() {
        log.info("clickOnContinueDeleteButton: " + continue2.toString());
        clickOnElement(continue2);
    }

    public void clickOnLogOutButton() {
        log.info("clickOnLogOutButton: " + logOut.toString());
        clickOnElement(logOut);
    }
}
