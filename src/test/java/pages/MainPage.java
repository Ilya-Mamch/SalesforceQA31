package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

@Log4j2
public class MainPage extends BasePage {
    private final By CREATE_BUTTON = By.xpath("//*[text()='Create']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открыть main страницу")
    public MainPage openMain() {
        driver.get(MAIN_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CREATE_BUTTON));
        return this;
    }

    public MainPage isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(CREATE_BUTTON));
        } catch (TimeoutException e) {
            log.error(e.getMessage());
            Assert.fail("Page isn't opened");
        }
        return this;
    }
}
