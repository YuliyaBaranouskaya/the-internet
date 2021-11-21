import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class AddRemoveElements extends ActionsWithBrowser {

    @Test
    public void addRemoveElements(){
        browser.get("http://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton = browser.findElement(By.cssSelector("[onclick='addElement()']"));
        addButton.click();
        addButton.click();
        List <WebElement> deleteButton = browser.findElements(By.cssSelector("[onclick='deleteElement()']"));
        assertEquals(deleteButton.size(), 2, "Количество элементов не равно 2");

        deleteButton.get(1).click();
        deleteButton = browser.findElements(By.cssSelector("[onclick='deleteElement()']"));
        assertEquals(deleteButton.size(), 1, "Количество элементов не равно 1");
    }



}
