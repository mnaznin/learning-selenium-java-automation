/**
 * Created by Mahmuda.Naznin on 10/6/2017.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoConfirmFuchkaRecepie {

        public static void main(String[] args){
            WebDriver driver;
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\mahmuda.naznin\\Downloads\\geckodriver-v0.19.0-win64\\geckodriver.exe");

            driver=new FirefoxDriver();
            driver.get("https://duckduckgo.com/");
            WebElement element=driver.findElement(By.id("search_form_input_homepage"));
            element.sendKeys("Bangladesi Fuchka recepie");

            WebElement button=driver.findElement(By.id("search_button_homepage"));
            button.click();
        }
}
