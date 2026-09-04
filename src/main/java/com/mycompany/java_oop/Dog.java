package com.mycompany.java_oop;

/**
 * Dog *is an* Animal — that's what "extends" means.
 * We reuse eat(), and we *must* fill in makeSound() because Animal left it abstract.
 * See LEARN_OOP.md — sections 3 and 4.
 */
public class Dog extends Animal {

    public Dog(String breed) {
        // Hand the breed up to Animal's constructor so it can set things up.
        super(breed);
    }

    @Override
    void makeSound() {
        System.out.println(this.breed + " Barking ...");
    }

}
