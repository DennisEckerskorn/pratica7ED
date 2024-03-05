package com.denniseckerskorn.ejercicio03b;

public class Driver {
    //Class which depends on Interface
    //Class atributes:
    private String name;

    //Constructor:
    public Driver(String name) {
        this.name = name;
    }

    //Method which depends on the interface IVehcile:
    public void driveCar(IVehicle vehicle) {
        System.out.println(name + " is driving the car ...");
        vehicle.drive();
    }
}
