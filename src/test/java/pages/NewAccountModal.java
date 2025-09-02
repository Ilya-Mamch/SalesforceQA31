package pages;

import dto.Account;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import wrappers.CheckBox;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.TextArea;

@Log4j2
public class NewAccountModal extends BasePage {

    private final By BUTTON = By.xpath("//button[@name='SaveEdit']");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    public NewAccountModal createAccount(Account account) {
        new Input(driver, "Account Name").write(account.getName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Website").write(account.getWebsite());
        new Picklist(driver, "Ownership").select(account.getOwnership());
        new Picklist(driver, "Rating").select(account.getRating());
        new CheckBox(driver, "VIP Client").pick(account.isVipClient());
        new CheckBox(driver, "TeachMeSkills").pick(account.isTechMeSkills());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").write(account.getBillingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingState());
        new Picklist(driver, "Customer Priority").select(account.getCustomerPriority());
        new Picklist(driver, "SLA").select(account.getSla());
        new Input(driver, "SLA Serial Number").write(account.getSerialNumber());
        new Input(driver, "Number of Locations").write(account.getLocationNumber());
        new TextArea(driver, "Description").write(account.getDescription());
        return this;
    }

    @Step("Open page for create new account")
    public NewAccountModal open(){
        driver.get(NEW_ACCOUNT_URL);
        return this;
    }

    @Step("New account_page is opened")
    public NewAccountModal isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON));
        } catch (TimeoutException e) {
            log.error(e.getMessage());
            Assert.fail("Page isn't opened");
        }
        return this;
    }

    @Step("Save account")
    public AccountPage saveAccount(){
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        return new AccountPage(driver);
    }
}
