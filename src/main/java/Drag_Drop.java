import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Drag_Drop {

    public WebElement drag (WebDriver driver){

        return driver.findElement(By.id("column-a"));
    }
    public WebElement drop (WebDriver driver){

        return driver.findElement(By.id("column-b"));
    }
}
