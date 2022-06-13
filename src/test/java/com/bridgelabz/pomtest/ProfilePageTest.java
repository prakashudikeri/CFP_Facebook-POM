package com.bridgelabz.pomtest;

import com.bridgelabz.pom.base.TestBase;
import com.bridgelabz.pom.pages.HomePage;
import com.bridgelabz.pom.pages.LoginPage;
import com.bridgelabz.pom.pages.ProfilePage;
import com.bridgelabz.pom.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    ProfilePage profilePage;

    public ProfilePageTest() {
        super();
    }

    // Avoid dependency between TC. Relaunch Browser after each TC.
    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        profilePage = new ProfilePage();
        homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("pass"));
    }

    @Test(priority = 1)
    public void bioDataEntryTest() {
        profilePage.addBioProfile();
    }

    @Test(priority = 2)
    public void checkBioDataEntryTest() {
        profilePage.checkBioDataEntry();
    }

    @Test (priority = 3)
    public void checkLocationTest(){
        String checkLocation = profilePage.checkLocationData();
        Assert.assertEquals(checkLocation, "Belgaum", "Location did not match");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
