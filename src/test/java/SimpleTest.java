import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import sun.plugin2.message.WindowActivationEventMessage;

import static org.openqa.selenium.By.id;

public class SimpleTest {

    @Test

    public void navigateToVkontakte (){

        //heellloooooo

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://vk.com/");

        WebElement element = driver.findElement(By.cssSelector("#quick_email"));
        element.clear();
        element.sendKeys("it.keep@yandex.ru");

        WebElement password = driver.findElement(By.cssSelector("#quick_pass"));
        password.clear();
        password.sendKeys("12345");

        WebElement button = driver.findElement(By.cssSelector("#quick_login_button"));
        button.click();

    }
}
