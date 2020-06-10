package base;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;

public class TestSignIn extends BaseTests {

    @Test
    public void testSignIn() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.setUsername("rebecca.williams18@yahoo.co.uk");
        signInPage.setPassword("Jasmine11");
        signInPage.clickSignIn();
        assertTrue(homePage.verifyReturnToHomepage().contains("Home"));
    }
}
