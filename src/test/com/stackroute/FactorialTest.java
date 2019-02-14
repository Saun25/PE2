package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    Factorial factorial;
    @Before
    public void setUp() throws Exception {
        factorial = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        factorial = null;
    }

    @Test
    public void intFactorialSuccess() {
        assertEquals(new String[]{},factorial.intFactorial());
        assertNotNull(factorial.intFactorial());
    }

    @Test
    public void longFactorialSuccess() {
        assertEquals(new String[]{},factorial.longFactorial());
        assertNotNull(factorial.intFactorial());
    }
}