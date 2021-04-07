package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class MyMathTest {

    MyMath myMath = new MyMath();

    @Test
    void sum_with3nums() {
        assertEquals(6, myMath.sum(new int[] {1,2,3}));
    }

    @Test
    void sum_with1num(){
        assertEquals(7,myMath.sum(new int[] {7}));
    }
}