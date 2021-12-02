import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Inputs extends ActionsWithBrowser{
    // Проверить на возможность ввести различные цифровые и нецифровые значения, используя Keys.ARROW_UP  И Keys.ARROW_DOWN
    @Test
    public void checkinputsDown(){
        browser.get("http://the-internet.herokuapp.com/inputs");

        WebElement input = browser.findElement(By.tagName("input"));

        input.sendKeys("1");
        input.sendKeys(Keys.ARROW_DOWN);
        String textDown = input.getAttribute("value");
        assertEquals(textDown,"0");
        input.clear();
    }
    @Test
    public void checkinputsUp(){
        browser.get("http://the-internet.herokuapp.com/inputs");

        WebElement input = browser.findElement(By.tagName("input"));

        input.sendKeys("-1");
        input.sendKeys(Keys.ARROW_UP);
        String textUp = input.getAttribute("value");
        assertEquals(textUp,"0");
        input.clear();
    }
    @Test
    public void checkinputsletters(){
        browser.get("http://the-internet.herokuapp.com/inputs");

        WebElement input = browser.findElement(By.tagName("input"));

        input.sendKeys("aaa");
        String textLetters = input.getAttribute("value");
        assertEquals(textLetters,"");
    }

}
