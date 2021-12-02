import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;


public class SortableDataTables extends ActionsWithBrowser{

    @Test
    public void checkSortableDataTables(){
        browser.get("http://the-internet.herokuapp.com/tables");


        List<WebElement> SmithJohn = browser.findElements(By.xpath("//tbody/tr[1]/td"));
        for (WebElement element : SmithJohn) {
            assertEquals(SmithJohn.get(0).getText(), "Smith");
            assertEquals(SmithJohn.get(1).getText(), "John");
            assertEquals(SmithJohn.get(2).getText(), "jsmith@gmail.com");
            assertEquals(SmithJohn.get(3).getText(), "$50.00");
            assertEquals(SmithJohn.get(4).getText(), "http://www.jsmith.com");
            assertEquals(SmithJohn.get(5).getText(), "edit delete");
        }

        List<WebElement> BachFrank = browser.findElements(By.xpath("//tbody/tr[2]/td"));
        for (WebElement element : BachFrank) {
            assertEquals(BachFrank.get(0).getText(), "Bach");
            assertEquals(BachFrank.get(1).getText(), "Frank");
            assertEquals(BachFrank.get(2).getText(), "fbach@yahoo.com");
            assertEquals(BachFrank.get(3).getText(), "$51.00");
            assertEquals(BachFrank.get(4).getText(), "http://www.frank.com");
            assertEquals(BachFrank.get(5).getText(), "edit delete");
        }

        List<WebElement> DoeJason = browser.findElements(By.xpath("//tbody/tr[3]/td"));
        for (WebElement element : DoeJason) {
            assertEquals(DoeJason.get(0).getText(), "Doe");
            assertEquals(DoeJason.get(1).getText(), "Jason");
            assertEquals(DoeJason.get(2).getText(), "jdoe@hotmail.com");
            assertEquals(DoeJason.get(3).getText(), "$100.00");
            assertEquals(DoeJason.get(4).getText(), "http://www.jdoe.com");
            assertEquals(DoeJason.get(5).getText(), "edit delete");
        }
    }

}
