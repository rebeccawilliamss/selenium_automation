package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By searchBar = By.id("orb-search-q");
    private By searchButton = By.cssSelector("#searchboxDrawerForm > button.se-searchbox__submit");

    public HomePage(WebDriver driver){
        this.driver = driver;
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



}