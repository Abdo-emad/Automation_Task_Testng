import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPage {
        WebDriver driver = null;
        Login login ;

        @BeforeTest
        public void openBrowsers(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://the-internet.herokuapp.com/login");
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            login= new Login(driver);
        }
    public  void  loginSteps(String userName, String password){
        login.userName().sendKeys(userName);
        login.Password().sendKeys(password);
        login.userName().sendKeys(userName);
        login.Password().sendKeys(password);

    }
        @Test(priority = 1)
        public void ValidData(){
            driver.navigate().to("https://the-internet.herokuapp.com/login");
            loginSteps("tomsmith","SuperSecretPassword!");
            login.Password().submit();

        }


        @Test(priority = 2)
        public void InValidData(){
            driver.navigate().to("https://the-internet.herokuapp.com/login");
            loginSteps("tomsmith","SuperSecret");
            login.Password().submit();
        }

        @AfterTest
        public void CloseBrowsers() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();

        }

    }


