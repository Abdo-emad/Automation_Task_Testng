import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BasicAuthAlert {


    WebDriver driver = null;
    @BeforeTest
    public void openBrowsers(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/basic_auth");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void AlertHandel() throws InterruptedException {
 driver.switchTo().alert().sendKeys("admin");
  driver.findElement(By.id("user")).sendKeys("hhhh");
  driver.switchTo().alert().sendKeys("admin");
  driver.switchTo().alert().accept();
  Thread.sleep(3000);
    }
    @AfterTest
    public void CloseBrowsers() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }

}
