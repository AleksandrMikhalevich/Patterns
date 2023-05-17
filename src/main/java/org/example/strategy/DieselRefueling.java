package org.example.strategy;

/**
 * @author Alex Mikhalevich
 * @created 2023-04-18 15:44
 */
public class DieselRefueling implements Refueling {
    @Override
    public void doRefueling() {
        System.out.println("Refueling by diesel");
    }
}
