package com.mycompany.java_oop;

/**
 * PayPal keeps the Payment promise in its own way.
 * "implements Payment" = "I will provide pay()."
 * See LEARN_OOP.md — section 4.
 */
public class PayPal implements Payment {

    @Override // fulfilling the pay() method from the Payment interface
    public void pay() {
        System.out.println("Paid through PayPal");
    }

}
