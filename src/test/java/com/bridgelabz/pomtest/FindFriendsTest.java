package com.bridgelabz.pomtest;

import com.bridgelabz.pom.base.TestBase;
import com.bridgelabz.pom.pages.*;
import com.bridgelabz.pom.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindFriendsTest extends TestBase{

    LoginPage loginPage;
    HomePage homePage;
    ProfilePage profilePage;
    GroupsPage groupsPage;
    FindFriends findFriends;
    TestUtil testUtil;

    public FindFriendsTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        profilePage = new ProfilePage();
        groupsPage = new GroupsPage();
        System.out.println("Logging in");
        homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("pass"));
        findFriends = new FindFriends();
        findFriends.clickOnFindFriends();
    }

    @Test(priority = 1)
    public void verifyFindFriendsTitleTest() {
        String findFriendsTitle = findFriends.verifyFindFriendsTitle();
        Assert.assertEquals(findFriendsTitle, "Facebook", "Home Page is Incorrect");
    }

    @Test(priority = 2)
    public void verifyFriendRequestLink(){
        findFriends.clickonFindFriend();
    }

    @Test(priority = 3)
    public void verifySuggestionsLink(){
        findFriends.clickonSuggestions();
    }

    @Test(priority = 4)
    public void verifyBirthdaysLink() {
        findFriends.clickonBithdays();
    }

    @Test(priority = 4)
    public void verifyCustomsLink()  {
        findFriends.clickonCustomLists();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
