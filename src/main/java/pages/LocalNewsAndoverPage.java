package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocalNewsAndoverPage {

    private WebDriver driver;

    private By setLocalNewsButton = By.cssSelector("#masthead-component-location > div > div.masthead__options > div.nw-c-local-container > div.js-local-news.nw-c-local.gs-u-box-size > div > div > div.js-subheading.nw-c-local__heading.gs-u-display-block > div > div > div.js-confirm-location.nw-c-local__confirm-message > div > div > button");

    public LocalNewsAndoverPage(WebDriver driver){
        this.driver = driver;
    }

    public void verifyOnAndoverPage(){
        driver.findElement(setLocalNewsButton).isDisplayed();
    }

}
