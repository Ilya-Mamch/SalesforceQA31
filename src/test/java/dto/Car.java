package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {

    private String model;
    private int speed;

    private Car(Builder builder) {
        this.model = builder.model;
        this.speed = builder.speed;
    }

    public static class Builder {
        private String model;
        private int speed;

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
