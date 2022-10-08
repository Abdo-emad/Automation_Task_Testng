import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemove_Elements {

    public WebElement Add(WebDriver driver){

            return driver.findElement(By.cssSelector("button[onclick=\"addElement()\"]"));


    }
    public List<WebElement> Remove(WebDriver driver){
       List<WebElement> elements = driver.findElements(By.cssSelector("div[id=\"elements\"]"));
       return elements;

    }
}
