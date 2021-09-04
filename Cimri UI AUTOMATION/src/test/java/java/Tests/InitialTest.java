package java.Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.*;
import Locators.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class InitialTest {

    private static WebDriver driver;
    public static HomePage homePage;


    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cimri.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "";
        Assert.assertEquals(expectedTitle, actualTitle);
        //driver.findElement(advertisement);
        homePage = new HomePage(driver);


    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }


}
