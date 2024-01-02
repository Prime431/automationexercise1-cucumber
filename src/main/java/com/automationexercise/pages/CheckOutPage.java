package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Address Details']")
    WebElement addressDetail;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Review Your Order']")
    WebElement reviewYourOrder;
    @CacheLookup
    @FindBy(xpath = "//textarea[@name='message']")
    WebElement messageBox;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    WebElement placeOrder;

    @CacheLookup
    @FindBy(xpath = "//input[@name='name_on_card']")
    WebElement nameOnCard;

    @CacheLookup
    @FindBy(xpath = "//input[@name='card_number']")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='ex. 311']")
    WebElement cvc;
    @CacheLookup
    @FindBy(css = "button[type='button']")
    WebElement addToCartButtonElement;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='MM']")
    WebElement expiry;
    @CacheLookup
    @FindBy(xpath = "//ul[@id = 'address_delivery']/li[4]")
    WebElement verifyAddressElement;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='YYYY']")
    WebElement year;
    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    WebElement orderConfirmationMessage;

    public String orderConfirmMessage() {
        String am = getTextFromElement(orderConfirmationMessage);
        return am;
    }
    public boolean verifyFileDownloaded(){
        File f = new File("C:\\Users\\patel\\Downloads\\"+ "invoice.txt" );
        System.out.println("File downloaded: " +f.exists() +" file name :" +f.getName());
        System.out.println(f.canRead());
        log.info("Verify File Downloaded : " +f.getName());
        return f.exists();
    }
    public void sendPaymentDetails(String name, String cardNumber, String cvc, String expiry, String year) {
        sendTextToElement(nameOnCard, name);
        sendTextToElement(this.cardNumber, cardNumber);
        sendTextToElement(this.cvc, cvc);
        sendTextToElement(this.expiry, expiry);
        sendTextToElement(this.year, year);
    }
    public void clickOnPlaceOrder() {
        clickOnElement(placeOrder);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButtonElement);
        log.info("Click on add to cart button : " +addToCartButtonElement.toString());
    }
    public void writeComment(String commnent) {
        sendTextToElement(messageBox, commnent);
    }

    public String verifyAddressDetailText() {
        String at = getTextFromElement(addressDetail);
        return at;
    }

    public String verifyReviewYourOrderText() {
        String at = getTextFromElement(reviewYourOrder);
        return at;
    }
    public String verifyDeliveryAddress(){
        log.info("Verify delivery address : " +verifyAddressElement.toString());
        return getTextFromElement(verifyAddressElement);
    }
}
