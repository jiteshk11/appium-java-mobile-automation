package com.appium.example.screen;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;

public class AccountScreen extends BaseScreen {
    public AccountScreen(WebDriver driver) {
        super(driver);
    }
    public String getAccountScreenTitle() {
        waitUntilElementVisible(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"My Account\"]"));
        return getElementText(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"My Account\"]"));
    }

    public void tapSignOut() {
        tap(AppiumBy.xpath("(//XCUIElementTypeButton[@name=\"SideMenuAboutButtonIdentifier\"])[2]"));

    }

}
