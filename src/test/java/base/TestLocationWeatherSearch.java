package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Sp10WeatherPage;
import pages.WeatherPage;

public class TestLocationWeatherSearch extends BaseTests {

    @Test
    public void testSearchingForWeatherInSp10(){
        HomePage homePage = new HomePage(driver);
        homePage.clickWeather();
        WeatherPage weatherPage = new WeatherPage(driver);
        weatherPage.enterPostcode("SP10");
        Sp10WeatherPage sp10WeatherPage = new Sp10WeatherPage(driver);
        sp10WeatherPage.verifyLocation();
    }
}
