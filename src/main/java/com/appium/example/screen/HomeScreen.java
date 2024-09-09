package com.appium.example.screen;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;

public class HomeScreen extends BaseScreen {
    public HomeScreen(WebDriver driver) {
        super(driver);
    }
    public String getAccountScreenTitle() {
        return getElementText(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Freestyle Dispensers\"]"));
    }

    public String getSigninButtonText() {
        return getElementText(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"SIGN IN\"]"));
    }
}
