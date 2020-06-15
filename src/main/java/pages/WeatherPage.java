package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WeatherPage {

    private WebDriver driver;

    private By searchBar =By.id("ls-c-search__input-label");

    public WeatherPage(WebDriver driver){
        this.driver = driver;
    }

    public Sp10WeatherPage enterPostcode(String text){
        driver.findElement(searchBar).sendKeys(text);
        return new Sp10WeatherPage(driver);

    }


}
