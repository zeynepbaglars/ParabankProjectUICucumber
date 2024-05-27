package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class Parent {

    public static ThreadLocal<String> changeIt = new ThreadLocal<>();

    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void sendKeysFunction(WebElement element, String str) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(str);
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilTextToBePresent(WebElement element, String str) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, str));
    }

    public void scrollToElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void verifyContainsTextFunction(WebElement element, String str) {
        waitUntilTextToBePresent(element, str);
        Assert.assertTrue(element.getText().toLowerCase().contains(str.toLowerCase()), "No such Text!!!");
    }

    public void verifyElementIsDisplayed(WebElement element) {
        waitUntilClickable(element);
        Assert.assertTrue(element.isDisplayed());

    }
}

