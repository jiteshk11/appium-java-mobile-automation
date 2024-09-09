package com.appium.example.screen;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;

public class SwipeScreen extends BaseScreen {
    public SwipeScreen(WebDriver driver) {
        super(driver);
    }

    public void scrollToFindMeLogo() {
        scrollToElement("You found me!!!");
    }

}
