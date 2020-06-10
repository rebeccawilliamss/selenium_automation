package base;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LocalNewsAndoverPage;
import pages.LocalNewsPage;

public class TestSearchingAndover extends BaseTests {

    @Test
    public void testSearchingForAndoverInLocalNews(){
        LocalNewsPage localNewsPage = new LocalNewsPage(driver);
        localNewsPage.searchForAndover("Andover");
        localNewsPage.selectAndover();
        LocalNewsAndoverPage localNewsAndoverPage = new LocalNewsAndoverPage(driver);

    }
}
