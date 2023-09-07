package com.parabank.parasoft.test.pages;

import com.parabank.parasoft.test.baseTest.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateContactInfoPage extends BaseTest {
    @FindBy(css = "#customer\\.firstName")
    WebElement firstNameEl;

    @FindBy(css = "#customer\\.lastName")
    WebElement lastNameEl;

    @FindBy(css = "#customer\\.address\\.street")
    WebElement addressEl;

    @FindBy(css = "[value = 'Update Profile']")
    WebElement updateProfileBtnEl;

    @FindBy(css = "#rightPanel h1")
    WebElement profileUpdateTextEl;

    public UpdateContactInfoPage() {
        PageFactory.initElements(driver, this);
    }

    public UpdateContactInfoPage fillFirstName(String firstName) {
        firstNameEl.isDisplayed();
        firstNameEl.clear();
        firstNameEl.sendKeys(firstName);
        return this;
    }

    public UpdateContactInfoPage fillLastName(String lastName) {
        lastNameEl.isDisplayed();
        lastNameEl.clear();
        lastNameEl.sendKeys(lastName);
        return this;
    }

    public UpdateContactInfoPage fillAddress(String address) {
        addressEl.isDisplayed();
        addressEl.clear();
        addressEl.sendKeys(address);
        return this;
    }

    public UpdateContactInfoPage clickUpdateProfileBtn() {
        updateProfileBtnEl.isDisplayed();
        updateProfileBtnEl.click();
        return this;
    }

    public boolean isProfileUpdatedTextDisplayed(){
        return profileUpdateTextEl.isDisplayed();
    }
}
