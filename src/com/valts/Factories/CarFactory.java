package com.valts.Factories;

public class CarFactory {
    public Car car;

    private CarFactory() {
    }

    public CarFactory(String type) {
        if (type == "gas") {
            this.car = new GasCar();
        } else if (type == "electric") {
            this.car = new ElectricCar();
        } else {
            System.out.println("Wrong type");
        }
    }

    public void Accelerate(int accelInput) {
        car.Accelerate(accelInput);
    }

    public void Decelerate(int decelInput) {
        car.Decelerate(decelInput);
    }


}
