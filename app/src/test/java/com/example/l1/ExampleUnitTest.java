package com.example.l1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test_min1() {
        Funct m = new Funct();
        assertEquals(m.mMin(6, 12), 6);
    }


    @Test
    public void test_min2() {
        Funct m = new Funct();
        assertEquals(m.mMin(-8, 3), -8);
    }

    @Test
    public void test_min3() {
        Funct m = new Funct();
        assertEquals(m.mMin(-3, -9), -9);
    }

    @Test
    public void test_max1() {
        Funct m = new Funct();
        assertEquals(m.mMax(19, 52), 52);
    }

    @Test
    public void test_max2() {
        Funct m = new Funct();
        assertEquals(m.mMax(0, -52), 0);
    }

    @Test
    public void test_max3() {
        Funct m = new Funct();
        assertEquals(m.mMax(-32, -6), -6);
    }
}