package com.bridgelabz.pomtest;

import com.bridgelabz.pom.base.TestBase;
import com.bridgelabz.pom.pages.HomePage;
import com.bridgelabz.pom.pages.LoginPage;
import com.bridgelabz.pom.util.TestUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.bridgelabz.pom.base.TestBase.*;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    String sheetName = "contacts";


    public LoginPageTest() {
        super();                //Constructor - Initialize prop + NoNullPointer e
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "Facebook – log in or sign up");
    }

    @Test(priority = 2)
    public void faceBookLogoImageTest() {
        boolean flag = loginPage.validateFaceBookImage();
        Assert.assertTrue(flag);
    }

    @Test(priority = 3)
    public void loginTest() {
        homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("pass"));
    }


    @DataProvider
    public Object[][] getCRMTestData(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return data;
    }

    @Test (priority = 4, dataProvider = "getCRMTestData")

        public void loginTest(String username, String password) {

        }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
