package com.denniseckerskorn.ejercicio07;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Calculadora de Area - Seleccione una opción:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    Figura circle = new Circle();
                    circle.calculateArea();
                    break;
                case 2:
                    Figura square = new Square();
                    square.calculateArea();
                    break;
                case 3:
                    Figura triangle = new Triangle();
                    triangle.calculateArea();
                    break;
                case 4:
                    Figura rectangle = new Rectangle();
                    rectangle.calculateArea();
                    break;
                case 5:
                    Figura pentagon = new Pentagon();
                    pentagon.calculateArea();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 0);
        scanner.close();    }
}
