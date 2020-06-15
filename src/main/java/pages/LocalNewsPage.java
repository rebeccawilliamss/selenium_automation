package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocalNewsPage {

    private WebDriver driver;

    private By localNewsSearchBar = By.id("ls-c-search__input-label");
    private By andoverHampshireOption = By.cssSelector("#location-list > li:nth-child(1) > a");

    public LocalNewsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchForPlace(String text){
        driver.findElement(localNewsSearchBar).sendKeys(text);
    }


    public LocalNewsAndoverPage selectAndover(){
        driver.findElement(andoverHampshireOption).click();
        return new LocalNewsAndoverPage(driver);
    }
}


