package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private static final String HomePage_URL = "https://pastebin.com/";
    private WebDriver driver;

    @FindBy(xpath = "//*[@id='postform-text']")
    private WebElement cont;

    @FindBy(xpath = "//button[text()='Create New Paste']")
    private WebElement pastE;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public HomePage openPage() {
        driver.get(HomePage_URL);
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='PostForm[text]']")));
        return this;
    }

    public ResultPage FillForTerms(String term) {
        cont.sendKeys(term);
        pastE.click();
        return new ResultPage(driver, term);

    }
}







