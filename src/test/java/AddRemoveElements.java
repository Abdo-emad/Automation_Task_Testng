import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddRemoveElements {
    WebDriver driver ;
    AddRemove_Elements addRemove_elements = new AddRemove_Elements();

    @BeforeTest
    public void openBrowsers(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void add() throws InterruptedException {

            addRemove_elements.Add(driver).click();

        Thread.sleep(3000);

    }
    @Test
    public void delete() throws InterruptedException {

        addRemove_elements.Remove(driver).get(0).click();

        Thread.sleep(3000);

    }
    @AfterTest
    public void CloseBrowsers() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }

}
