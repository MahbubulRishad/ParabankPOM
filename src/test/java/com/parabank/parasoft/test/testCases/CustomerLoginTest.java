package com.parabank.parasoft.test.testCases;

import com.parabank.parasoft.test.baseTest.BaseTest;
import com.parabank.parasoft.test.pages.CustomerLoginPage;
import com.parabank.parasoft.test.pages.OverviewPage;
import com.parabank.parasoft.test.util.General;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerLoginTest extends BaseTest {
    CustomerLoginPage customerLoginPage;
    OverviewPage overviewPage;

    @BeforeClass
    public void init() {
        setUpBrowser();
    }

    public CustomerLoginTest() {
        super();
    }

    @Test
    public void loginShouldSucceed() {
        customerLoginPage = new CustomerLoginPage();

        overviewPage = customerLoginPage
                .fillUsername(getUserName())
                 .fillPassword(getPassword())
                .clickLoginBtn();

        Assert.assertTrue(overviewPage.isLogoutLinkDisplayed());
    }


    @AfterClass
    public void tearDown() {
        General.domStable();
        driver.quit();
    }
}
