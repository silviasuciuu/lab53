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

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {
    @FindBy(id="user-name")
    private WebElementFacade userInput;

    @FindBy(id="password")
    private WebElementFacade passwordInput;

    @FindBy(id="login-button")
    private WebElementFacade loginSubmit;

    @FindBy(id = "react-burger-menu-btn")
    private WebElementFacade MenuButton;


    @FindBy(id="logout_sidebar_link")
    private WebElementFacade logoutButton;

    public void typeUser(String username){
        userInput.type(username);
    }

    public void typePassword(String password){
        passwordInput.type(password);
    }

    public void clickSubmitButton(){
        loginSubmit.click();
    }

    public void clickLogoutButton(){
        logoutButton.click();

    }

    public void clickMenuButton() {
        MenuButton.click();
    }

}
