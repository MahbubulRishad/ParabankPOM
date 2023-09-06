package com.parabank.parasoft.test.pages;

import com.parabank.parasoft.test.baseTest.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage extends BaseTest {
    @FindBy(xpath = "//a[@href=\"/parabank/logout.htm\"]")
    WebElement logoutLinkEl;

    @FindBy(css = "a[href*='openaccount']")
    WebElement openNewAccountLinkEl;

    public OverviewPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isLogoutLinkDisplayed(){
        return logoutLinkEl.isDisplayed();
    }

    public OpenAccountPage clickOpenNewAccountLink(){
        openNewAccountLinkEl.isDisplayed();
        openNewAccountLinkEl.click();
        return new OpenAccountPage();
    }
}
