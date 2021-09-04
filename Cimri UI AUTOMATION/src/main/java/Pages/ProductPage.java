package Pages;

import Locators.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends Locator {

    WebDriver driver;
    WebDriverWait wait;
    public static String productPrice;



    public ProductPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        wait = new WebDriverWait(driver, 30);
    }


    private String listAllProduct = "//a[@class='sc-fujyAs jbjQZl'] ";
    private String findMinPriceProduct = "//*[text()[contains(.,' fiyat bulunduruyor.')]]//following::table//child::tr[1]//child::td[2]";
    private String basketLinkPath = "dIB";

    public void ListProduct() {

        ClickByXpath(listAllProduct);
    }
    public void FindMinPriceProduct() {

        ClickByXpath(findMinPriceProduct);
    }






}
