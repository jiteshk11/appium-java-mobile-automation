package com.appium.example.screen;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;
import java.util.UUID;

public class OrderScreen extends BaseScreen {
    public OrderScreen(WebDriver driver) {
        super(driver);
    }

    UUID uuid = UUID.randomUUID();

    public String getOrderScreenTitle() {
        waitUntilElementVisible(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Order\"]"));
        return getElementText(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Order\"]"));
    }

    public void tapAllProducts() {
        tap(AppiumBy.accessibilityId("All Products"));
        System.out.println("Tapped on All Products Link");
    }

    public void tapOnAddProduct() {
        tap(AppiumBy.xpath("(//XCUIElementTypeButton[@name=\"ProductCellAddProduct\"])[4]"));

        System.out.println("Added Product into Cart");
    }

    public void tapOnCart() {
        tap(AppiumBy.accessibilityId("orderBuilderCart"));
        System.out.println("Tapped on Cart Icon");
    }

    public void tapOnCheckout() {
        waitUntilElementVisible(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Subtotal: $69.55\"]"));
        tap(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"CHECKOUT\"]"));
        System.out.println("Tapped on CHECKOUT");
    }

    public void tapOnPO() {
        tap(AppiumBy.accessibilityId("OrderDetailsViewControllerPoNumberButtonIdentifier"));
        System.out.println("Tapped on PO Field");
    }

    public void inputPoNumber() {
        inputText(AppiumBy.xpath("//XCUIElementTypeTextField"), uuid.toString().substring(0,6));
        tap(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"SAVE\"]"));
        System.out.println("Input random string into PO Field");
    }

    public void tapOnReviewOrder() {
        tap(AppiumBy.accessibilityId("OrderDetailsViewControllerContinueButtonIdentifier"));
        System.out.println("Tapped on Review Order");

    }

    public void tapOnSubmitOrder() {
        tap(AppiumBy.accessibilityId("SUBMIT ORDER"));
        System.out.println("Tapped on SUBMIT ORDER");
    }
    public String getOrderThankYouMessage() {
        waitUntilElementVisible(AppiumBy.accessibilityId("CONTINUE SHOPPING"));
        System.out.println("Verified Thank you for placing your order!");
        return "Thank you for placing your order!";

    }


}
