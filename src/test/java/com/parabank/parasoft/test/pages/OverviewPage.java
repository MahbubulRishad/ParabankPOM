package com.parabank.parasoft.test.pages;

import com.parabank.parasoft.test.baseTest.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage extends BaseTest {
    @FindBy(xpath = "//a[@href=\"/parabank/logout.htm\"]")
    WebElement logoutLinkEl;

    public OverviewPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isLogoutLinkDisplayed(){
        return logoutLinkEl.isDisplayed();
    }
}
