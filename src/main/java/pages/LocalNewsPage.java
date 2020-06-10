package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocalNewsPage {

    private WebDriver driver;

    private By localNewsIsChangingLink = By.cssSelector("#u26449747616425157 > div > div > div > a");
    private By localNewsSearchBar = By.id("ls-c-search__input-label");
    private By andoverHampshireOption = By.cssSelector("#location-list > li:nth-child(1) > a");

    public LocalNewsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyOnLocalNewsPage() {
        driver.findElement(localNewsIsChangingLink).isDisplayed();
    }

    public void searchForAndover(String text) {
        driver.findElement(localNewsSearchBar).sendKeys(text);
    }

    public LocalNewsAndoverPage selectAndover(){
        driver.findElement(andoverHampshireOption).click();
        return new LocalNewsAndoverPage(driver);
    }
}


