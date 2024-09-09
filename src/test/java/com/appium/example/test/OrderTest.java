package com.appium.example.test;

import com.appium.example.annotation.Feature;
import org.testng.annotations.Test;

import static com.appium.example.constant.Feature.LOGIN;
import static com.appium.example.constant.LoginConstants.EMAIL_ADDRESS;
import static com.appium.example.constant.LoginConstants.PASSWORD;
import static org.testng.Assert.assertEquals;

public class OrderTest extends BaseTest {

    @Test(description = "Verify that a user is able to place order")
    public void testPlaceOrder() {
//        screen().getNavigationBarScreen()
//                .tapOnSigninButton();
//        screen().getLoginScreen()
//                .login(EMAIL_ADDRESS, PASSWORD);
//
//        assertEquals(
//                screen().getOrderScreen().getOrderScreenTitle(),
//                "Order", "Landed on Order Screen"
//        );
        screen().getOrderScreen().tapAllProducts();
        screen().getOrderScreen().tapOnAddProduct();
        screen().getOrderScreen().tapOnCart();
        screen().getOrderScreen().tapOnCheckout();
        screen().getOrderScreen().tapOnPO();
        screen().getOrderScreen().inputPoNumber();
        screen().getOrderScreen().tapOnReviewOrder();
        screen().getOrderScreen().tapOnSubmitOrder();

        assertEquals(
             screen().getOrderScreen().getOrderThankYouMessage(),
                "Thank you for placing your order!", "Order Thank you Message Displayed"
);

    }
}
