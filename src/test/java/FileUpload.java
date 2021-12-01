import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUpload extends ActionsWithBrowser {
    @Test
    public void fileUpload() {
        browser.get("http://the-internet.herokuapp.com/upload");
        browser.findElement(By.id("file-upload")).sendKeys("C:/Users/avbar/Documents/test.jpg");
        browser.findElement(By.id("file-submit")).click();
        WebDriverWait wait = new WebDriverWait(browser, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));
        assertEquals(browser.findElement(By.id("uploaded-files")).getText(), "test.jpg", "file wasn't uploaded");
    }
}
