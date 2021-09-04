package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Locators.Locator;
public class LoginPage extends Locator {


    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);

    }

    private String nameField = "//input[@name='email']";
    private String passwordField = "//input[@name='password']";
    private String loginButton = "//*[text()[contains(.,'Giriş Yap')]]//ancestor::button[@class='sc-iCoGMd juPwmI']";

    public void Username(String name) {
        SendByXpath(nameField,name);
    }

    public void Password(String password) {
        SendByXpath(passwordField,password);
    }

    public TechnologyPage LoginButton() {
        ClickByXpath(loginButton);
        return new TechnologyPage(driver);
    }





}
