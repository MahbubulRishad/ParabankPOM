package com.parabank.parasoft.test.testCases;

import com.parabank.parasoft.test.baseTest.BaseTest;
import com.parabank.parasoft.test.pages.CustomerLoginPage;
import com.parabank.parasoft.test.pages.OpenAccountPage;
import com.parabank.parasoft.test.pages.OverviewPage;
import com.parabank.parasoft.test.util.General;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenAccountTest extends BaseTest {
    CustomerLoginPage customerLoginPage;
    OverviewPage overviewPage;
    OpenAccountPage openAccountPage;

    public OpenAccountTest() {
        super();
    }

    @BeforeClass
    public void init() {
        setUpBrowser();
        customerLoginPage = new CustomerLoginPage();
        overviewPage = customerLoginPage.login(getUserName(), getPassword());
    }

    @Test
    public void openNewBankAccountShouldSuccessful() {
        openAccountPage = overviewPage
                .clickOpenNewAccountLink()
                .selectAccountTypeDropDown()
                .selectAmountTypeDropDown()
                .clickOpenNewAccountBtn();

        Assert.assertTrue(openAccountPage.hasDisplayNewAccountId());
    }

    @AfterClass
    public void tearDown() {
        General.domStable();
        driver.quit();
    }
}
