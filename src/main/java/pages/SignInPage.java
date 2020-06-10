package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    private WebDriver driver;

    private By username = By.id("user-identifier-input");
    private By password = By.id("password-input");
    private By singInButton = By.id("submit-button");


    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String userName){
        WebElement element = (new WebDriverWait(driver, 3).until(ExpectedConditions.presenceOfElementLocated(username)));
        driver.findElement(username).sendKeys(userName);
    }

    public void setPassword(String passWord){
        driver.findElement(password).sendKeys(passWord);
    }

    public HomePage clickSignIn(){
        driver.findElement(singInButton).click();
        return new HomePage(driver);
    }
}
