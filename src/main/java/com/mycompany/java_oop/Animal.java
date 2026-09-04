package com.mycompany.java_oop;

/**
 * An *abstract* class: a blueprint that is intentionally unfinished.
 * You can share real code here (eat), and force kids to fill in the rest (makeSound).
 * You cannot write: new Animal("...") — only something more specific, like Dog.
 * See LEARN_OOP.md — sections 3 and 4.
 */
public abstract class Animal {

    // protected = subclasses like Dog can use this; strangers shouldn't.
    protected String breed;

    public Animal(String breed) {
        this.breed = breed;
    }

    // Real, shared behavior — every animal eats the same way (for now).
    void eat() {
        System.out.println(this.breed + " Eating ...");
    }

    // Abstract method: no body. Each concrete animal must write its own sound.
    abstract void makeSound();
}
