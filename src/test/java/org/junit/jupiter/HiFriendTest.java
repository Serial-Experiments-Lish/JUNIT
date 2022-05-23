package org.junit.jupiter;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.DisplayName;

/**
 * Unit test for simple App.
 */
public class HiFriendTest 
{
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }

    @Test
    @DisplayName("Testing to see if expected matches actual with friendHi() method")
    void debutFriendTest() {
        assertEquals("Hi Peter Dinkleberg!", HiFriend.friendHi());
    }
}
