package steps;

import dto.Account;
import org.openqa.selenium.WebDriver;
import pages.AccountListPage;
import pages.AccountPage;
import pages.NewAccountModal;

public class AccountStep {

    AccountListPage accountListPage;
    NewAccountModal newAccountModal;
    AccountPage accountPage;

    public AccountStep(WebDriver driver) {
        accountListPage = new AccountListPage(driver);
        newAccountModal = new NewAccountModal(driver);
        accountPage = new AccountPage(driver);
    }

    public void createAccount(Account account) {
        accountListPage.open()
                .clickNew()
                .isPageOpened()
                .createAccount(account)
                .saveAccount()
                .isPageOpened()
                .checkNotification();
    }
}
