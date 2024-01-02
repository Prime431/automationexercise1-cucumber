package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.java.Log;
import org.apache.poi.ss.formula.functions.DProduct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.automationexercise.browserfactory.ManageBrowser.driver;

public class RegisterUserSteps {
    @Given("I launch the browser")
    public void iLaunchTheBrowser() {
    }

    @And("I open the URL")
    public void iOpenTheURL() {
    }

    @And("I verify that home page visible successfully")
    public void iVerifyThatHomePageVisibleSuccessfully() {
        Assert.assertTrue(new HomePage().verifyHomeButtonAvailability());
    }

    @When("I click on {string} button")
    public void iClickOnButton(String button) {
        new ContactusPage().clickOnHomeButton(button);
    }
    @And("I verify {string} is visible")
    public void iVerifyIsVisible(String newUserSignUpText) {
        new LoginPage().checkTheTextNewUserSignUpAvailableOrNot();
    }
    @And("I Enter name {string} and email{string} address")
    public void iEnterNameAndEmailAddress(String name, String email) {
        new LoginPage().enterNameOnNewUserSignUp(name);
        new LoginPage().enterEmailAddressOnNewUserSignUp(email);
    }

    @And("I Fill details: Title {string}, Name , Email, Password {string}, Date of birth Day {string} Month {string} Year {string}")
    public void iFillDetailsTitleNameEmailPasswordDateOfBirthDayMonthYear(String title, String password, String day, String month, String year) {
        new AccountInformationPage().selectingMrTitle(title);
        new AccountInformationPage().enterPassword(password);
        new AccountInformationPage().selectDay(day);
        new AccountInformationPage().selectMonth(month);
        new AccountInformationPage().selectYear(year);

    }

    @And("I  Fill details: First name, Last name, Company, Address, Address{int}, Country, State, City, Zipcode, Mobile Number")
    public void iFillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(int arg0) {
        new AccountInformationPage().enterFirstName("Manish");
        new AccountInformationPage().enterLastName("Patel");
        new AccountInformationPage().enterCompanyName("Heera");
        new AccountInformationPage().enterAddressFirstLine("Turton Road");
        new AccountInformationPage().selectCountry("India");
        new AccountInformationPage().enterState("Gujarat");
        new AccountInformationPage().enterCity("Navsari");
        new AccountInformationPage().enterZipCode("823 343");
        new AccountInformationPage().enterMobileNumber("8728728732");
    }


    @And("I Verify that ACCOUNT CREATED! is visible")
    public void iVerifyThatACCOUNTCREATEDIsVisible() {
        new AccountCreatedPage().verifyAccountCreatedTextIsVisble();
    }

    @And("I Click Continue button")
    public void iClickContinueButton() {
        new AccountCreatedPage().clickOnContinue();
    }

    @And("I Verify that Logged in as username is visible")
    public void iVerifyThatLoggedInAsUsernameIsVisible() {
        new LoggedInPage().verifyLoggedInAsUserIsVisible();
    }

    @Then("I Click Delete Account button")
    public void iClickDeleteAccountButton() {
        new LoggedInPage().clickONDeleteAccount();
    }

    @And("I Click Signup button")
    public void iClickSignupButton() {
        new LoginPage().clickOnSignUpButton();
    }

    @And("I Verify that ENTER ACCOUNT INFORMATION is visible")
    public void iVerifyThatENTERACCOUNTINFORMATIONIsVisible() {
        new AccountInformationPage().verifyEnterAccountInformationText("ENTER ACCOUNT INFORMATION");
    }

    @And("I Select checkbox Sign up for our newsletter!")
    public void iSelectCheckboxSignUpForOurNewsletter() {
        new AccountInformationPage().clickOnSignUpForOurNewsletter();
    }

    @And("I Select checkbox Receive special offers from our partners!")
    public void iSelectCheckboxReceiveSpecialOffersFromOurPartners() {
        new AccountInformationPage().selectReceiveSpecialOffers();
    }

