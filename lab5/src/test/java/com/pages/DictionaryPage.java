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
public class DictionaryPage extends PageObject {

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

    @FindBy(name="search")
    private WebElementFacade searchTerms;

    @FindBy(name="go")
    private WebElementFacade lookupButton;

    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }
}