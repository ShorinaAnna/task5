package com.shorina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void pow() {
        assertEquals(4,new Calc().pow(2,2));
    }


    @Test
    void sqrt() {
        assertEquals(3,new Calc().sqrt(9));
    }

    @Test
    void nrt() {
        assertEquals(5, new Calc().nrt(125, 3));
    }

    @Test
    void sqr() {
        assertEquals(49, new Calc().sqr( 7));
    }

    @Test
    void getFactorial() {
        assertEquals(120, new Calc().getFactorial( 5));
    }

    @Test
    void square_root() {
        assertEquals("roots: x1 = " + 8.0 + ", x2 = " + -1.0, new Calc().square_root( -1 ,7,8));
        assertEquals("one root: x = " + -0.5, new Calc().square_root( 4 ,4,1));
        assertEquals("no roots", new Calc().square_root( 2 ,1,1));
    }
}