package tests;

import dto.Account;
import dto.AccountFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    @Test
    public void checkCreateAccount() throws InterruptedException {

        Account account = new Account("QA31", "+432123423424", "+342232352542", "Cold",
                "QA31.com", "Public", true, true, "Vostok",
                "Sedykh", "Minsk", "Minsk region", "Low", "Silver",
                "12344321", "4", "Test example one");
        Account account1 = AccountFactory.getAccount("Warm", "Other", "Public",
                true, true, "Low", "Gold");

        loginStep.auth("tborodich@tms.sandbox", "Password003!");
        accountStep.createAccount(account1);

//        loginPage.open()
//                .open()
//                .login("tborodich@tms.sandbox", "Password003!");
//        accountListPage.open()
//                .clickNew()
//                .isPageOpened()
//                .createAccount(account1)
//                .saveAccount()
//                .isPageOpened()
//                .checkNotification();
    }
}
