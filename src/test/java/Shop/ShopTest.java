package Shop;

import Base.BaseTest;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static Util.ConfigReader.getPassword;
import static Util.ConfigReader.getUsername;

   public class ShopTest extends BaseTest {

    //private WebDriver driver;
    //use shoppingCartLogo
    //return as By 3shan astkhdmo b mkan thany

    @Test
    public void addHighestPriceItem () throws IOException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login(getUsername(), getPassword());

        WebElement sortDropdown = driver.findElement(By.cssSelector(".product_sort_container"));
        sortDropdown.click();
        driver.findElement(By.cssSelector("option[value='hilo']")).click();

        WebElement firstAddToCartButton = driver.findElements(By.cssSelector("button.btn_inventory")).get(0);

        String highestItemName = driver.findElements(By.className("inventory_item_name")).get(0).getText();
        System.out.println(highestItemName);
        firstAddToCartButton.click();

        String highestItemPrice = driver.findElements(By.className("inventory_item_price")).get(0).getText();
        System.out.println(highestItemPrice);

//      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
        cartIcon.click();

        WebElement CheckoutButton = driver.findElement(By.id("checkout"));
        Assert.assertTrue(CheckoutButton.isDisplayed());

    }

    @Test
       public void addAllProducts() throws IOException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login(getUsername(), getPassword());

        List<WebElement> AddToCartButtons = driver.findElements(By.className("btn"));
        for (int i = 0; i < AddToCartButtons.size(); i = i + 1) {
            AddToCartButtons.get(i).click();
            }
        }
    }





