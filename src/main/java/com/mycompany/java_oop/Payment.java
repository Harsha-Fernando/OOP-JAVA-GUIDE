package com.mycompany.java_oop;

/**
 * An interface is a promise, not a full class.
 * "If you are a Payment, you must know how to pay()."
 * It does not say *how* — PayPal and Stripe each decide that.
 * See LEARN_OOP.md — section 4: Interfaces and Polymorphism.
 */
public interface Payment {

    void pay();

}
