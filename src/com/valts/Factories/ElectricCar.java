package com.valts.Factories;

public class ElectricCar implements Car{

    public int speed = 0;

    @Override
    public void Accelerate(int accelInput) {
        speed = speed + accelInput * 2;
        System.out.println("speed is " + speed);
    }

    @Override
    public void Decelerate(int decelInput) {
        if (speed - decelInput > 0) {
            speed = speed - decelInput;
        } else  {
            speed = 0;
        }
        System.out.println("speed is " + speed);
    }
}
