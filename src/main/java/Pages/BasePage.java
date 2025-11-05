package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.Properties;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
//        WebDriverManager.chromedriver().setup();
//        driver.manage().window().maximize();
//        driver.get("https://www.saucedemo.com/");

//        PageFactory.initElements(driver, this);

    }

}
