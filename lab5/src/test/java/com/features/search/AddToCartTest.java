package com.features.search;

import com.pages.AddToCartPage;
import com.steps.serenity.*;
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
@UseTestDataFrom("src/test/resources/EmailTestData.csv")
public class AddToCartTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginSteps anna;

    @Steps
    public AddToCartSteps addSteps;

    String username,password;

    @Issue("#Email-Success")
    @Test
    public void emailTest(){
        anna.is_the_home_page();
        anna.login(username,password);
        addSteps.add();
        anna.logout();
      //  emailSteps.send(to,subject,message);
       // anna.logout();
       // Assert.assertTrue(true);
    }






}
