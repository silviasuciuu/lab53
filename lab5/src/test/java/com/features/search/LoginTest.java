package com.features.search;

import com.steps.serenity.EndUserSteps;
import com.steps.serenity.HeaderSteps;
import com.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/LoginTestData.csv")
public class LoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginSteps anna;

    @Steps
            public HeaderSteps checks;

    String user,password;

    @Issue("#Login-Success")
    @Test
    public void loginTestSuccessful(){
        anna.is_the_home_page();
        anna.login(user,password);
        checks.checkYouAreLoggedIn();
        anna.logout();

    }

    @Issue("#Login-Fail")
    @Test
    public void loginTestFailed(){
        anna.is_the_home_page();
        anna.clickLoginButton();
        anna.login(user,password);
        checks.checkWrongUsername();
        anna.clickSubmitButton();

    }
}
