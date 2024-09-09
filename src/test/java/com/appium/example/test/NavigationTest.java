package com.appium.example.test;

import com.appium.example.annotation.Feature;
import org.testng.annotations.Test;

import static com.appium.example.constant.Feature.SWIPE;
import static com.appium.example.constant.LoginConstants.EMAIL_ADDRESS;
import static com.appium.example.constant.LoginConstants.PASSWORD;
import static org.testng.Assert.assertEquals;

public class NavigationTest extends BaseTest {
    @Feature(SWIPE)
    @Test(description = "Verify that user can navigate through different tabs'")
    public void testNavigateThroughTabs() {

        screen().getNavigationBarScreen()
                .tapOnSigninButton();
        screen().getLoginScreen()
                .login(EMAIL_ADDRESS, PASSWORD);

        screen().getNavigationBarScreen()
                .tapEquipmentTab();
        assertEquals(
                screen().getEquipmentScreen().getEquipmentScreenTitle(),
                "My Equipment", "Equipment Screen Navigated"
        );

        screen().getNavigationBarScreen()
                .tapFreestyleTab();
        assertEquals(
                screen().getFreestyleScreen().getFreestyleScreenTitle(),
                "Freestyle Dispensers", "Freestyle Screen Navigated"
        );

        screen().getNavigationBarScreen()
                .tapAccountTab();
        assertEquals(
                screen().getAccountScreen().getAccountScreenTitle(),
                "My Account", "Account Screen Navigated"
        );

        screen().getAccountScreen().tapSignOut();
        assertEquals(
                screen().getNavigationBarScreen().getSignInText(),
                "SIGN IN", "SIGN IN Button is present"
        );
    }

}
