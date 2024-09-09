package com.appium.example.screen;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;

public class EquipmentScreen extends BaseScreen {
    public EquipmentScreen(WebDriver driver) {
        super(driver);
    }

    public String getEquipmentScreenTitle() {
        waitUntilElementVisible(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"My Equipment\"]"));
        return getElementText(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"My Equipment\"]"));
    }
}
