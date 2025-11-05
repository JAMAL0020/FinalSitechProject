package Login;

import Base.BaseTest;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static Util.ConfigReader.*;


public class LoginTest  extends BaseTest {

    @Test
    public void validLogin () throws IOException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login(getUsername(), getPassword());
        // loginPage.Login("standard_user", "secret_sauce"); //old method

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement cart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".shopping_cart_link")));
        Assert.assertTrue(driver.findElement(By.cssSelector(".shopping_cart_link")).isDisplayed());
    }

    @Test
    public void invalidLogin () throws IOException{

        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("standard_user700", getPassword());
        // loginPage.Login("standard_user700", "secret_sauce");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement errorLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error-button")));
        Assert.assertTrue(driver.findElement(By.cssSelector(".error-button")).isDisplayed());

            }

        }