package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> liczby) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : liczby) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
