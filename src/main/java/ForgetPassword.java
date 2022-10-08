import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetPassword {


    public WebElement emailField(WebDriver driver){
          return driver.findElement(By.id("email"));
    }
    public WebElement retrieveBtn(WebDriver driver){
        return  driver.findElement(By.id("form_submit"));
    }



}
