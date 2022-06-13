package com.bridgelabz.pom.pages;

import com.bridgelabz.pom.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GroupsPage extends TestBase {

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]" +
            "/div[3]/div[1]/div[2]/div[1]/div[3]/a[1]/div[1]/div[1]/div[2]/span[1]/span[1]")
    WebElement createNewGroup;

    @FindBy(xpath = "//span[contains (text(), 'Group name')]")
    WebElement enterGroupName;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]" +
            "/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/div[1]/" +
            "div[1]")
    WebElement choosePrivacy;

    @FindBy(xpath = "//span[contains(text(), 'Anyone can see who's in the group and what they post')]")
    WebElement selectPrivacy;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]" +
            "/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]")
    WebElement createGroup;

    //Initializing the page objects - constructor of HomePage
    public GroupsPage() {
        PageFactory.initElements(driver, this);
    }

    public void createGroupPage() {


    }
}
