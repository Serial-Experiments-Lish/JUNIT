package org.junit.jupiter;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.DisplayName;

public class DivisionTest {
    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }

    @DisplayName("Testing the dividedNums method")
    @Test
    void dividedNumsTest() {
        assertEquals(111, Division.dividedNums());
    }
}