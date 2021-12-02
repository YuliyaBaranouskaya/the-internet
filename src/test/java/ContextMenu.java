import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContextMenu extends ActionsWithBrowser{
    @Test
    public void contextMenu(){
        browser.get("http://the-internet.herokuapp.com/context_menu");
        WebElement click = browser.findElement(By.id("hot-spot"));
        Actions actions = new Actions(browser);
        actions.moveToElement(click).contextClick().perform();

        Alert alert = browser.switchTo().alert();
        assertEquals(alert.getText(), "You selected a context menu", "Text from alert don't contains expected text");
        alert.accept();
    }
}
