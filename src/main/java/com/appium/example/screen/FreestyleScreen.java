package com.appium.example.screen;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;

public class FreestyleScreen extends BaseScreen {
    public FreestyleScreen(WebDriver driver) {
        super(driver);
    }

    public String getFreestyleScreenTitle() {

        waitUntilElementVisible(AppiumBy.xpath("(//XCUIElementTypeStaticText[@name=\"FreestyleDispenserStatusLabelIdentifier\"])[1]"));
        waitUntilElementVisible(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Freestyle Dispensers\"]"));
        return getElementText(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Freestyle Dispensers\"]"));
    }


}
