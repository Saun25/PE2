package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {

    Power power;
    @Before
    public void setUp() throws Exception {
        power = new Power();
    }

    @After
    public void tearDown() throws Exception {
        power = null;
    }

    @Test
    public void firstCheckPowerSuccess() {
        assertEquals(true,power.checkPower(256));
        assertNotNull(power.checkPower(256));
    }

    @Test
    public void secondCheckPowerSuccess() {
        assertEquals(true,power.checkPower(64));
        assertNotNull(power.checkPower(64));
    }
    @Test
    public void firstCheckPowerFailure() {
        assertEquals(false,power.checkPower(201));
        assertNotNull(power.checkPower(201));
    }
    @Test
    public void secondCheckPowerFailure() {
        assertEquals(true,power.checkPower(561));
        assertNotNull(power.checkPower(561));
    }

}