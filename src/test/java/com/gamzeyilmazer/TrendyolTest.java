package com.gamzeyilmazer;

import com.gamzeyilmazer.base.TestBase;
import com.gamzeyilmazer.pages.HomePage;
import com.gamzeyilmazer.pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TrendyolTest extends TestBase{

    LoginPage loginPage;
    HomePage homePage;

    @BeforeClass
    public void setUp(){
        initialize();
        homePage=new HomePage();
    }

    @Test(priority = 1)
    public void loginTest(){
        loginPage=homePage.navigateToLoginPage();
        homePage=loginPage.login(prop.getProperty("email"),prop.getProperty("password"));
//        Assert.assertEquals(homePage.isUsernameDisplayed(),"Gamze Test");
    }

//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }


}
