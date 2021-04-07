package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
class MyMathTest {

    MyMath myMath = new MyMath();

    @BeforeEach
    public void before(){
        System.out.println("BEFORE");
    }

    @AfterEach
    public void after(){
        System.out.println("AFTER");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("BEFORE ALL");
    }
    @Test
    void sum_with3nums() {
        System.out.println("Test1");
        assertEquals(6, myMath.sum(new int[] {1,2,3}));
    }

    @Test
    void sum_with1num(){
        System.out.println("Test2");
        assertEquals(7,myMath.sum(new int[] {7}));
    }
}