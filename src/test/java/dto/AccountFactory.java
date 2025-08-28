package dto;

import com.github.javafaker.Faker;

public class AccountFactory {

    public static Account getAccount(String rating, String type, String ownership, boolean vipClient,
                                     boolean techMeSkills, String customerPriority, String sla) {
        Faker faker = new Faker();
        return new Account(
                faker.company().name(),
                faker.phoneNumber().phoneNumber(),
                faker.phoneNumber().phoneNumber(),
                rating,
                faker.company().url(),
                ownership,
                vipClient,
                techMeSkills,
                faker.address().streetAddress(),
                faker.address().streetAddress(),
                faker.address().city(),
                faker.address().state(),
                customerPriority,
                sla,
                faker.idNumber().valid(),
                faker.number().digit(),
                faker.lorem().sentence()
        );
    }

}
