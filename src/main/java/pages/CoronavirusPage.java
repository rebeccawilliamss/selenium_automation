package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoronavirusPage {

    private WebDriver driver;

    private By coronavirusNewscastLink = By.cssSelector("#main-content > div > div.css-1v7bxtk-StyledContainer.eu4yxp60 > div > div > ul > li:nth-child(1) > div > div.css-zgpl6u-PromoContent.ett16tt9 > div.css-1clxkly-PromoContentSummary.ett16tt10 > p.css-1aofmbn-PromoHeadline.ett16tt4 > a");
    private By whatsNextLink = By.cssSelector("#main-content > div > div.css-1v7bxtk-StyledContainer.eu4yxp60 > div > div > ul > li:nth-child(5) > div > div.css-zgpl6u-PromoContent.ett16tt9 > div.css-1clxkly-PromoContentSummary.ett16tt10 > p.css-1aofmbn-PromoHeadline.ett16tt4 > a");


    public CoronavirusPage(WebDriver driver){
        this.driver = driver;
    }

    public String verifySuggestion(){
        return driver.findElement(coronavirusNewscastLink).getText();
    }

    public CoronavirusWhatsNextPage clickLink(){
        driver.findElement(whatsNextLink).click();
        return new CoronavirusWhatsNextPage(driver);
    }
}
