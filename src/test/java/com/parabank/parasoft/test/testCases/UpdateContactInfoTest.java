package com.parabank.parasoft.test.testCases;

import com.parabank.parasoft.test.baseTest.BaseTest;
import com.parabank.parasoft.test.pages.CustomerLoginPage;
import com.parabank.parasoft.test.pages.OverviewPage;
import com.parabank.parasoft.test.pages.UpdateContactInfoPage;
import com.parabank.parasoft.test.util.General;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UpdateContactInfoTest extends BaseTest {
    CustomerLoginPage customerLoginPage;
    OverviewPage overviewPage;
    UpdateContactInfoPage updateContactInfoPage;

    public UpdateContactInfoTest(){
        super();
    }

    @BeforeClass
    public void init(){
        setUpBrowser();
        customerLoginPage = new CustomerLoginPage();
        overviewPage = customerLoginPage
                .login(getUserName(), getPassword());
    }

    @Test
    public void profileUpdateShouldSuccessful(){
        updateContactInfoPage = overviewPage
                .clickUpdateContactInfoLink()
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getCity())
                .clickUpdateProfileBtn();

        Assert.assertTrue(updateContactInfoPage.isProfileUpdatedTextDisplayed());
    }

    @AfterClass
    public void teatDown(){
        General.domStable();
        driver.quit();
    }
}
