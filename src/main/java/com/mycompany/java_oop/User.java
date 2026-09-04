package com.mycompany.java_oop;

/**
 * Encapsulation in action: the username stays private,
 * and outsiders talk to this object through methods.
 * See LEARN_OOP.md — section 2: Constructors and Encapsulation.
 */
public class User {

    // private = "don't poke this field from outside; use our methods."
    private String username;

    // Constructor: runs when you write new User("...").
    // this.username means "the field on *this* object," not the parameter.
    public User(String username) {
        this.username = username;
    }

    public void getUser() {
        System.out.println("User Name = " + username);
    }

}
