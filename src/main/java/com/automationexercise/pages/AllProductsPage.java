package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import jdk.jfr.Category;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AllProductsPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement allProductsText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'productinfo text-center']/p")
    List<WebElement> listOfProducts;

    @CacheLookup
    @FindBy(css = "a[href='/product_details/1']")
    WebElement firstProduct;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search_product']")
    WebElement searchField;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Men - Tshirts Products']")
    WebElement menCategoryTextElement;
    @CacheLookup
    @FindBy(id = "search_product")
    WebElement searchedProductsText;
    @CacheLookup
    @FindBy(id = "submit_search")
    WebElement searchSymbol;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-image-wrapper']")
    WebElement visibleProdcuts;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Category']")
    WebElement categoryTextElement;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='productinfo text-center'])[1]")
    WebElement blueTop;
    @CacheLookup
    @FindBy(css = "#search_product")
    WebElement searchProductElement;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    WebElement continueShopping;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
    WebElement womenCategoryTextElement;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - Polo Products']")
    WebElement poloBrandCategoryTextElement;
    @CacheLookup
    @FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(css = ".fa.fa-search")
    WebElement searchButtonElement;
    @CacheLookup
    @FindBy(css = ".title.text-center")
    WebElement hnmBrandTextElement;
    @CacheLookup
    @FindBy(xpath = "//div[3]//div[1]//div[1]//div[2]//div[1]//a[1]")
    WebElement secondProduct;
    @CacheLookup
    @FindBy(css = "button[type='button']")
    WebElement addToCartButtonElement;
    @CacheLookup
    @FindBy(xpath = "//div[@class='modal-content']//div//button")
    WebElement continueAfterAddToCartElement;
    @CacheLookup
    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    WebElement cartView;
    @CacheLookup
    @FindBy(css = "div[class='brands_products'] h2")
    WebElement brandTextElement;
    public String verifyAllProductsText() {

        // waitUntilVisibilityOfElementLocated(By.cssSelector(".title.text-center"),10);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click;", driver.findElement(By.cssSelector(".title.text-center")));
        return getTextFromElement(driver.findElement(By.cssSelector(".title.text-center")));
    }
    public String verifyHnMBrandCategoryText() {
        return getTextFromElement(hnmBrandTextElement);
    }
    public String verifyCategoryText() {
        return getTextFromElement(categoryTextElement);
    }  //scenario 18
    public void clickOnSearchButton() {
        clickOnElement(searchButtonElement);
    }
    public String verifyMenCategoryText() {
        return getTextFromElement(menCategoryTextElement);
    }
    public String verifyPoloBrandCategoryText() {
        return getTextFromElement(poloBrandCategoryTextElement);
    }
    public String verifyBrandCategoryText() {
        return getTextFromElement(brandTextElement);
    }
    public void verifyAllProductsDisplay() {
        verifyThatElementIsDisplayed(visibleProdcuts);
    }

//       String actualAllProductText =  getTextFromElement(allProductsText);
//        return actualAllProductText;

    public void clickOnFirstProduct() {
        clickOnElement(firstProduct);
    }

    public void viewProductForSelectedProduct(String selectAProduct) {          //scenario 13 view product
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='product-image-wrapper']//div//p"));
        for (WebElement pr : productList)
            if (pr.getText().equalsIgnoreCase(selectAProduct)) {
                mouseHoverToElement(pr);
                WebElement getADemo = driver.findElement(RelativeLocator.with(By.xpath("//div[@class='product-image-wrapper']//div//a")).below(pr));
                WebElement viewProduct = driver.findElement(RelativeLocator.with(By.xpath("//div[@class='product-image-wrapper']//div//ul")).below(getADemo));
                viewProduct.click();
                log.info("Hovering mouse over view product of " + selectAProduct + " : " + productList.toString());
                break;
            }
    }

    public String checkAllProductsPageUrl() {
        //waitUntilVisibilityOfElementLocated(By.cssSelector(".title.text-center"),10);
        String actualUrlOfAllProductsPage = getCurrentUrl();
        return actualUrlOfAllProductsPage;
    }
    public String verifyWomenCategoryText() {
        return getTextFromElement(womenCategoryTextElement);
    }
    public void enterProductName(String searchProduct) {
        sendTextToElement(searchProductElement, searchProduct);
    }

    public void findProductOnSearchField(String search) {
        sendTextToElement(searchField, search);
    }

    public void verifyTheProductisDisplay() {
        verifyThatElementIsDisplayed(searchedProductsText);
    }

    public void clickOnSearch() {
        clickOnElement(searchSymbol);
    }

    public void mouseHoverOnBlueTop() {
        //mouseHoverToElement(blueTop);

        js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")));
    }
    public void scrollup(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,0)");
    }
    public void mouseHoverAndClickOnSecondProduct() {
        //mouseHoverToElement(secondProduct);
        mouseHoverToElementAndClick(secondProduct);
    }

    public void clickOnContinueShopping() {
        try {
            continueShopping.click();
        } catch (Exception e) {
            js.executeScript("arguments[0].click", driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")));

            //  new AllProductsPage().clickOnContinueShopping();
        }
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButtonElement);
        log.info("Click on add to cart button : " + addToCartButtonElement.toString());
    }

    public void clickOnCartViewButton() {
        waitUntilVisibilityOfElementLocated(By.xpath("//u[normalize-space()='View Cart']"), 10);
        js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//u[normalize-space()='View Cart']")));

    }
    public void clickOnContinueAfterAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueAfterAddToCartElement);
    }
    public String verifyProductIsInCartAfterLogin(String cartProducts) {
        List<WebElement> searchCartProducts = driver.findElements(By.xpath("//td[@class='cart_description']//h4"));
        for (WebElement sr : searchCartProducts)
            if (sr.getText().equalsIgnoreCase(cartProducts)) {
                System.out.println("product " + cartProducts + "is already in cart");
                break;
            }
        return cartProducts;
    }
}