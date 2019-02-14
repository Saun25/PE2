package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    Member member;
    Member.MemberVariable member2;
    @Before
    public void setUp() throws Exception {
        member = new Member();
        member2 = member. new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        member = null;
        member2 = null;
    }
    @Test
    public void initializeTest(){
        assertArrayEquals(new String[]{},member2.initializeVariable("Harry Potter",30,2500.3));
        assertNotNull(member2.initializeVariable("Harry Potter",30,2500.3));
    }
}