import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class Dropdown extends ActionsWithBrowser{

    @Test
    public void dropdownCheck(){
        // Взять все элементы дроп-дауна и проверить их наличие. Выбрать первый, проверить, что он выбран, выбрать второй, проверить, что он выбран
        //Локатор By.id(“dropdown”)
        browser.get("http://the-internet.herokuapp.com/dropdown");

        WebElement firstElement = browser.findElement(By.id("dropdown"));
        Select select = new Select(firstElement);
        select.selectByVisibleText("Option 1");
        String text = select.getFirstSelectedOption().getText();
        assertEquals(text, "Option 1");
        List<WebElement> option = select.getOptions();
        assertEquals(option.get(0).getText(), "Please select an option");
        assertEquals(option.get(1).getText(),"Option 1");
        assertEquals(option.get(2).getText(),"Option 2");

    }
}

