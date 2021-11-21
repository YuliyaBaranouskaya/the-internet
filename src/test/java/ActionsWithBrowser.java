import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ActionsWithBrowser {
    WebDriver browser;

    @BeforeTest
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        browser = new ChromeDriver();
    }

    @AfterTest
    public void closeBrowser() {
        browser.quit();
    }
}
