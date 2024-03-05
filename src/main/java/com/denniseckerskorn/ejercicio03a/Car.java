package com.denniseckerskorn.ejercicio03a;

public class Car implements IMotor {
    //Class atributes:
    private String modelo;

    //Constructor for the car:
    public Car(String modelo) {
        this.modelo = modelo;
    }

    //Method which implements startCar() from the interface IMotor:
    public void startCar() {
        System.out.println("The car " + modelo + " is starting ...");
    }
}
