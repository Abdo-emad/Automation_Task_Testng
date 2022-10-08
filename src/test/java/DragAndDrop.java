import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {

        WebDriver driver ;
       Drag_Drop drag_drop = new Drag_Drop();

        @BeforeTest
        public void openBrowsers(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @Test(priority = 1)
        public void DragData(){
        Actions actions = new Actions(driver);

            actions.dragAndDrop(drag_drop.drag(driver), drag_drop.drop(driver)).release().perform();
        }

        @AfterTest
        public void CloseBrowsers() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();

        }

    }

