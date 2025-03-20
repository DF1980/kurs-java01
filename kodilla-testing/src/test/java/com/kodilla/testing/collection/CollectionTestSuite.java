package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTestSuite {
    @BeforeEach
    void beforeEach() {
        System.out.println("Starting test case...");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Test case finished.");
    }

    @Test
    void testOddNumbersExterminatorEmptyList() {
        // Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();

        // When
        List<Integer> result = exterminator.exterminate(emptyList);

        // Then
        assertEquals(0, result.size(), "The result list should be empty when input list is empty.");
    }

    @Test
    void testOddNumbersExterminatorNormalList() {
        // Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> normalList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);

        // When
        List<Integer> result;
        result = exterminator.exterminate(normalList);

        // Then
        assertEquals(expected, result, "The method should return only even numbers from the list.");
    }
}
