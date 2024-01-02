package com.automationexercise.steps;

import com.automationexercise.pages.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Map;

import static com.automationexercise.browserfactory.ManageBrowser.driver;

public class ProductsSteps {
    @And("I verify user is navigated to ALL PRODUCTS page successfully")
    public void iVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(new AllProductsPage().checkAllProductsPageUrl(), "https://automationexercise.com/products");

        //  Assert.assertEquals(new AllProductsPage().checkAllProductsPageUrl(),"https://automationexercise.com/products");
    }
    @Then("I Click on {string} of first product")
    public void iClickOnViewProductOfFirstProduct(String product) {
        new AllProductsPage().clickOnFirstProduct();
    }

    @And("I landed to product detail page")
    public void iLandedToProductDetailPage() {

        Assert.assertEquals(new BlueTopPage().getBlueTopPageUrl(), "https://automationexercise.com/product_details/1");
    }
    @And("I Verify that detail is visible: product name, category, price, availability, condition, brand")
    public void iVerifyThatDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() throws InterruptedException {
        new BlueTopPage().verifyProductNameText();
        new BlueTopPage().verifyProductCategoryText();
        new BlueTopPage().verifyProductPriceText();
        new BlueTopPage().verifyavailabilityText();
        new BlueTopPage().verifyProductConditionText();
        new BlueTopPage().verifyProductBrandText();
    }
    @And("I check All products is visible")
    public void iCheckAllProductsIsVisible() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(new AllProductsPage().verifyAllProductsText(), "All Products");
        // Assert.assertEquals(new AllProductsPage().verifyAllProductsText(),"All Products");
    }
    @Then("I verify Searched Products is visible")
    public void iVerifySearchedProductsIsVisible() {
        new AllProductsPage().verifyTheProductisDisplay();
    }

    @And("I verify all the products related to search are visible")
    public void iVerifyAllTheProductsRelatedToSearchAreVisible() {
        new AllProductsPage().verifyAllProductsDisplay();
    }


    @When("I enter product name in search input")
    public void iEnterProductNameInSearchInput() {
        new AllProductsPage().findProductOnSearchField("shirt");
    }

    @And("I click search button")
    public void iClickSearchButton() {
        new AllProductsPage().clickOnSearch();
    }

    @When("I click on Products button")
    public void iClickOnProductsButton() {
        new HomePage().clickOnProducts();
    }

    @When("I click on Cart button")
    public void iClickOnCartButton() {
        new HomePage().clickOnCart();
    }

    @And("I scroll down to footer")
    public void iScrollDownToFooter() {
        new HomePage().scrollDownToFooter();
    }

    @And("I Verify text {string}")
    public void iVerifyTextSUBSCRIPTION(String subscription) {
        new HomePage().getTextSubscription(subscription);
    }
    @Then("I enter email address in input and click arrow button")
    public void iEnterEmailAddressInInputAndClickArrowButton() {
        new CartPage().enterEmail("Bus@gmail.com");
        new CartPage().clickOnArrowButton();
    }
    @And("I verify success message You have been successfully subscribed! is visible")
    public void iVerifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertEquals(new CartPage().verifySubscribeSuccessMessage(), "You have been successfully subscribed!");
    }

    @And("I Hover over first product and click {string}")
    public void iHoverOverFirstProductAndClickAddToCart(String addtoCart) throws InterruptedException {
        Thread.sleep(10);
        new AllProductsPage().mouseHoverOnBlueTop();
    }

    @And("I Click Continue Shopping button")
    public void iClickContinueShoppingButton() {
        new AllProductsPage().clickOnContinueShopping();
    }

    @And("I Hover over second product and click {string}")
    public void iHoverOverSecondProductAndClickAddToCart(String secondProduct) throws InterruptedException {
        Thread.sleep(5);
        new AllProductsPage().mouseHoverAndClickOnSecondProduct();
    }
    @And("I Click View Cart button")
    public void iClickViewCartButton() {
        new AllProductsPage().clickOnCartViewButton();
    }
    @Then("I Verify both products are added to Cart")
    public void iVerifyBothProductsAreAddedToCart() {
        new ViewCartPage().verifyBlueTopAvailableInCart();
        // new ViewCartPage().verifySecondProductMenTshirtAvailableOrNot();
    }
    @And("I Verify their prices, quantity and total price")
    public void iVerifyTheirPricesQuantityAndTotalPrice() {
        Assert.assertEquals(new ViewCartPage().getTheBlueTopPrice(), "Rs. 500", "error");
        Assert.assertEquals(new ViewCartPage().verifyBlueTopQuantity(), "1", "error");
        Assert.assertEquals(new ViewCartPage().getBlueTopTotal(), "Rs. 500", "error");
    }
    @And("I  Verify product detail is opened")
    public void iVerifyProductDetailIsOpened() throws InterruptedException {
        new BlueTopPage().verifyProductNameText();
        new BlueTopPage().verifyProductCategoryText();
        new BlueTopPage().verifyProductPriceText();
        new BlueTopPage().verifyavailabilityText();
        new BlueTopPage().verifyProductConditionText();
        new BlueTopPage().verifyProductBrandText();
    }
    @And("I increase quantity to {string}")
    public void iIncreaseQuantityTo(String qty) {
        new BlueTopPage().selectQuantity(qty);
        new BlueTopPage().clickOnAddToCart();
        new AllProductsPage().clickOnContinueShopping();
    }
    @And("I Verify that product is displayed in cart page with exact quantity {string}")
    public void iVerifyThatProductIsDisplayedInCartPageWithExactQuantity(String qty) {
        new HomePage().clickOnCart();
        Assert.assertEquals(new CartPage().getActualQuantity(), qty);
    }
    @And("I Verify that cart page is displayed")
    public void iVerifyThatCartPageIsDisplayed() throws InterruptedException {
        Assert.assertEquals(new CartPage().verifyCardPageIsDisplayed(), "https://automationexercise.com/view_cart");
    }
    @And("I Click Proceed To Checkout")
    public void iClickProceedToCheckout() {
        new CartPage().clickOnProceedToCheckout();
    }
    @And("I Verify {string} and click {string} button")
    public void iVerifyACCOUNTCREATEDAndClickContinueButton() {
    }
    @And("I Verify {string} at top")
    public void iVerifyLoggedInAsUsernameAtTop() {
    }
    @When("I Add products to cart by pressing {string} button")
    public void iAddProductsToCartByPressingButton(String addToCart) {
        new ContactusPage().clickOnHomeButton(addToCart);
    }
    @And("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        Assert.assertEquals(new CheckOutPage().verifyAddressDetailText(), "Address Details");
        Assert.assertEquals(new CheckOutPage().verifyReviewYourOrderText(), "Review Your Order");
    }
    @And("Enter description in comment text area and click {string}")
    public void enterDescriptionInCommentTextAreaAndClick(String click) {
        new CheckOutPage().writeComment("delivr asap");
        new CheckOutPage().clickOnPlaceOrder();
    }
    @And("I Verify success message {string}")
    public void iVerifySuccessMessage(String message) {
        Assert.assertEquals(new CheckOutPage().orderConfirmMessage(), message);
    }
    @And("I click {string} button")
    public void iClickButton(String Cart) {
        new ContactusPage().clickOnHomeButton(Cart);
    }
    @And("I Enter payment details: {string}, {string}, {string}, {string}, {string}")
    public void iEnterPaymentDetails(String name, String cardNumber, String cvc, String expiry, String year) {
        new CheckOutPage().sendPaymentDetails(name, cardNumber, cvc, expiry, year);
    }
    @When("I add product {string} to the cart")
    public void iAddProductToTheCart(String product) throws InterruptedException {
        new HomePage().mouseHoverAndClickAddToCartOnProduct(product);
    }
    @Then("I Click {string} button corresponding to particular product")
    public void iClickXButtonCorrespondingToParticularProduct(String button) {
        new ContactusPage().clickOnHomeButton(button);
    }
    @And("I Verify that product is removed from the cart")
    public void iVerifyThatProductIsRemovedFromTheCart() {
        new CartPage().checkTheCartIsEmpty();
    }

    @When("I Verify that categories are visible on left side bar")
    public void iVerifyThatCategoriesAreVisibleOnLeftSideBar() {
        Assert.assertEquals(new HomePage().getCategoryText(),"CATEGORY");
    }

    @And("I  Verify that category page is displayed and confirm text {string}")
    public void iVerifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS(String text) {
        Assert.assertEquals(new CategoryPage().getWomenDressProductsText(),text);
    }

    @And("I Verify that user is navigated to that category page")
    public void iVerifyThatUserIsNavigatedToThatCategoryPage() {
        Assert.assertEquals(new CategoryPage().getMenThsirtsProductText(),"MEN - TSHIRTS PRODUCTS");
    }

    @And("I Click on {string} category button")
    public void iClickOnWomenCategoryButton(String button) {
        new ContactusPage().clickOnHomeButton(button);
    }

    @And("I Click on {string} category button under Women category")
    public void iClickOnCategoryButtonUnderWomenCategory(String button) {
        new ContactusPage().clickOnHomeButton(button);
    }

    @Then("I click On {string} Category")
    public void iClickOnCategory(String men) {
        new ContactusPage().clickOnHomeButton(men);
    }

    @And("I click on {string} sub-category of Man")
    public void iClickOnSubCategoryOfMan(String tshirts) {
        new ContactusPage().clickOnHomeButton(tshirts);
    }

    @And("I verify that Brands are visible on left side bar")
    public void iVerifyThatBrandsAreVisibleOnLeftSideBar() {
    }

    @And("I click on {string} brand name button")
    public void iClickOnBrandNameButton(String polo) {
        new ContactusPage().clickOnHomeButton(polo);
    }

    @Then("On left side bar, I click on {string} brand link")
    public void onLeftSideBarIClickOnBrandLink(String HandM) {
        new ContactusPage().clickOnHomeButton(HandM);
    }

    @And("Enter product names in search input and click search and add product to cart")
    public void enterProductNamesInSearchInputAndClickSearchAndAddProductToCart(DataTable searchData) throws InterruptedException {
        for (Map<String, String> searchp : searchData.asMaps(String.class, String.class)) {
            new AllProductsPage().enterProductName(searchp.get("product"));
            new AllProductsPage().clickOnSearchButton();
            new AllProductsPage().viewProductForSelectedProduct(searchp.get("product"));
            new CheckOutPage().clickOnAddToCartButton();
            new AllProductsPage().clickOnContinueAfterAddToCart();
            new HomePage().clickOnProductsLink();
        }
    }


    @Then("I Verify that products are visible in cart")
    public void iVerifyThatProductsAreVisibleInCart() {
    }

    @And("I Enter {string}, {string} and {string}")
    public void iEnterAnd(String arg0, String arg1, String arg2) {
    }

    @And("I Verify {string} are visible")
    public void iVerifyRECOMMENDEDITEMSAreVisible() {
    }

    @And("I Click on {string} on Recommended product")
    public void iClickOnAddToCartOnRecommendedProduct() {
    }

    @Then("I Click on {string} button")
    public void iClickOnViewCartButton() {
    }

    @And("I Verify that product is displayed in cart page")
    public void iVerifyThatProductIsDisplayedInCartPage() {
    }

    @And("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
    }

    @Then("I Verify that the billing address is same address filled at the time registration of account")
    public void iVerifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertEquals(new CheckOutPage().verifyDeliveryAddress(),"Navsari","Error" );
    }

    @And("I Click {string} button and verify invoice is downloaded successfully.")
    public void iClickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully(String downloadInvoice) {
        new ContactusPage().clickOnHomeButton("Download Invoice");
        Assert.assertTrue(new CheckOutPage().verifyFileDownloaded());
    }

    @And("I click Continue buton")
    public void iClickContinueButon() {
    }

    @Then("I Click on arrow at bottom right side to move upward")
    public void iClickOnArrowAtBottomRightSideToMoveUpward() {
        new AllProductsPage().scrollup();

    }

    @And("I Verify that page is scrolled up and {string} text is visible on screen")
    public void iVerifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(String scrollUPVerificationMsg) {
        Assert.assertEquals(new HomePage().verifyScrolledUpMsg(),scrollUPVerificationMsg, "Error");
    }

    @Then("I Scroll up page to top")
    public void iScrollUpPageToTop() {
        new AllProductsPage().scrollup();
    }
    @And("I Verify that those products are visible in cart after login as well")
    public void iVerifyThatThoseProductsAreVisibleInCartAfterLoginAsWell(DataTable cartData) {
        for (Map<String ,String > addedToCart : cartData.asMaps(String.class, String.class)){
            Assert.assertEquals(new AllProductsPage().verifyProductIsInCartAfterLogin(addedToCart.get("product")),addedToCart.get("product") , "Error");
            System.out.println(addedToCart.get("product"));
        }
    }

    @Then("Verify text {string} is displayed")
    public void verifyTextBRANDPOLOPRODUCTSIsDisplayed(String categoryText) {
        if (categoryText.contains("category")) {
            Assert.assertEquals(new AllProductsPage().verifyCategoryText(), categoryText, "Error");
        } else if (categoryText.contains("WOMEN - DRESS")) {
            Assert.assertEquals(new AllProductsPage().verifyWomenCategoryText(), categoryText, "Error");
        } else if (categoryText.contains("MEN - TSHIRTS")) {
            Assert.assertEquals(new AllProductsPage().verifyMenCategoryText(), categoryText, "Error");
        } else if (categoryText.equalsIgnoreCase("BRAND")) {
            Assert.assertEquals(new AllProductsPage().verifyBrandCategoryText(), categoryText, "Error");
        } else if (categoryText.contains("POLO PRODUCTS")) {
            Assert.assertEquals(new AllProductsPage().verifyPoloBrandCategoryText(), categoryText, "Error");
        } else if (categoryText.contains("H&M PRODUCTS")) {
            Assert.assertEquals(new AllProductsPage().verifyHnMBrandCategoryText(), categoryText, "Error");
        }
    }
}

