package tests;

import dto.Car;
import org.testng.annotations.Test;

public class CarTest {

    @Test
    public void checkCar() {
        Car car = new Car.Builder()
                .model("BMW")
                .speed(230)
                .build();
    }
}
