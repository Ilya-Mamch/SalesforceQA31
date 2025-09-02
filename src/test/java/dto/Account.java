package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Account {

    String name;
    @Builder.Default
    String phone = "";
    @Builder.Default
    String fax = "";
    @Builder.Default
    String rating = "--None--";
    String website;
    String ownership;
    boolean vipClient;
    boolean techMeSkills;
    String billingStreet;
    String shippingStreet;
    String billingCity;
    String billingState;
    String customerPriority;
    String sla;
    String serialNumber;
    String locationNumber;
    String description;
}
