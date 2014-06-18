package ua.dev.poc.test;

import ua.dev.poc.TestCase;
import ua.dev.poc.annotations.TestMethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SimpleTest extends TestCase {

    @TestMethod
    public void testDoubles() {
        double a = 1.5;
        double b = 0.9;
        assertEquals("Test", a, b);
    }

    @TestMethod
    public void testLong() {
        long a = 1L;
        long b = 1L;
        assertEquals("Test", a, b);
    }

    @TestMethod
    public void testFloat() {
        float a = 0.2f;
        float b = 0.21f;
        assertEquals("Test", a, b);
    }

    @TestMethod
    public void testShort() {
        short a = 2;
        short b = 2;
        assertEquals("Test", a, b);
    }

    @TestMethod
    public void testListEquality(){
        List<String> data1 = new ArrayList<String>();
        data1.add("a");
        List<String> data2 = new ArrayList<String>();
        data2.add("a");
        assertListEquals("Test", data1,data2);
    }
}
