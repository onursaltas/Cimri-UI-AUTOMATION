package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TechnologyPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public PrimaryPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        wait = new WebDriverWait(driver, 30);
    }

    private String sortingDesc = "//a[@href='/elektronik?sort=price%2Casc']";
    private String selectFavorite = "//div[@data-productid='265892699']//child::div[3]//child::button[1]";
    private String sendFavoriteBox = "//div[@class='o02k10-3 kYBrwS']";
    private String saveFavorite = "//*[text()[contains(.,'Kaydet')]]";
    private String actualControl = "//a[@href='/kampanyalar-ve-indirim-kuponlari']//following::div[4]//child::p[1]";
    String expectedLoginControl = "Hoş Geldiniz";

    public void assertLoginControl() {

        String actualLoginControl=GetTextByXpath(actualControl);
        Assert.assertEquals(expectedLoginControl, actualLoginControl);
    }

    public void SortingDesc() {

        ClickByXpath(sortingDesc);
    }
    public void SelectFavorite() {

        ClickByXpath(selectFavorite);
    }
    public void SendFavoriteBox() {

        ClickByXpath(sendFavoriteBox);
    }


    public FavoriteBoxPage SaveFavorite() {
        ClickByXpath(saveFavorite);
        return new FavoriteBoxPage(driver);
    }
}
