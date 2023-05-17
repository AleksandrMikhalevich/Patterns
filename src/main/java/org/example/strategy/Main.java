package org.example.strategy;

/**
 * @author Alex Mikhalevich
 */
public class Main {
    public static void main(String[] args) {
        Car electroCar = new ElectroCar(new ElectroRefueling());
        electroCar.refueling.doRefueling();

        Car petrolCar = new PetrolCar(new PetrolRefueling());
        petrolCar.refueling.doRefueling();

        Car dieselCar = new DieselCar(new DieselRefueling());
        dieselCar.refueling.doRefueling();
    }
}