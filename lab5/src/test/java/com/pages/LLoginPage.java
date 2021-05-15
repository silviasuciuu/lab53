package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.okazii.ro/login")
public class LLoginPage extends PageObject {
    @FindBy(id="login_input")
    private WebElement userInput;

    @FindBy(id="login_pass")
    private WebElement passwordInput;

    @FindBy(css="#btn btn-block btn-primary login_btn")
    private WebElement loginWithButton;

    public void typeUser(String username){
        userInput.sendKeys(username);
    }

    public void typePassword(String password){
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton(){
        loginWithButton.click();
    }
}
