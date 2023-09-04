package com.parabank.parasoft.test.pages;

import com.parabank.parasoft.test.baseTest.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends BaseTest {
    @FindBy(name = "username")
    WebElement usernameEl;

    @FindBy(name = "password")
    WebElement passwordEl;

    @FindBy(css = ".login [value=\"Log In\"]")
    WebElement loginBtn;

    @FindBy(css = ".error")
    WebElement loginErrorEl;

    // Initialize locators in this page
    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    //    fill username
    public CustomerLoginPage fillUsername(String username) {
        usernameEl.isDisplayed();
        usernameEl.clear();
        usernameEl.sendKeys(username);
        return this;
    }

    //    fill password
    public CustomerLoginPage fillPassword(String password) {
        passwordEl.isDisplayed();
        passwordEl.clear();
        passwordEl.sendKeys(password);
        return this;
    }

    //    click logIn Btn
    public OverviewPage clickLoginBtn() {
        loginBtn.isDisplayed();
        loginBtn.click();
        return new OverviewPage();
    }

    //    Click Login button for only username not filling password
    public CustomerLoginPage clickLoginBtnOnlyUsername() {
        loginBtn.isDisplayed();
        loginBtn.click();
        return this;
    }

    public boolean hasErrorOnlyUsername() {
        return loginErrorEl.isDisplayed();
    }

    public OverviewPage login(String username, String password) {
        fillUsername(username);
        fillPassword(password);
        clickLoginBtn();
        return new OverviewPage();
    }

    public CustomerLoginPage login(String username) {
        fillUsername(getUserName());
        clickLoginBtnOnlyUsername();
        return this;
    }

}
