package Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;


import static Util.ConfigReader.getUrl;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void SetupClass() {

        WebDriverManager.chromedriver().setup();

    }

    @BeforeMethod
    public void SetupTest () throws IOException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());
        //driver.get("https://www.saucedemo.com/");

    }

    @AfterMethod
    public void out () throws InterruptedException {
            if (driver != null) {
            Thread.sleep(3000);
         // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.quit();
            }
        }
    }






