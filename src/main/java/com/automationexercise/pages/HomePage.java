package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import net.bytebuddy.pool.TypePool;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Home')])[1]")
    WebElement home;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signUpOrLogin;

    @CacheLookup
    @FindBy(css = "a[href='/login']")
    WebElement signupOrLogin;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement emailAddressAlreadyExistText;

    @CacheLookup
    @FindBy(css = "div.header-middle div.container div.row div.col-sm-8 div.shop-menu.pull-right ul.nav.navbar-nav li:nth-child(8) > a:nth-child(1)")
    WebElement contactUsButton;
    @CacheLookup
    @FindBy(css = "div[class='item active'] a[class='test_cases_list'] button[type='button']")
    WebElement testCases;
    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-6']//h2")
    WebElement fullfledgedPrctcMsgTextElement;
    @CacheLookup
    @FindBy(css = "a[href='/products']")
    WebElement products;

    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    WebElement cart;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Subscription')]")
    WebElement subscription;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-image-wrapper']/div/div/p")
    List<WebElement> productList;
    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-default add-to-cart']")
    WebElement addToProductButton;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Category']")
    WebElement category;
    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsLinElement;

    public boolean verifyHomeButtonAvailability() {
        log.info("verifyHomeButtonAvailability: " + home.toString());
        return verifyThatElementIsDisplayed(home);
    }

    public void clickOnSignOrLogin() {
        log.info("clickOnSignOrLogin: " + signUpOrLogin.toString());
        clickOnElement(signUpOrLogin);
    }

    public void verifyUserIsNavigateToLoginPage() {
        log.info("verifyUserIsNavigateToLoginPage: " + signupOrLogin.toString());
        verifyThatElementIsDisplayed(signupOrLogin);
    }

    public void verifyEmailAddressAlreadyExistTextWhenEnterExistingEmail() {
        verifyThatElementIsDisplayed(emailAddressAlreadyExistText);
    }

    public void clickOnContactUsButton() {
        clickOnElement(contactUsButton);
    }

    public String isHomePageVisible() {
        waitUntilVisibilityOfElementLocated(By.cssSelector("div[class='item active'] a[class='test_cases_list'] button[type='button']"), 10);
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }

    public void clickOnTestCases() {
        clickOnElement(testCases);
    }

    public void clickOnProducts() {
        clickOnElement(products);
    }

    public String getCategoryText() {
        String at = getTextFromElement(category);
        return at;
    }

    public void clickOnCart() {
        clickOnElement(cart);
    }

    public void scrollDownToFooter() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", subscription);
    }

    public void clickOnProductsLink() {
        clickOnElement(productsLinElement);
    }

    public String verifyScrolledUpMsg() {
        return getTextFromElement(fullfledgedPrctcMsgTextElement);
    }

    public void getTextSubscription(String message) {
        Assert.assertEquals(getTextFromElement(subscription), message);
    }

    public void mouseHoverAndClickAddToCartOnProduct(String pName) throws InterruptedException {
        Thread.sleep(2000);
        for (WebElement pr : productList) {
            if (pr.getText().equalsIgnoreCase(pName)) {
                mouseHoverToElement(pr);
                log.info("Hovering mouse over " + pName + " : " + productList.toString());
                try {
                    addToProductButton.click();
                } catch (Exception e) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")));
                }
                log.info("Click on " + pName + " Add to Cart button : " + productList.toString());
                break;
            }
        }
    }
}