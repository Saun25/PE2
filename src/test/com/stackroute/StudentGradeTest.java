package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {

    StudentGrade student;
    @Before
    public void setUp() throws Exception {
        student = new StudentGrade();
    }

    @After
    public void tearDown() throws Exception {
        student = null;
    }

    @Test
    public void calculateSuccess() {
        int[] grade={86,65,98,77};
        assertEquals( new double[]{81.00,65.00,98.00},student.calculate(4, grade));
        assertNotNull(student.calculate(4,grade));
    }

    @Test
    public void calculateFAilure() {
        int[] grade={86,65,98,77};
        assertEquals( new double[]{71.00,55.00,94.00},student.calculate(4, grade));
        assertNotNull(student.calculate(4,grade));
    }
}