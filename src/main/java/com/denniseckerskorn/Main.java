package com.denniseckerskorn;

import com.denniseckerskorn.ejercicio03b.Car;
import com.denniseckerskorn.ejercicio03b.Driver;

public class Main {
    public static void main(String[] args) {
        //Instance of Driver:
        Driver driver = new Driver("Pepe");
        //Instance of Car:
        Car car = new Car();
        driver.driveCar(car);
    }
}
