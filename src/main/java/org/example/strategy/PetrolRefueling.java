package org.example.strategy;

/**
 * @author Alex Mikhalevich
 * @created 2023-04-18 15:43
 */
public class PetrolRefueling implements Refueling {
    @Override
    public void doRefueling() {
        System.out.println("Refueling by petrol");
    }
}
