import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import static org.testng.Assert.*;

public class Checkboxes extends ActionsWithBrowser {

    @Test
    public void checkCheckboxes(){
        //роверить, что первый чекбокс unchecked, отметить первый чекбокс, проверить что он checked. Проверить, что второй чекбокс checked, сделать unheck, проверить, что он unchecked
        //Локатор By.cssSelector(“[type=checkbox]”)
        browser.get("http://the-internet.herokuapp.com/checkboxes");

        List <WebElement> elems = browser.findElements(By.cssSelector("[type=checkbox]"));
        assertFalse(elems.get(0).isSelected());
        elems.get(0).click();
        assertTrue(elems.get(0).isSelected());
        assertTrue(elems.get(1).isSelected());
        elems.get(1).click();
        assertFalse(elems.get(1).isSelected());
    }

}
