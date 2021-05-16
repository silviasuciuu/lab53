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

public class EmailPage extends PageObject {

    @FindBy(id = "rcmbtn117")
    private WebElementFacade createNewButton;

    @FindBy(id = "_to")
    private WebElementFacade toTextField;
    @FindBy(id = "compose-subject")
    private WebElementFacade subjectTextField;

    @FindBy(id = "compose-body")
    private WebElementFacade mesageTextArea;

    @FindBy(id = "rcmbtn117")
    private WebElementFacade sendButton;


    public void clickCreateButton() {
        createNewButton.click();
    }


    public void clickSendButton() {
        sendButton.click();
    }

    public void typeTo(String username) {
        toTextField.type(username);
    }

    public void typeSubject(String subject) {
        subjectTextField.type(subject);
    }
    public void typeMessage(String message) {
        mesageTextArea.type(message);
    }
}
