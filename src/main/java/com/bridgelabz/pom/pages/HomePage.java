package com.bridgelabz.pom.pages;

import com.bridgelabz.pom.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class HomePage extends TestBase {

    @FindBy(xpath = "//span[contains(text(), 'Prakash C U')]")
    @CacheLookup                        //Page Refresh - StaleMemoryException throw
    WebElement userNameLabel;

    @FindBy(xpath = "//div[@class ='j83agx80 l9j0dhe7']")
    WebElement dropDownLink;

//    @FindBy(xpath = "//div[@class ='qzhwtbm6 knvmm38d']")
    @FindBy(xpath = "//span[contains(text(),'Log Out')]")
    WebElement logOutLink;

    @FindBy(xpath = "//span[contains(text(), 'Groups')]")
    WebElement groupsLink;

    @FindBy(xpath = "//input[@placeholder = 'Search groups']")
    WebElement searchGroupsLink;

    @FindBy(xpath = "//span[@class = 'a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'")
    WebElement continueSearchGroupsLink;

    //Initializing the page objects - constructor of HomePage
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle() {
        return driver.getTitle();
    }

    public boolean verifyCorrectUserName() {
        return userNameLabel.isDisplayed();
    }

//    public LoginPage clickOnLogOut() {
//        dropDownLink.click();
//        logOutLink.click();
//       return new LoginPage();
//    }

    public LoginPage clickOnLogOutAction() {
        Actions action = new Actions(driver);
        action.moveToElement(dropDownLink).click().perform();
        logOutLink.click();
        return new LoginPage();
    }


    public GroupsPage searchGroups() {
        groupsLink.click();
        searchGroupsLink.sendKeys("Selenium");
//        searchGroupsLink.click();
//        continueSearchGroupsLink.click();
        keyBoardOperationsEnter();
        return new GroupsPage();
    }




}
