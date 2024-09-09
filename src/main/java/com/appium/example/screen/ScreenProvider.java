package com.appium.example.screen;

import org.openqa.selenium.WebDriver;

public class ScreenProvider extends BaseScreen {
    public ScreenProvider(WebDriver driver) {
        super(driver);
    }

    public NavigationBarScreen getNavigationBarScreen() {
        return new NavigationBarScreen(driver);
    }

    public LoginScreen getLoginScreen() {
        return new LoginScreen(driver);
    }

    public SwipeScreen getSwipeScreen() {
        return new SwipeScreen(driver);
    }

    public HomeScreen getHomeScreen() {
        return new HomeScreen(driver);
    }

    public OrderScreen getOrderScreen() {
        return new OrderScreen(driver);
    }
    public EquipmentScreen getEquipmentScreen() {
        return new EquipmentScreen(driver);
    }
    public FreestyleScreen getFreestyleScreen() {
        return new FreestyleScreen(driver);
    }
    public AccountScreen getAccountScreen() {
        return new AccountScreen(driver);
    }
}
