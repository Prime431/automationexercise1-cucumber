package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    WebElement newUserSignUpText;

    @CacheLookup
    @FindBy(css = "input[placeholder='Name']")
    WebElement name;

    @CacheLookup
    @FindBy(css = "input[data-qa='signup-email']")
    WebElement emailAddress;

    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Signup'])[1]")
    WebElement signUpButton;

    @CacheLookup
    @FindBy(css = "div[class='login-form'] h2")
    WebElement loginToYourAccountText;
    @CacheLookup
    @FindBy(css = "button[data-qa='login-button']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(css = "input[data-qa='login-email']")
    WebElement email;

    @CacheLookup
    @FindBy(css = "input[placeholder='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(css = "body > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > p:nth-child(4)")
    WebElement psswordIncorrectText;


    public void checkEmailOrPasswordIsIncorrectText() {
        verifyThatElementIsDisplayed(psswordIncorrectText);
    }

    public void checkTheTextNewUserSignUpAvailableOrNot() {
        log.info("checkTheTextNewUserSignUpAvailableOrNot: " + newUserSignUpText.toString());
        verifyThatTextIsDisplayed(newUserSignUpText, "New User Signup!");
    }

    public void enterNameOnNewUserSignUp(String name) {
        log.info("enterNameOnNewUserSignUp: " + this.name.toString());
        sendTextToElement(this.name, name);
    }

    public void enterEmailAddressOnNewUserSignUp(String email) {
        log.info("enterEmailAddressOnNewUserSignUp: " + emailAddress.toString());
        sendTextToElement(emailAddress, email);
    }

    public void clickOnSignUpButton() {
        log.info("clickOnSignUpButton: " + signUpButton.toString());
        clickOnElement(signUpButton);
    }

    public void getLoginToYourAccountText() {
        log.info("getLoginToYourAccountText: " + loginToYourAccountText.toString());
        Assert.assertEquals(getTextFromElement(loginToYourAccountText), "Login to your account");
    }

    public void clickOnLoginButton() {
        log.info("clickOnLoginButton: " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public void enterEmailId(String email) {
        log.info("enterEmailId :" + this.email.toString());
        sendTextToElement(this.email, email);
    }

    public void enterPassword(String password) {
        log.info("enterPassword: " + this.password.toString());
        sendTextToElement(this.password, password);
    }
}
