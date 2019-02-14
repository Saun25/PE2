package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome palindrome;
    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        palindrome=null;
    }

    @Test
    public void FirstPalindromeSuccess() {
        //Arrange
        boolean expectedValue = true;

        //Act
        boolean actualValue = palindrome.checkPalindrome("madam");
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }

    @Test
    public void SecondPalindromeSuccess() {
        //Arrange
        boolean expectedValue = true;

        //Act
        boolean actualValue = palindrome.checkPalindrome("123454321");
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }

    @Test
    public void firstPalindromeFailure() {
        //Arrange
        boolean expectedValue = false;

        //Act
        boolean actualValue = palindrome.checkPalindrome("1232");
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }

    @Test
    public void secondPalindromeFailure() {
        //Arrange
        boolean expectedValue = false;

        //Act
        boolean actualValue = palindrome.checkPalindrome(" ");
        //Assert
        assertEquals(expectedValue, actualValue);

        assertNotNull(actualValue);

    }
    }
}