package com.shorina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void pow() {
        assertEquals(4,new Calc().pow(2,2));
    }
}