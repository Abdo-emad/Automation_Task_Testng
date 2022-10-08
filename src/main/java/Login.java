import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    WebDriver driver;
    public  Login(WebDriver driver){
        this.driver= driver;
    }

    public WebElement userName(){
        By username =By.id("username");
        WebElement userName= driver.findElement(username);
        return userName;
    }
    public WebElement Password(){
        By password =By.id("password");
        WebElement Password= driver.findElement(password);
        return Password;
    }

}
