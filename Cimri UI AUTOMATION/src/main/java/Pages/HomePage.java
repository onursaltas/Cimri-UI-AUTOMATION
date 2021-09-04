package Pages;

import Locators.Locator;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Locator  {

    private WebDriverWait wait;
    private WebDriver driver;

    private String login=".account-user";
    String loginUrl = "https://www.cimri.com/uyelik/giris-yap?redirectUrl=%2Ffirsatlar";

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }


    public LoginPage clickLogin() {

        driver.get(loginUrl);
        return new LoginPage(driver);
    }

}
