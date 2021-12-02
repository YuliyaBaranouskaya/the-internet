import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Typos extends ActionsWithBrowser {

    //Проверить соответствие параграфа орфографии
    @Test
    public void checkTypos(){
        browser.get("http://the-internet.herokuapp.com/typos");

        String text =  browser.findElement(By.className("example")).getText();
        assertEquals(text,"Typos\n" + "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" + "Sometimes you'll see a typo, other times you won't.",
                "Typos\n" + "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" + "Sometimes you'll see a typo, other times you won,t." );
    }
}
