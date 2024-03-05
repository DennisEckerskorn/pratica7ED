package com.denniseckerskorn.ejercicio03b;

public class Car implements IVehicle {
    //Class which implements the interface iVehicle:
    @Override
    public void drive() {
        System.out.println("Car is moving.");
    }
}
