import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class Hovers extends ActionsWithBrowser{

//Сделать цепочку из действий: наведение на профиль, проверка имени, клик по ссылке, проверка что нет 404 ошибки. Повторить для каждого из профилей.
// Использовать класс Actions и https://stackoverflow.com/questions/17293914/how-to-perform-mouseover-function-in-selenium-webdriver-using-java
    @Test
    public void checkFirstHover(){
        browser.get("http://the-internet.herokuapp.com/hovers");
        WebElement firstUser = browser.findElement(By.cssSelector("#content > div > div:nth-child(3) > img"));
        Actions hoverClick = new Actions(browser);
        hoverClick.moveToElement(firstUser).build().perform();
        WebElement firstUserName = browser.findElement(By.xpath("//h5[text()='name: user1']"));
        assertTrue(firstUserName.isDisplayed());
        WebElement viewProfileUser = browser.findElement(By.linkText("View profile"));
        hoverClick.moveToElement(viewProfileUser).click().perform();
        WebElement name = browser.findElement(By.tagName("h1"));
        String actualResult2 = name.getText();
        assertEquals(actualResult2, "Not Found");
    }

    @Test
    public void checkSecondHover(){
        browser.get("http://the-internet.herokuapp.com/hovers");
        WebElement secondUser = browser.findElement(By.cssSelector("#content > div > div:nth-child(4) > img"));
        Actions hoverClick = new Actions(browser);
        hoverClick.moveToElement(secondUser).build().perform();
        WebElement secondUserName = browser.findElement(By.xpath("//h5[text()='name: user2']"));
        assertTrue(secondUserName.isDisplayed());
        WebElement viewProfileUser = browser.findElement(By.linkText("View profile"));
        hoverClick.moveToElement(viewProfileUser).click().perform();
        WebElement name = browser.findElement(By.tagName("h1"));
        String actualResult2 = name.getText();
        assertEquals(actualResult2, "Not Found");
    }

    @Test
    public void checkThirdHover(){
        browser.get("http://the-internet.herokuapp.com/hovers");
        WebElement thirdUser = browser.findElement(By.cssSelector("#content > div > div:nth-child(5) > img"));
        Actions hoverClick = new Actions(browser);
        hoverClick.moveToElement(thirdUser).build().perform();
        WebElement thirdUserName = browser.findElement(By.xpath("//h5[text()='name: user3']"));
        assertTrue(thirdUserName.isDisplayed());
        WebElement viewProfileUser = browser.findElement(By.linkText("View profile"));
        hoverClick.moveToElement(viewProfileUser).click().perform();
        WebElement name = browser.findElement(By.tagName("h1"));
        String actualResult2 = name.getText();
        assertEquals(actualResult2, "Not Found");
    }
}
