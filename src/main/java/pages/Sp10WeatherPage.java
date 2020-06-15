package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sp10WeatherPage {

    private WebDriver driver;

    private By todaysWeather = By.id("daylink-0");

    public Sp10WeatherPage(WebDriver driver){
        this.driver = driver;
    }

    public void verifyLocation(){
        WebElement element = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(todaysWeather));
        element.isDisplayed();
}
}
