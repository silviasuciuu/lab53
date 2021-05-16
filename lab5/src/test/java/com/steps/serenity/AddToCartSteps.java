package com.steps.serenity;

import com.pages.AddToCartPage;
import net.thucydides.core.annotations.Step;

public class AddToCartSteps {
    AddToCartPage addToCartPage;

    @Step
    public void clickAddToCart() {
        addToCartPage.clickAddToCartButton();
    }

    @Step
    public void clickShoppingCart() {
        addToCartPage.clickShoppingCartButton();
    }

    @Step
    public void clickRemove() {
        addToCartPage.clickRemoveCartButton();
    }

    @Step
    public void clickContinue() {
        addToCartPage.clickContinueShoppingButton();
    }

    @Step
    public void add() {
        clickAddToCart();
        clickShoppingCart();
        clickRemove();
        clickRemove();
    }


}
