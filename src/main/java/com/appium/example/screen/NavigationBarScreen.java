package com.appium.example.screen;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;

public class NavigationBarScreen extends BaseScreen {
    public NavigationBarScreen(WebDriver driver) {
        super(driver);
    }

    public void tapOnSigninButton() {
        tap(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"SIGN IN\"]"));
    }
    public String getSignInText() {
        return getElementText(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"SIGN IN\"]"));
    }

    public void tapOrderTab() {
        tap(AppiumBy.accessibilityId("Order"));
    }

    public void tapEquipmentTab() {
        tap(AppiumBy.accessibilityId("MCTabBarEquipmentActiveIcon"));
    }

    public void tapFreestyleTab() {
        tap(AppiumBy.accessibilityId("MCTabBarFreestyleActiveIcon"));
    }

    public void tapAccountTab() {
        tap(AppiumBy.accessibilityId("MCTabBarAccount"));
    }

    public void tapOnSwipeIcon() {
        tap(AppiumBy.accessibilityId("Swipe"));
    }
}
