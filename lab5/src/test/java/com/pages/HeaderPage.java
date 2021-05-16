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

public class HeaderPage extends PageObject {


    @FindBy(id = "rcmbtn103")
    private WebElementFacade logoutButton;
    @FindBy(id="rcmloginsubmit")
    private WebElementFacade loginButton;



    public boolean isLogoutButtonVisible() {
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return logoutButton.isDisplayed();
    }

    @FindBy(css = "#warning")
    private WebElement incorrectAlert;

    public boolean isAccountIncorrect() {
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return incorrectAlert.isDisplayed();
    }
    public void clickLoginButton() {
        loginButton.click();
    }

}
