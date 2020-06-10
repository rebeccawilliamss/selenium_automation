package base;
import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LocalNewsPage;

public class TestMoreDropDown extends BaseTests {

    @Test
    public void testMoreDropDown(){
        HomePage homePage = new HomePage(driver);
        homePage.clickMoreDropDown();
        homePage.clickLocal();
        LocalNewsPage localNewsPage = new LocalNewsPage(driver);
        localNewsPage.verifyOnLocalNewsPage();
    }
}
