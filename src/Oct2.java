/**
 * Created by Mahmuda.Naznin on 10/2/2017.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Oct2 {
    public static void main(String[] args){
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\mahmuda.naznin\\Downloads\\geckodriver-v0.19.0-win64\\geckodriver.exe");

        driver=new FirefoxDriver();
        driver.get("https://bos-qa-app-12c.americanwell.com/loginConsumer.htm");
        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
    }
}

