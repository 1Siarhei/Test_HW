package test;

import Page.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class I_Can_Win_True {

    private WebDriver driver;

    @BeforeMethod (alwaysRun = true)
    public void browserSetup () {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test (description = "First test")
    public void CreateOne() {

         new HomePage(driver)
                .openPage ()
                .FillForTerms ("helloweb")
                .Check();


        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "helloweb - Pastebin.com";
        Assert.assertEquals(ExpectedTitle, ActualTitle);;
    }

    @AfterMethod (alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver=null;
    }


}


