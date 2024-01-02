package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.By;

public class TestCasesPage extends Utility {
    public String getTestCasesUrl(){
        waitUntilVisibilityOfElementLocated(By.cssSelector("h2[class='title text-center'] b"),10);
        String testCaseUrl =getCurrentUrl();
        return testCaseUrl;
    }


}
