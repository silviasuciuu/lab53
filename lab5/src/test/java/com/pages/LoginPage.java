package com.pages;


import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary")
public class LoginPage extends PageObject {
    @FindBy(name="wpName")
    private WebElementFacade userInput;

    @FindBy(name="wpPassword")
    private WebElementFacade passwordInput;

    @FindBy(name="wploginattempt")
    private WebElementFacade loginSubmit;

    @FindBy(id="pt-login")
    private WebElementFacade loginButton;

    public void typeUser(String username){
        userInput.type(username);
    }

    public void typePassword(String password){
        passwordInput.type(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void clickSubmitButton(){
        loginSubmit.click();
    }

}
