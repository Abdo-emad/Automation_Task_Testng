import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.crypto.KeyAgreementSpi;
import java.util.concurrent.TimeUnit;

public class RightContextMenu {

WebDriver driver;
    @BeforeTest
    public void openBrowsers(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/context_menu");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    @Test
    public void contextMenu() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("hot-spot"));
        actions.moveToElement(element).contextClick().sendKeys(Keys.LEFT_ALT).release().build().perform();
        driver.switchTo().alert().accept();
        Thread.sleep(3000);


    }



    @AfterTest
    public void CloseBrowsers() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}
