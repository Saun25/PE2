package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrequencyTest {

    Frequency frequency;
    @Before
    public void setUp() throws Exception {
        frequency = new Frequency();
    }

    @After
    public void tearDown() throws Exception {
        frequency = null;
    }
    //enter the path of your file
    @Test
    public void checkFrequency() {
        assertArrayEquals(new String[]{},frequency.checkFrequency(""));
    }
}