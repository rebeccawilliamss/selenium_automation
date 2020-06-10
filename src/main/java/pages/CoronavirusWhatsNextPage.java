package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoronavirusWhatsNextPage {

    private WebDriver driver;

    private By episodeDate = By.cssSelector("#orb-modules > div > div > div.text-base.programmes-page.programmes-page--smallpush.b-g-p > div.br-box-page.programmes-page > ol > div:nth-child(1) > div.programme__body > h2 > a");

    public CoronavirusWhatsNextPage(WebDriver driver){
        this.driver = driver;
        }

    public String verifyEpisode(){
        return driver.findElement(episodeDate).getText();
    }



}

