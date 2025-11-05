package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {super(driver);}

        By usernameLocator = By.id("user-name");

        By passwordLocator = By.id("password");

        By loginButtonLocator = By.id("login-button");


        public void Login (String username, String password){

            driver.findElement(usernameLocator).sendKeys(username);
            driver.findElement(passwordLocator).sendKeys(password);
            driver.findElement(loginButtonLocator).click();

        }



//        public boolean isShoppingCartLogoVisable (){
//            return driver.findElement(shoppingCartLogoLocator).isDisplayed();
//
//            // where can can i use this isShoppingCartLogoVisable in logintest or shoptest
//
//        }


}