    @And("I  Click Create Account button")
    public void iClickCreateAccountButton() {
        new AccountInformationPage().clickOnCreateAccount();
    }

    @And("I Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void iVerifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        new LoggedInPage().verifyDeleteAccountButtonIsVisible();
        new LoggedInPage().clickOnContinueDeleteButton();
    }


    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Given("I verify Login to your account is visible")
    public void iVerifyLoginToYourAccountIsVisible() {
        new LoginPage().getLoginToYourAccountText();
    }

    @And("I verify error your email or password is incorrect! is visible")
    public void iVerifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        new LoginPage().checkEmailOrPasswordIsIncorrectText();
    }

    @And("I Enter incorrect email {string} address and password {string}")
    public void iEnterIncorrectEmailAddressAndPassword(String email, String password) {
        new LoginPage().enterEmailId(email);
        new LoginPage().enterPassword(password);
    }
    @And("I verify that user is navigated to login page")
    public void iVerifyThatUserIsNavigatedToLoginPage() {
        new HomePage().verifyUserIsNavigateToLoginPage();
    }


    @And("I enter Correct Email {string} address and Password {string}")
    public void iEnterCorrectEmailAddressAndPassword(String email, String password) {
        new LoginPage().enterEmailId(email);
        new LoginPage().enterPassword(password);
    }

    @And("I Enter name {string} and already registered email {string} address")
    public void iEnterNameAndAlreadyRegisteredEmailAddress(String name, String email) {
        new LoginPage().enterNameOnNewUserSignUp(name);
        new LoginPage().enterEmailAddressOnNewUserSignUp(email);
    }

    @And("I should see error message Email address already exist!")
    public void iShouldSeeErrorMessageEmailAddressAlreadyExist() {
        new HomePage().verifyEmailAddressAlreadyExistTextWhenEnterExistingEmail();
    }

    @And("I Verify {string} is visible")
    public void iVerifyGETINTOUCHIsVisible(String getInTouch) {
        new ContactusPage().verifyGetInTouchText();
    }
    @And("I Upload file")
    public void iUploadFile() {
        new ContactusPage().uploadFile();
    }
    @When("I click on a {string} button")
    public void iClickOnAButton(String contactUs) {
        new HomePage().clickOnContactUsButton();
    }

    @And("I Enter {string}, {string}, {string} and {string}")
    public void iEnterAnd(String name, String email, String subject, String message) {
        new ContactusPage().enterName(name);
        new ContactusPage().enterEmail(email);
        new ContactusPage().enterSubject(subject);
        new ContactusPage().enterMessage(message);
    }

    @Then("I click on Submit button")
    public void iClickOnSubmitButton() {
        new ContactusPage().clickOnSubmitButton();
    }

    @And("I click on OK button")
    public void iClickOnOKButton() {
        new ContactusPage().acceptAlert();
    }

    @And("I verify success message {string} is visible")
    public void iVerifySuccessMessageIsVisible(String message) {
        new ContactusPage().verifyTheSuceesMessage();
    }

    @And("I Click {string} button")
    public void iClickHomeButton(String button) {
        new ContactusPage().clickOnHomeButton(button);
    }

    @And("I verify that landed to homepage successfully")
    public void iVerifyThatLandedToHomepageSuccessfully() {

        Assert.assertEquals(new HomePage().isHomePageVisible(), "https://automationexercise.com/");
    }

    @When("I click on the {string} button")
    public void iClickOnTheButton(String testCases) {
        new HomePage().clickOnTestCases();
    }

    @Then("I verify user is navigated to cases page successfully")
    public void iVerifyUserIsNavigatedToCasesPageSuccessfully() {
        Assert.assertEquals(new TestCasesPage().getTestCasesUrl(),"https://automationexercise.com/test_cases");
    }

    @Then("I click Logout button")
    public void iClickLogoutButton() {
        new LoggedInPage().clickOnLogOutButton();

    }
}


