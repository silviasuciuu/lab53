package com.steps.serenity;

import com.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
    LoginPage loginPage;

    @Step
    public void typeUser(String username){
        loginPage.typeUser(username);
    }

    @Step
    public void typePassword(String password){
        loginPage.typePassword(password);
    }

    @Step
    public void clickLoginButton()
    {
        loginPage.clickSubmitButton();
    }

    @Step
    public void login(String username,String password){
        clickLoginButton();
            typeUser(username);
            typePassword(password);
            //clickLoginButton();
    }
}
