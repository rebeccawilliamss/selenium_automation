package base;

import org.testng.annotations.Test;
import pages.CoronavirusPage;
import pages.CoronavirusWhatsNextPage;

public class TestEpisode extends BaseTests {
    

    @Test
    public void testEpisodeExists(){
        CoronavirusPage coronavirusPage = new CoronavirusPage(driver);
        coronavirusPage.clickLink();
        CoronavirusWhatsNextPage coronavirusWhatsNextPage = new CoronavirusWhatsNextPage(driver);
        coronavirusWhatsNextPage.verifyEpisode().contains("30/05/2020");
    }
}
