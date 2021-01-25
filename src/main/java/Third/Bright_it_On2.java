package Third;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bright_it_On2 {

    @Test
    public void CreateOne2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com/");

        WebElement Cont = driver.findElement(By.xpath("//*[@id='postform-text']"));
        Cont.sendKeys("Hello from WebDriver");

        WebElement Highlighting = driver.findElement(By.xpath("//div[@class='toggle__control']"));
        Highlighting.click();

        Thread.sleep(3000);

        WebElement PastE = driver.findElement(By.xpath("//*[@id='select2-postform-expiration-container']"));
        PastE.click();

        WebElement PastEE = driver.findElement(By.xpath("//li[text()='10 Minutes']"));
        PastEE.click();

        WebElement ContE = driver.findElement(By.xpath("//*[@id='postform-name']"));
        ContE.sendKeys("how to gain dominance among developers");

        WebElement MainButton = driver.findElement(By.xpath("//button[text()='Create New Paste']"));
        MainButton.click();

        WebElement Title = driver.findElement(By.xpath("//button[text()='Create New Paste']"));
        String ExpectedText = "how to gain dominance among developers";

        //option2

        Assert.assertTrue(Highlighting.isSelected());
        System.out.println("Toggle is selected - Assert passed");

        //option3

        driver.quit();
    }
}

