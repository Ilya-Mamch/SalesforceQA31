package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountListPage extends BasePage{

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    public AccountListPage open(){
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/list");
        return this;
    }

    @Override
    public AccountListPage isPageOpened(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='New']")));
        return this;
    }

    public NewAccountModal clickNew(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='New']")));
        driver.findElement(By.xpath("//a[@title='New']")).click();
        return new NewAccountModal(driver);
    }
}
