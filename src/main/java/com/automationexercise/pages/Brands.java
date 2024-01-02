package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Brands extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav nav-pills nav-stacked']/li")
    List<WebElement> brandsList;
}
