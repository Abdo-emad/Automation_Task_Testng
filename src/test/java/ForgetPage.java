import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ForgetPage {
    WebDriver driver ;
    ForgetPassword forgetPassword = new ForgetPassword();
    @BeforeMethod
    public void openBrowsers(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/forgot_password");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void email(){

        forgetPassword.emailField(driver).sendKeys("ahaguagh@yahoo.com");
    }
    @Test
    public void RetrieveBtn(){

        forgetPassword.retrieveBtn(driver).click();

    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
