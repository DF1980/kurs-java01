package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(5, 3);
        System.out.println("Test add(5, 3): " + (resultAdd == 8 ? "Test ok" : "Failed"));

        int resultSubtract = calculator.subtract(10, 4);
        System.out.println("Test subtract(10, 4): " + (resultSubtract == 6 ? "Test ok" : "Failed"));
    }
}
