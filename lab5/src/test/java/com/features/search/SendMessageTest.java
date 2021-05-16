package com.features.search;

import com.steps.serenity.EmailSteps;
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
@UseTestDataFrom("src/test/resources/EmailTestData.csv")
public class SendMessageTest {
    /*
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginSteps anna;

    @Steps
    public EmailSteps emailSteps;

    String to,subject,message,username,password;

    @Issue("#Email-Success")
    @Test
    public void emailTest(){
        anna.is_the_home_page();
       // anna.login(username,password);
      //  emailSteps.send(to,subject,message);
       // anna.logout();
       // Assert.assertTrue(true);
    }




     */

}
