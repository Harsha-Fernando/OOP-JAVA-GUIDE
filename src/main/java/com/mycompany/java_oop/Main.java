package com.mycompany.java_oop;

/**
 * The stage where all the little OOP demos walk on.
 * Read LEARN_OOP.md while you step through this — sections 1–6.
 */
public class Main {

    public static void main(String[] args) {
        // 1) Class + object: blueprint Car → one living car1
        Car car1 = new Car();
        car1.drive();

        // 2) Constructor + encapsulation: born with a name, print via method
        var user = new User("Harsha");
        user.getUser();

        // 3–4) Inheritance + abstract class: Dog fills in Animal's makeSound()
        // (You can't do: new Animal("...") — Animal is abstract.)
        var dog = new Dog("German Shepard");
        dog.eat();
        dog.makeSound();

        // 5) Interface + polymorphism: both are "Payment", each pays differently
        Payment payment1 = new PayPal();
        Payment payment2 = new Stripe();

        payment1.pay();
        payment2.pay();

        // Your turn: finish the browser exercise in BrowserExercise.java (section 7).
    }

}
