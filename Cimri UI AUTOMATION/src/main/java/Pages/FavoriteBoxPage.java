package Pages;

import Locators.Locator;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FavoriteBoxPage extends Locator {

    private WebDriver driver;
    private WebDriverWait wait;

    public FavoriteBoxPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        wait = new WebDriverWait(driver, 30);
    }


    private String accountMy = "//img[@src='https://assets.cimri.com/assets/profile.svg']";
    private String selectMyFavorite = "//a[@href='/uyelik/favorilerim']";
    private String goToFavoriteBox = "//a[@href='/uyelik/favori-listem/296084']";


    public void clickMyAccount() {
        ClickByXpath(accountMy);
    }
    public void clickMyFavorite() {
        ClickByXpath(selectMyFavorite);
    }

    public ProductPage selectProduct() {
        ClickByXpath(goToFavoriteBox);
        return new ProductPage(driver);

    }

}
