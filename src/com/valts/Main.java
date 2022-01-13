package com.valts;

import com.valts.Factories.Car;
import com.valts.Factories.CarFactory;

public class Main {

    public static void main(String[] args) {
        CarFactory car1 = new CarFactory("gas");
        car1.Accelerate(50);
        car1.Decelerate(25);

        CarFactory car2 = new CarFactory("electric");
        car2.Accelerate(15);
        car2.Decelerate(50);

        CarFactory car3 = new CarFactory("adfs");
    }
}
