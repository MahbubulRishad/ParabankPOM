package com.parabank.parasoft.test.pages;

import com.parabank.parasoft.test.baseTest.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage extends BaseTest {
    @FindBy(css = "#type")
    WebElement accountTypeDropDownEl;

    @FindBy(css = "#fromAccountId")
    WebElement amountTypeDropDownEl;

    @FindBy(css = "[value = \"Open New Account\"]")
    WebElement openNewAccountBtnEl;

    @FindBy(css = "#newAccountId")
    WebElement newAccountIdEl;

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public OpenAccountPage selectAccountTypeDropDown() {
        Select selectAccountTypeDropDown = new Select(accountTypeDropDownEl);
        selectAccountTypeDropDown.selectByValue("1");
        return this;
    }

    public OpenAccountPage selectAmountTypeDropDown() {
        Select selectAmountTypeDropDown = new Select(amountTypeDropDownEl);
        selectAmountTypeDropDown.selectByIndex(0);
        return this;
    }

    public OpenAccountPage clickOpenNewAccountBtn() {
        openNewAccountBtnEl.isDisplayed();
        openNewAccountBtnEl.click();
        return this;
    }

    public boolean hasDisplayNewAccountId() {
        return newAccountIdEl.isDisplayed();
    }
}
