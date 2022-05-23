package org.junit.jupiter;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.DisplayName;

public class MethodReturnTypesTest {
    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }

    @DisplayName("To assert the variable num1 is not null")
    @Test
    void testVariable(Object num1) {
        assertNotNull(num1);
    }
}