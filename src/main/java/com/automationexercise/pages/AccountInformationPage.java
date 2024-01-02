package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountInformationPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountInformationPage.class.getName());
    @CacheLookup
    @FindBy(css = "body > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h2:nth-child(1) > b:nth-child(1)")
    WebElement enterAccountInformationText;
    @CacheLookup
    @FindBy(id = "id_gender1")
    WebElement mrTitleCheckBox;
    @CacheLookup
    @FindBy(id = "password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "days")
    WebElement day;

    @CacheLookup
    @FindBy(id = "months")
    WebElement months;

    @CacheLookup
    @FindBy(id = "years")
    WebElement year;

    @CacheLookup
    @FindBy(id = "optin")
    WebElement receiveSpecialOffers;

    @CacheLookup
    @FindBy(id = "newsletter")
    WebElement newsLetterCheckbox;
    @CacheLookup
    @FindBy(id = "first_name")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "last_name")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "company")
    WebElement company;
    @CacheLookup
    @FindBy(id = "address1")
    WebElement address;
    @CacheLookup
    @FindBy(id = "address2")
    WebElement address2;

    @CacheLookup
    @FindBy(id = "country")
    WebElement country;
    @CacheLookup
    @FindBy(id = "state")
    WebElement state;
    @CacheLookup
    @FindBy(id = "city")
    WebElement city;
    @CacheLookup
    @FindBy(id = "zipcode")
    WebElement zipCode;
    @CacheLookup
    @FindBy(id = "mobile_number")
    WebElement mobileNumber;
    @CacheLookup
    @FindBy(css = "button[data-qa=\"create-account\"]")
    WebElement createAccount;
    @CacheLookup
    @FindBy(css = "h2[class='title text-center'] b")
    WebElement accountCreatedText;


    public void verifyEnterAccountInformationText(String message) {
        log.info("verifyEnterAccountInformationText: " + enterAccountInformationText.toString());
        Assert.assertEquals(getTextFromElement(enterAccountInformationText), message, "Error");
    }

    public void selectingMrTitle(String title) {
        log.info("selectingMrTitle: " + mrTitleCheckBox.toString());
        clickOnElement(mrTitleCheckBox);
    }

    public void enterPassword(String password) {
        log.info("enterPassword: " + this.password.toString());
        sendTextToElement(this.password, password);
    }

    public void selectDay(String day) {
        log.info("selectDay: " + this.day.toString());
        selectByValueFromDropDown(this.day, day);
    }

    public void selectMonth(String month) {
        log.info("selectMonth: " + this.months.toString());
        selectByVisibleTextFromDropDown(this.months, month);
    }

    public void selectYear(String year) {
        log.info("selectYear: " + this.year.toString());
        selectByValueFromDropDown(this.year, year);
    }

    public void selectReceiveSpecialOffers() {
        log.info("selectReceiveSpecialOffers: " + receiveSpecialOffers.toString());
        clickOnElement(receiveSpecialOffers);
    }

    public void clickOnSignUpForOurNewsletter() {
        log.info("clickOnSignUpForOurNewsletter: " + newsLetterCheckbox.toString());
        clickOnElement(newsLetterCheckbox);
    }

    public void enterFirstName(String firstName) {
        log.info("enterFirstName: " + this.firstName.toString());
        sendTextToElement(this.firstName, firstName);
    }

    public void enterLastName(String lastName) {
        log.info("enterLastName: " + this.lastName.toString());
        sendTextToElement(this.lastName, lastName);
    }

    public void enterCompanyName(String company) {
        log.info("enterCompanyName: " + this.company.toString());
        sendTextToElement(this.company, company);
    }

    public void enterAddressFirstLine(String address) {
        log.info("enterAddressFirstLine: " + this.address.toString());
        super.sendTextToElement(this.address, address);
    }

    public void enterAddress2(String address2) {
        log.info("enterAddress2: " + this.address2.toString());
        sendTextToElement(this.address2, address2);
    }

    public void selectCountry(String country) {
        log.info("selectCountry: " + this.country.toString());
        selectByVisibleTextFromDropDown(this.country, country);
    }

    public void enterState(String state) {
        log.info("enterState: " + this.state.toString());
        sendTextToElement(this.state, state);
    }

    public void enterCity(String city) {
        log.info("enterCity: " + this.city.toString());
        sendTextToElement(this.city, city);
    }

    public void enterZipCode(String zipcode) {
        log.info("enterZipCode: " + this.zipCode.toString());
        sendTextToElement(this.zipCode, zipcode);
    }

    public void enterMobileNumber(String mobileNumber) {
        log.info("enterMobileNumber: " + this.mobileNumber.toString());
        sendTextToElement(this.mobileNumber, mobileNumber);
    }

    public void clickOnCreateAccount() {
        waitUntilVisibilityOfElementLocated(By.xpath("//button[normalize-space()='Create Account']"), 10);
        log.info("clickOnCreateAccount: " + createAccount.toString());
        clickOnElement(createAccount);
    }

    public void verifyAccountCreatedtext(String message) {
        log.info("verifyAccountCreatedtext: " + accountCreatedText.toString());
        Assert.assertEquals(getTextFromElement(accountCreatedText), message, "Error");

    }
}
