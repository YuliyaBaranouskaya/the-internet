import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class DynamicControls extends ActionsWithBrowser{
    @Test
    public void dynamicControls(){
        browser.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement findCheckbox = browser.findElement(By.id("checkbox"));
        browser.findElement(By.cssSelector("[onclick=\"swapCheckbox()\"]")).click();

        WebDriverWait wait = new WebDriverWait(browser, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));

        browser.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        int count = browser.findElements(By.cssSelector("[type=checkbox]")).size();
        assertEquals(count, 0, "element's found");
        browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement input = browser.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
        assertFalse(input.isEnabled(), "input's enabled");

        WebElement findEnableButton = browser.findElement(By.cssSelector("[onclick=\"swapInput()\"]"));
        findEnableButton.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));

        assertTrue(input.isEnabled(), "input's disabled");
    }
}
