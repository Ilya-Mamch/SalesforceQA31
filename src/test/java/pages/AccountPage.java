package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountPage extends BasePage {

    private final By MESSAGE = By.cssSelector("div[data-key='success']");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @Step("AccountPage is opened")
    public AccountPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MESSAGE));
        return this;
    }

    @Step("Проверка сообщения о создании аккаунта")
    public boolean checkNotification() {
        String notification = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.cssSelector("div[data-key='success']"))).getText();
        return notification.contains("Account") && notification.contains("was created");
    }
}
