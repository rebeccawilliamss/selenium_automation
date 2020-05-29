package base;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.CoronavirusPage;
import pages.HomePage;

public class TestSearching extends base.BaseTests {

    //static WebDriver driver;

    // This test will verify whether a user can search for a term in the search bar
    @Test
    public void testSearchingATerm(){

        SetUp();

        HomePage homePage = new HomePage(driver);
        homePage.enterSearchTerm("Coronavirus");
        CoronavirusPage coronavirusPage = new CoronavirusPage(driver);
        homePage.clickSearch();
        assertTrue(coronavirusPage.verifySuggestion().contains("Coronavirus"));

        tearDown();

    }
}
