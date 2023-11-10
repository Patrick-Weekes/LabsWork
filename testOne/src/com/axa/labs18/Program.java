package com.axa.labs18;

public class Program {

	public static void processCars(Car[] cars) {
        for (Car c : cars) {
            // Get each car up to 60 MPH
            c.getToSixty();

            // Accelerate each car for 2 seconds
            c.accelerate(2);

            // Display details of each car
            System.out.println("Model: " + c.getModel());
            System.out.println("Speed: " + c.getSpeed() + " MPH");

            // Display driver's name if the car is a RacingCar
            if (c instanceof RacingCar) {
                RacingCar racingCar = (RacingCar) c;
                System.out.println("Driver: " + racingCar.getDriver());
            }

            System.out.println("------------------");
        }
    }

    public static void main(String[] args) {
        // Create an array of Cars
        Car[] cars = new Car[3];
        cars[0] = new Car("Toyota");
        cars[1] = new RacingCar("Ferrari", "Lewis Hamilton", 2);
        cars[2] = new Car("Ford");

        // Process the array of cars
        processCars(cars);
    }

}
