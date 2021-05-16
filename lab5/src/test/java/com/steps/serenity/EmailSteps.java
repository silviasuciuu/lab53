package com.steps.serenity;

import com.pages.EmailPage;
import com.pages.HeaderPage;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class EmailSteps {
    EmailPage emailPage;
   

    @Step
    public void typeTo(String username){
        emailPage.typeTo(username);
    }

    @Step
    public void typeSubject(String subject){
        emailPage.typeSubject(subject);
    }
    @Step
    public void typeMessage(String message){
        emailPage.typeMessage(message);
    }



    @Step
    public void clickSendButton()
    {
        emailPage.clickSendButton();
    }

    @Step
    public void clickCreateButton()
    {
        emailPage.clickCreateButton();
    }

    @Step
    public void send(String to,String subject,String message){

       clickCreateButton();
       typeTo(to);
       typeSubject(subject);
       typeMessage(message);
       clickSendButton();
    }
}
