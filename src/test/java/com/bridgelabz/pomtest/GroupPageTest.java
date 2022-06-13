package com.bridgelabz.pomtest;

import com.bridgelabz.pom.base.TestBase;
import com.bridgelabz.pom.pages.GroupsPage;
import com.bridgelabz.pom.pages.HomePage;
import com.bridgelabz.pom.pages.LoginPage;
import com.bridgelabz.pom.pages.ProfilePage;
import com.bridgelabz.pom.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    ProfilePage profilePage;
    GroupsPage groupsPage;

    public GroupPageTest() {
        super();
    }

    // Avoid dependency between TC. Relaunch Browser after each TC.
    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        profilePage = new ProfilePage();
        groupsPage = new GroupsPage();
        homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("pass"));

    }

    @Test(priority = 1)
    public void createNewGroupTest() {
       homePage.searchGroups();

    }


}
