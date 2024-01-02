package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.security.PublicKey;
import java.time.Duration;

public class ContactusPage extends Utility {
    @CacheLookup
    @FindBy(css = "div[class='contact-form'] h2[class='title text-center']")
    WebElement getInTouchText;

    @CacheLookup
    @FindBy(css = "input[placeholder='Name']")
    WebElement name;

    @CacheLookup
    @FindBy(css = "input[placeholder='Subject']")
    WebElement subject;

    @CacheLookup
    @FindBy(id = "message")
    WebElement message;

    @CacheLookup
    @FindBy(css = "input[placeholder='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(css = "input[name='upload_file']")
    WebElement uploadFile;
    @CacheLookup
    @FindBy(css = "input[value='Submit']")
    WebElement submit;

    @CacheLookup
    @FindBy(css = ".status.alert.alert-success")
    WebElement successMessage;

    @CacheLookup
    @FindBy(css = "li:nth-child(1) a:nth-child(1)")
    WebElement homeButton;

    @CacheLookup
    @FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCart;

    @CacheLookup
    @FindBy(css = "a[href='/product_details/1']")
    WebElement viewProductOfBlueTop;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement loginOrRegister;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cart;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    WebElement proceedToCheckOut;
    @CacheLookup
    @FindBy(xpath = "//button[@id='submit']")
    WebElement payAndConfirmOrder;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signUpOrLogin;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-times']")
    WebElement x;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement womenCategory;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Download Invoice']")
    WebElement downloadInvoice;
    @CacheLookup
    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
    WebElement dress;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement men;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Tshirts']")
    WebElement tShirts;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement products;
    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    WebElement polo;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    WebElement hAndm;

    JavascriptExecutor executor = (JavascriptExecutor) driver;

    public void clickOnViewCart() {
        executor.executeScript("arguments[0].click();", viewCart);
    }

    public void verifyGetInTouchText() {
        verifyThatElementIsDisplayed(getInTouchText);
    }

    public void enterName(String name) {
        sendTextToElement(this.name, name);
    }

    public void enterEmail(String email) {
        sendTextToElement(this.email, email);
    }

    public void enterSubject(String subject) {
        sendTextToElement(this.subject, subject);
    }

    public void enterMessage(String message) {
        sendTextToElement(this.message, message);
    }

    public void uploadFile() {
        uploadFile.sendKeys("C:\\Users\\Vishal\\Desktop\\Appliance.PNG");
    }

    public void clickOnSubmitButton() {
        clickOnElement(submit);
    }

    public void acceptPopup() {
        acceptAlert();
    }

    public void verifyTheSuceesMessage() {
        String actualText = getTextFromElement(successMessage);
        Assert.assertEquals(actualText, "Success! Your details have been submitted successfully.");
    }

////    public void clickOnHomeButton() {
////
////        clickOnElement(homeButton);
//
//    }

    public void clickOnHomeButton(String button) {
        if (button.equalsIgnoreCase("Add to Cart")) {
            clickOnElement(addToCart);
        } else if (button.equalsIgnoreCase("Home")) {
            clickOnElement(homeButton);
        } else if (button.equalsIgnoreCase("View Product")) {
            clickOnElement(viewProductOfBlueTop);
        } else if (button.equalsIgnoreCase("Register / Login")) {
            clickOnElement(loginOrRegister);
        } else if (button.equalsIgnoreCase("Cart")) {
            clickOnElement(cart);
        } else if (button.equalsIgnoreCase("Proceed To Checkout")) {
            clickOnElement(proceedToCheckOut);
        } else if (button.equalsIgnoreCase("Pay and Confirm Order")) {
            clickOnElement(payAndConfirmOrder);
        } else if (button.equalsIgnoreCase("Signup / Login")) {
            clickOnElement(signUpOrLogin);
        } else if (button.equalsIgnoreCase("X")) {
            clickOnElement(x);
        } else if (button.equalsIgnoreCase("Women")) {
            clickOnElement(womenCategory);
        } else if (button.equalsIgnoreCase("Dress")) {
            clickOnElement(dress);
        } else if (button.equalsIgnoreCase("Men")) {
            clickOnElement(men);
        } else if (button.equalsIgnoreCase("Tshirts")) {
            clickOnElement(tShirts);
        } else if (button.equalsIgnoreCase("POLO")) {
            clickOnElement(polo);
        } else if (button.equalsIgnoreCase("H&M")) {
            clickOnElement(hAndm);
        } else if (button.equalsIgnoreCase("Download Invoice")) {
            clickOnElement(downloadInvoice);
        } else if (button.equalsIgnoreCase("Products")) {
            clickOnElement(products);
        } else {
            System.out.println("Please write correct button number");
        }
    }
}
