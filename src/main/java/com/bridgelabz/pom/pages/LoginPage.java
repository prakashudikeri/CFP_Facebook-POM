package com.bridgelabz.pom.pages;

import com.bridgelabz.pom.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

//Page Factory or Object Repositories

    @FindBy(name = "email")
    WebElement username;

    @FindBy(name = "pass")
    WebElement password;

    @FindBy(xpath = "//button[@name = 'login']")
    WebElement loginBtn;

    @FindBy(xpath = "//img[contains(@class, 'fb_logo _8ilh img')]")
    WebElement facebookLogo;

    public LoginPage() {
        //init = initialize elements with driver, this = current class (Page)object
        PageFactory.initElements(driver, this);
    }

    //Actions:
    public String validateLoginPageTitle() {
        return driver.getTitle();
    }

    //Feature:
    public boolean validateFaceBookImage() {
        return facebookLogo.isDisplayed();
    }

    public HomePage login(String un, String pwd) {
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();

        return new HomePage();
    }
}
