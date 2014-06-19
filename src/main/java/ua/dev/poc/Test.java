package ua.dev.poc;

import java.io.IOException;
import java.util.List;

/**
 * Created by 1 on 18.06.2014.
 */
public interface Test {

    /**
     * Asserts that value is not null
     * @param message report message
     * @param value object
     */
    void assertNotNull(String message, Object value);

    void assertTrue(String message, boolean condition);

    /**
     * Asserts equality of two lists
     * @param message report message
     * @param expected expected list
     * @param actual actual list
     */
    void assertListEquals(String message, List<?> expected, List<?> actual);

    /**
     * Asserts equality of two strings
     * @param message report message
     * @param expected expected string
     * @param actual actual string
     */
    void assertEquals(String message, String expected, String actual);

    /**
     * Asserts equality of two doubles
     * @param message report message
     * @param expected expected double
     * @param actual actual double
     */
    void assertEquals(String message, double expected, double actual);

    /**
     * Asserts equality of two floats
     * @param message report message
     * @param expected expected float
     * @param actual actual float
     */
    void assertEquals(String message, float expected, float actual);

    /**
     * Asserts equality of two long values
     * @param message report message
     * @param expected expected long value
     * @param actual actual long value
     */
    void assertEquals(String message, long expected, long actual);

    /**
     * Asserts equality of two short value
     * @param message report message
     * @param expected expected short value
     * @param actual actual short value
     */
    void assertEquals(String message, short expected, short actual);

    /**
     * Asserts equality of two chars
     * @param message report message
     * @param expected expected char
     * @param actual actual char
     */
    void assertEquals(String message, char expected, char actual);

    /**
     * Asserts equality of two bytes
     * @param message report message
     * @param expected expected byte
     * @param actual actual byte
     */
    void assertEquals(String message, byte expected, byte actual);
}
