package com.steps.serenity;

import com.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

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
    public void clickMenuButton()
    {
        loginPage.clickMenuButton();
    }

    @Step
    public void clickLogoutButton()
    {
        loginPage.clickLogoutButton();
    }

    @Step
    public void clickSubmitButton()
    {
        loginPage.clickSubmitButton();
    }

    @Step
    public void is_the_home_page() {
        loginPage.open();
    }


    @Step
    public void login(String username,String password){

            typeUser(username);
            typePassword(password);
            clickSubmitButton();
    }

    @Step
    public void logout(){
        clickMenuButton();
        clickLogoutButton();
    }



}
