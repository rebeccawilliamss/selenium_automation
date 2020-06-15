package base;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LocalNewsAndoverPage;
import pages.LocalNewsPage;

public class TestSearchingAndover extends BaseTests {

    @Test
    public void testSearchingForAndoverInLocalNews() {
        driver.get("https://www.bbc.co.uk/news/localnews");
        LocalNewsPage localNewsPage = new LocalNewsPage(driver);
        localNewsPage.searchForPlace("Andover");
        localNewsPage.selectAndover();
        LocalNewsAndoverPage localNewsAndoverPage = new LocalNewsAndoverPage(driver);
        localNewsAndoverPage.verifyOnAndoverPage();

    }
}
