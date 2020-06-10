package base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class BaseTests {

    static WebDriver driver;


    @BeforeTest
    public void SetUp(){


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\R2Williams\\IdeaProjects\\Automation\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://bbc.co.uk/news");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
