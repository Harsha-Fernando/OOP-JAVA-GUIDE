package com.mycompany.java_oop;

/**
 * Another way to keep the same Payment promise.
 * Same method name (pay), different behavior — that's the point.
 * See LEARN_OOP.md — section 4.
 */
public class Stripe implements Payment {

    @Override
    public void pay() {
        System.out.println("Paid through Stripe");
    }
}
