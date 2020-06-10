package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By searchBar = By.id("orb-search-q");
    private By searchButton = By.cssSelector("#searchboxDrawerForm > button.se-searchbox__submit");
    private By signInButton = By.id("idcta-username");
    private By navigationMenuHome = By.cssSelector("#orb-modules > header > div:nth-child(2) > div:nth-child(1) > div.gs-u-display-none.gs-u-display-block\\@m.nw-o-news-wide-navigation > nav > ul > li.gs-o-list-ui__item--flush.gel-long-primer.gs-u-display-block.gs-u-float-left.nw-c-nav__selected.nw-c-nav__wide-menuitem-container > a > span:nth-child(1)");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Login to account
    public SignInPage clickSignIn(){
        driver.findElement(signInButton).click();
        return new SignInPage(driver);
    }

    //Search for a term
    public HomePage enterSearchTerm(String searchTerm){
        driver.findElement(searchBar).sendKeys(searchTerm);
        return new HomePage(driver);
    }

    public CoronavirusPage clickSearch(){
        driver.findElement(searchButton).click();
        return new CoronavirusPage(driver);
    }

    public String verifyReturnToHomepage(){
        return driver.findElement(navigationMenuHome).getText();
    }




}