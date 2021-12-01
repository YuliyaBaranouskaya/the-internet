import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Frames extends ActionsWithBrowser{
    @Test
    public void frames(){
        browser.get("http://the-internet.herokuapp.com/frames");

        browser.findElement(By.xpath("//*[@class=\"example\"]//a[contains(text(), 'iFrame')]")).click();
        browser.switchTo().frame(browser.findElement(By.id("mce_0_ifr")));

        WebElement p = browser.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
        String valueOfParagraph = p.getText();
        assertEquals(valueOfParagraph,"Your content goes here.","wrong text");
    }
}
