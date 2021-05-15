package com.features.search;

import com.steps.serenity.EndUserSteps;
import com.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginSteps anna;

    @Issue("#Login-1")
    @Test
    public void loginTestSuccessful(){
        anna.login("siir2613@scs.ubbcluj.ro","e!k5mLQhJ5V7suB");
    }
}
