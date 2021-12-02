import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessages extends ActionsWithBrowser {

    @Test
    public void checkNotification() {
        browser.get("http://the-internet.herokuapp.com/notification_message_rendered");

        WebElement clickNotification = browser.findElement(By.xpath("//a[contains(text(),'Click here')]"));
        clickNotification.click();
        WebElement notification = browser.findElement(By.xpath("//div[@id='flash']"));
        String actionSuccessful = "Action successful";
        Assert.assertEquals(notification.getText().substring(0, actionSuccessful.length()), actionSuccessful);
    }
}
