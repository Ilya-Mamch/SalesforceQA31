package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    WebDriver driver;
    WebDriverWait wait;
    public final String BASE_URL = "https://tms9-dev-ed.develop.my.salesforce.com/";
    public final String MAIN_URL = "https://tms9-dev-ed.develop.lightning.force.com/lightning/setup/SetupOneHome/home";
    public final String NEW_ACCOUNT_URL = BASE_URL + "lightning/o/Account/new";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].click();", element);
    }

    public void waitForPageLoaded() {
        new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver)
                        .executeScript("return document.readyState")
                        .toString().equals("complete");
            }
        };
    }

    public abstract BasePage isPageOpened();
//    public abstract BasePage open();
}
