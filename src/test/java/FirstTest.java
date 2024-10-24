import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FirstTest {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    @Test
    public void myFirstTest() throws InterruptedException {
        driver.navigate().to("https://sqlbolt.com/");


        String pageTitle = driver.getTitle();
        assertTrue(pageTitle.contains("SQLBolt"));
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}