package java.Tests;

import java.Users.AccountInformation;
import java.Users.UserPool;
import Pages.*;
import org.testng.annotations.Test;


public class MainTest extends InitialTest {

    @Test
    public void CIMRI_LOGIN_Test_Scenario_1(){

        LoginPage loginPage = homePage.clickLogin();
        AccountInformation accountInformation = UserPool.getUserFirst();
        loginPage.Username(accountInformation.getEmail());
        loginPage.Password(accountInformation.getPassword());


        TechnologyPage technology =loginPage.LoginButton();
        technology.assertLoginControl();
        technology.SortingDesc();
        technology.SelectFavorite();
        technology.SendFavoriteBox();
        technology.SaveFavorite();

        FavoriteBoxPage favoriteBoxPage = technology.SaveFavorite();
        favoriteBoxPage.clickMyAccount();
        favoriteBoxPage.clickMyFavorite();

        ProductPage productPage = favoriteBoxPage.selectProduct();
        productPage.ListProduct();
        productPage.FindMinPriceProduct();

    }

}
