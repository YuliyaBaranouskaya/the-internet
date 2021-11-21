import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NotificationMessages extends ActionsWithBrowser {

    @Test
    public void checkNotification(){
        browser.get("http://the-internet.herokuapp.com/notification_message_rendered");

        WebElement clickNotification = browser.findElement(By.xpath("//a[contains(text(),'Click here')]"));
        clickNotification.click();
        WebElement notification = browser.findElement(By.xpath("//div[@id='flash']"));
        String actualResult = notification.getText();

        if (actualResult.equals("Action unsuccesful, please try again")) {
            clickNotification.click();
            assertEquals(actualResult, "Action successful");
        }
        if (actualResult.equals("Action successful")) {
            assertEquals(actualResult, "Action successful");
        }
    }
}
