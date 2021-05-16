package com.pages;


import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

public class AddToCartPage extends PageObject {

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElementFacade addToCartButton;
/*
    @FindBy(id = "shopping_cart_container")
    private WebElementFacade shoppingCart;


 */
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElementFacade removeButton;

    @FindBy(id = "continue-shopping")
    private WebElementFacade continueButton;


    public void clickAddToCartButton() {
        addToCartButton.click();
    }


    public void clickShoppingCartButton() {
        //shoppingCart.click();
        openUrl("https://www.saucedemo.com/cart.html");
    }

    public void clickRemoveCartButton() {
        removeButton.click();
    }

    public void clickContinueShoppingButton() {
        continueButton.click();
    }

}
