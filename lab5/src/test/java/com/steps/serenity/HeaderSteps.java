package com.steps.serenity;

import com.pages.HeaderPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HeaderSteps {
    HeaderPage headerPage;
    @Step
    public void checkYouAreLoggedIn() {
        Assert.assertTrue("You are not logged in", headerPage.isLogoutButtonVisible());
    }
    @Step
    public void checkWrongUsername() {
        Assert.assertTrue("Incorrect username or password ", headerPage.isAccountIncorrect());
    }

}
