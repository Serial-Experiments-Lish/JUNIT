package org.junit.jupiter;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

public class AppBookTest {
    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }

    @Test
    @DisplayName("To test the method getBookTitle() and deem it not null")
    void notNull() {
        assertNotNull(Book.getBookTitle());
    }
}