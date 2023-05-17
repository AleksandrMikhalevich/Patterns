package org.example.strategy;

/**
 * @author Alex Mikhalevich
 * @created 2023-04-18 15:47
 */
public abstract class Car {

    public Refueling refueling;

    public Car(Refueling refueling) {
        this.refueling = refueling;
    }
}
